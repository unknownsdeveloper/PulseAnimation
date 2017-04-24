package ankit.developer.unknowns.pulseanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import pl.bclogic.pulsator4droid.library.PulsatorLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PulsatorLayout pulsatorLayout = (PulsatorLayout)findViewById(R.id.pulsator);
        pulsatorLayout.start();
    }
}
