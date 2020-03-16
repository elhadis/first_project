package com.rgbat.newtask;

import android.content.Intent;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TextView tv_name;
    private Button btn;
private RecyclerView recyclerView;
private ArrayList<Person> people;
private MyAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_name = findViewById(R.id.tv_name);
        recyclerView = findViewById(R.id.recycler);
        btn = findViewById(R.id.button_main);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        people = new ArrayList<>();
      //  for (int i =0; i <=5 ; i++){
            Person person = new Person("ADAM",R.drawable.ic_person);

            Person person3 = new Person("NAESR",R.drawable.ic_person);
            people.add(person3);

            Person person1 = new Person("Alma",R.drawable.ic_person);
            people.add(person1);


            Person person2 = new Person("AHMED",R.drawable.ic_person);
            people.add(person2);
      //  }








        adapter = new MyAdapter(this, people);
        recyclerView.setAdapter(adapter);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),Main2Activity.class);
                startActivityForResult(intent,1);
            }

        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==2){
            recyclerView.getAdapter();
            Intent intent =getIntent();
            intent.getStringExtra("name");
         ArrayList<Person> person = new ArrayList<>();
         for (int i =0; i <person.size();i++){
             person.add(person.get(i));
             adapter.notifyDataSetChanged(people);

         }




            adapter.notifyDataSetChanged(people);
        }
    }
}
