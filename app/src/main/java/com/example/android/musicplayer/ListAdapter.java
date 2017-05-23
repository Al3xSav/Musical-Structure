package com.example.android.musicplayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ListAdapter extends BaseAdapter {

    private final String[] title;
    private final String[] artist;
    private Context context;

    public ListAdapter(Context con, String[] title, String[] artist) {
        context = con;
        this.title = title;
        this.artist = artist;
    }

    @Override
    public int getCount() {
        return title.length;
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

        View list;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            list = inflater.inflate((R.layout.list_view), null);
            TextView textView = (TextView) list.findViewById(R.id.list_track);
            TextView textView1 = (TextView) list.findViewById(R.id.list_artist);
            textView1.setText(artist[position]);
            textView.setText(title[position]);
        } else {
            list = convertView;
        }
        return list;
    }
}
