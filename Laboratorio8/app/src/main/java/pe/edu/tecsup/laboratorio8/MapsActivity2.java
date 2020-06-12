package pe.edu.tecsup.laboratorio8;

import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import okhttp3.Challenge;
import pe.edu.tecsup.laboratorio8.models.Direccion;
//import pe.edu.tecsup.laboratorio8.models.ResponsePlace;
import pe.edu.tecsup.laboratorio8.models.Result;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MapsActivity2 extends FragmentActivity implements OnMapReadyCallback {

    private static final int REQUEST_CODE_ASK_PERMISSIONS = 100;

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps2);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override

    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;



        RestApi client = ServiceGenerator.createService(RestApi.class);
        Call<Direccion> call = client.getDataMarkers("-12.046373,-77.042755", "50000","restaurant", "pollo%20a%20la%20brasa", "AIzaSyAn8DpxSG8yU35XhtDeS5R_eMvBI8XXm2g");
        call.enqueue(new Callback<Direccion>() {
            @Override
            public void onResponse(Call<Direccion> call, Response<Direccion> response) {
               for (Result result : response.body().getResults()){
                   LatLng markerLocation = new LatLng(
                           result.getGeometry().getLocation().getLat(),
                           result.getGeometry().getLocation().getLng());
                   String markerTitle = result.getName();

                   mMap.addMarker(new MarkerOptions().position(markerLocation).title(markerTitle));
               }
            }

            @Override
            public void onFailure(Call<Direccion> call, Throwable t) {
                Toast.makeText(MapsActivity2.this, "no pudimos recuperar ese pollo",
                        Toast.LENGTH_SHORT).show();
                Log.e(this.getClass().getName(),t.getMessage());

            }
        });


    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        if(REQUEST_CODE_ASK_PERMISSIONS == requestCode) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                mMap.setMyLocationEnabled(true);
                mMap.getUiSettings().setMyLocationButtonEnabled(true);
            } else {
                Toast.makeText(this, "No concedió los permisos :(", Toast.LENGTH_SHORT).show();
            }
        }else{
            super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }
}