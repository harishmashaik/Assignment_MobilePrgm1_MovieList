package com.example.movieslist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView main_listview=findViewById(R.id.main_listview);

        ArrayList<CustomList> moviesList = new ArrayList<>();
        moviesList.add(new CustomList(R.drawable.pic,"Dilwale Dulhaniya Lejayege","5/5","Romantic Film"));
        moviesList.add(new CustomList(R.drawable.pic1,"Fanaa","4.5/5","Action Thriller Film"));
        moviesList.add(new CustomList(R.drawable.pic2,"Jab We Met","4.5/5","Romantic-Comedy Film"));
        moviesList.add(new CustomList(R.drawable.pic3,"Om Shanthi Om","4/5","Revenge Story"));
        moviesList.add(new CustomList(R.drawable.pic4,"Hey Jawani hai Dewani","4.5/5","Feel-Good film"));

        CustomArrayAdapter arrayAdapter = new CustomArrayAdapter(this,0,moviesList);

        main_listview.setAdapter(arrayAdapter);

    }
}