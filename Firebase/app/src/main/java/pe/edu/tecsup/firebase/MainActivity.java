package pe.edu.tecsup.firebase;

import androidx.appcompat.app.AppCompatActivity;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.facebook.login.LoginManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        Log.d(TAG, "user: " + user);

        // Obtain the FirebaseAnalytics instance.
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        Bundle bundle = new Bundle();
        bundle.putString("fullname", "Carlos Huaynates");
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.APP_OPEN, bundle);

        mFirebaseAnalytics.setUserProperty("username", "chuaynates");
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_logout:
                callLogout(null);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void callLogout(View view){
        Log.d(TAG, "Ssign out user");
        FirebaseAuth.getInstance().signOut();
        LoginManager.getInstance().logOut();
        finish();
    }

}
