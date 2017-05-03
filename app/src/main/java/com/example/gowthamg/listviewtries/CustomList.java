package com.example.gowthamg.listviewtries;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by gowtham g on 02-05-2017.
 */

class CustomList extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] web;
    private final Integer[] imageId;
    private final String[] name;
    public CustomList(Activity context,
                      String[] web, Integer[] imageId,String[] name) {
        super(context, R.layout.customlayout, web);
        this.context = context;
        this.web = web;
        this.imageId = imageId;
        this.name = name;

    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.customlayout, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);
        TextView txtTitle2 = (TextView) rowView.findViewById(R.id.txt2);


        ImageView imageView = (ImageView) rowView.findViewById(R.id.img);
        txtTitle.setText(web[position]);
        txtTitle2.setText(name[position]);

        imageView.setImageResource(imageId[position]);
        return rowView;
    }

}
