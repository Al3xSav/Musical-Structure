package com.example.android.musicplayer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class ArtistsFragment extends Fragment {

    GridView grid;
    String[] artist = {
            "Armin van Buuren & Vini Vici",
            "Armin van Buuren",
            "High Tribe",
            "Lady Gaga",
            "Filatov & Karas",
            "Sigma"};
    int[] img = {
            R.drawable.great_spirit,
            R.drawable.symphony,
            R.drawable.free_tibet,
            R.drawable.the_cure,
            R.drawable.time_wont_wait,
            R.drawable.nobody_love};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Get the view from activity_artists.xml
        final View v = inflater.inflate(R.layout.activity_artists, container, false);
        grid = (GridView) v.findViewById(R.id.grid);
        grid.setAdapter(new GridAdapter(v.getContext(), artist, img));
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(v.getContext(), artist[+position], Toast.LENGTH_SHORT).show();
            }
        });
        return v;
    }
}
