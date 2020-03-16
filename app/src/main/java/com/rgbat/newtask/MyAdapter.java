package com.rgbat.newtask;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {
  private   Context c;
   private ArrayList<Person>people;

    public MyAdapter(Context c, ArrayList<Person> people) {
        this.c = c;
        this.people = people;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

           View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.task_list,null,false);
                MyHolder myHolder = new MyHolder(v);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int i) {
        myHolder.tName.setText(people.get(i).getName().toString());
        myHolder.img.setImageResource(people.get(i).getImage());

    }

    @Override
    public int getItemCount() {
        return people.size();
    }

    public void notifyDataSetChanged(ArrayList<Person> people) {
    }

    class MyHolder extends RecyclerView.ViewHolder {
        TextView tName;
        ImageView img;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            tName = itemView.findViewById(R.id.tv_name);
            img = itemView.findViewById(R.id.task_image);
        }
    }
}
