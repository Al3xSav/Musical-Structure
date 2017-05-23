package com.example.android.musicplayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridAdapter extends BaseAdapter {
    private final String[] artistWeb;
    private final int[] img;
    private Context context;

    public GridAdapter(Context con, String[] artistWeb, int[] img) {
        context = con;
        this.artistWeb = artistWeb;
        this.img = img;
    }

    @Override
    public int getCount() {
        return artistWeb.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View grid;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            grid = inflater.inflate(R.layout.grid_view, null);
            TextView textView = (TextView) grid.findViewById(R.id.text_grid);
            ImageView imageView = (ImageView) grid.findViewById(R.id.image_grid);
            textView.setText(artistWeb[position]);
            imageView.setImageResource(img[position]);

        } else {
            grid = convertView;
        }
        return grid;
    }
}

