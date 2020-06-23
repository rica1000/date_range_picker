package com.example.testimport;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Calendar;

import ru.slybeaver.slycalendarview.SlyCalendarDialog;

public class MainActivity extends AppCompatActivity implements SlyCalendarDialog.Callback{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new SlyCalendarDialog()
                        .setLang("ar")
                        .setSingle(false)
                        .setFirstMonday(false)
                        .setCallback(MainActivity.this)
                        .show(getSupportFragmentManager(), "TAG_SLYCALENDAR");
            }
        });
    }

    @Override
    public void onCancelled() {

    }

    @Override
    public void onDataSelected(Calendar firstDate, Calendar secondDate, int hours, int minutes) {

    }
}
