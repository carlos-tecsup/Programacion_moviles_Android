package pe.edu.tecsup.laboratorio8;

import pe.edu.tecsup.laboratorio8.models.Direccion;
//import pe.edu.tecsup.laboratorio8.models.ResponsePlace;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RestApi {

    @GET("nearbysearch/json")
    Call <Direccion>  getDataMarkers(@Query("location") String location,
                                     @Query("radius") String radius,
                                     @Query("type") String type,
                                     @Query("keyword") String keyword,
                                     @Query("key") String key);
}
