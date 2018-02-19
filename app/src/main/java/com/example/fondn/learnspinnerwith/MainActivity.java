package com.example.fondn.learnspinnerwith;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {

    Spinner spinner;



    private boolean isSelect = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String[] name = getResources().getStringArray(R.array.country);
        int[] flags = {R.drawable.a,R.drawable.c,R.drawable.bangladesh,R.drawable.b};
        String[] des =getResources().getStringArray(R.array.des);
        CustomAdapter customAdapter;

        spinner = (Spinner) findViewById(R.id.spinnerID);
        customAdapter = new CustomAdapter(getApplicationContext(),name,des,flags);
        spinner.setAdapter(customAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if(isSelect == true){
                    isSelect = false;
                }
                else{
                    Toast.makeText(MainActivity.this, "You Cliked: "+name[position], Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
