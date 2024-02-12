package com.example.fragmenttry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;

public class OriolaActivity2 extends AppCompatActivity {

    private TextView updateTextView;
    private DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oriola2);

        updateTextView = findViewById(R.id.activity2textView2);
        datePicker = findViewById(R.id.datePicker);

        datePicker.setOnDateChangedListener((view, year, monthOfYear, dayOfMonth) -> {
            String date = dayOfMonth + "/" + (monthOfYear + 1) + "/" + year;
            updateTextView.setText(date);
        });
    }

}