package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int i = 2;
        Button btn_add = findViewById(R.id.btn_add);
        EditText edt_name = findViewById(R.id.edt_name);
        TextView txt_name = findViewById(R.id.txt_name);
        TextView txt_family = findViewById(R.id.txt_family);
        TextView txt_age = findViewById(R.id.txt_age);

        txt_name.setText("Alireza");
        txt_family.setText("Abdi");
        txt_age.setText("22");

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = edt_name.getText().toString();
                if (name.length()>1){
                    name = edt_name.getText().toString();

                }else {
                    name = "error";
                }
            }
        });
    }
}