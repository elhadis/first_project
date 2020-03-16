package com.rgbat.newtask;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
private EditText etNAme;
private FloatingActionButton floatingActionButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        etNAme = findViewById(R.id.et_task);
        floatingActionButton = findViewById(R.id.fla_task);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etNAme.getText().toString();

                Intent intent= new Intent();
                intent.putExtra("name",etNAme.getText());
                setResult(2, intent);
                finish();
            }
        });
    }
}
