package com.example.atiq.locationtest002;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//import com.google.android.gms.location.places.Place;
//import com.google.android.gms.location.places.ui.PlacePicker;
import com.google.android.gms.location.places.Place; // "Place" is not resolved
import com.google.android.gms.location.places.ui.PlacePicker; // "ui" is not resolved
import com.google.android.gms.maps.model.LatLng;

public class MainActivity extends AppCompatActivity {

    private final int REQUEST_CODE_PLACEPICKER = 1;
    private final static int PLACE_PICKER_REQUEST = 999;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button gotoButton = (Button) findViewById(R.id.button);

        gotoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startPlacePickerActivity();
            }
        });

    }


    private void startPlacePickerActivity(){
        //Plac
        //PlacePicker.
    }





}
