package com.example.android.musicplayer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;


public class AlbumsFragment extends Fragment {

    GridView grid;
    String[] albums = {
            "ASOT 800",
            "A State Of Trance 2017",
            "ASOT 780",
            "The Cure(Remixes)",
            "Unknown",
            "Summer Tracks 2016"};
    int[] img = {
            R.drawable.great_spirit,
            R.drawable.symphony,
            R.drawable.free_tibet,
            R.drawable.the_cure,
            R.drawable.time_wont_wait,
            R.drawable.nobody_love};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final View v = inflater.inflate(R.layout.activity_albums, container, false);
        grid = (GridView) v.findViewById(R.id.grid);
        grid.setAdapter(new GridAdapter(v.getContext(), albums, img));
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(v.getContext(), albums[+position], Toast.LENGTH_SHORT).show();
            }
        });
        return v;
    }
}
