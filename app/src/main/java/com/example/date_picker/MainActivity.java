package com.example.date_picker;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity 
{
    TimePicker timePicker;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timePicker = findViewById(R.id.timing);
        textView = findViewById(R.id.textview);

        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener()
        {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) 
            {
                textView.setText("Hour: " +hourOfDay +" " +minute);
            }
        });
    }
}
