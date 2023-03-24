package com.example.currencyconversorapt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

public class ImageArrayAdapter extends ArrayAdapter<Integer> {

    private Integer[] images;

    public ImageArrayAdapter(Context context, Integer[] images) {
        super(context, R.layout.spinner_image, images);
        this.images = images;

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.spinner_image, null);
        }

        ImageView imageView = view.findViewById(R.id.imageView);
        imageView.setImageResource(images[position]);

        return view;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return getView(position, convertView, parent);
    }
}
