package marcelobaldi.livedata01;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import marcelobaldi.livedata01.view.ClienteActivity;

public class MainActivity extends AppCompatActivity {

    @Override protected void onCreate(Bundle savedInstanceState){super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intentX = new Intent(this, ClienteActivity.class);
        startActivity(intentX);
        //startActivity(new Intent(this, ClienteListaActivity.class));
    }

}


