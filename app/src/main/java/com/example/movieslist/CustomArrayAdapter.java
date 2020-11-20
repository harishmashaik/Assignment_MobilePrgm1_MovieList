package com.example.movieslist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomArrayAdapter extends ArrayAdapter<CustomList>
{
    public CustomArrayAdapter(@NonNull Context context, int resource, @NonNull ArrayList<CustomList> customLists)
    {
        super(context, resource, customLists);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.custom_list,parent,false);


        }
        CustomList currentItem = getItem(position);

        ImageView imageView = listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentItem.getmImgId());
        TextView textView1=listItemView.findViewById(R.id.movies_name);
        textView1.setText(currentItem.getmImgId());
        TextView textView2=listItemView.findViewById(R.id.movie_rating);
        textView2.setText(currentItem.getmMovieRating());
        TextView textView3=listItemView.findViewById(R.id.description);
        textView3.setText(currentItem.getmMovieDescription());

        return listItemView;

    }
}
