package com.example.digitalcontent_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.Spinner;

public class User_Information extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user__information);

        EditText user_name = findViewById(R.id.user_name);
        EditText user_year = findViewById(R.id.user_year);
        EditText user_day = findViewById(R.id.user_day);
        EditText user_disease = findViewById(R.id.user_disease);
        EditText user_record = findViewById(R.id.user_record);
        EditText user_allergy = findViewById(R.id.user_allergy);
        EditText user_blood = findViewById(R.id.user_blood);
        EditText user_height = findViewById(R.id.user_height);
        EditText user_weight = findViewById(R.id.user_weight);
        Spinner user_month = (Spinner)findViewById(R.id.user_month);

        String name = user_name.getText().toString().trim();
        String year = user_year.getText().toString().trim();
        String day = user_day.getText().toString().trim();
        String disease = user_disease.getText().toString().trim();
        String record = user_record.getText().toString().trim();
        String allergy = user_allergy.getText().toString().trim();
        String blood = user_blood.getText().toString().trim();
        String height = user_height.getText().toString().trim();
        String weight = user_weight.getText().toString().trim();
        String month = user_month.getSelectedItem().toString();

    }
}