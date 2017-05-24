package com.example.android.musicplayer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;


public class GenresFragment extends Fragment {
    GridView grid;
    String[] genres = {
            "Psy Trance",
            "Trance",
            "Psychedelic",
            "Nu Disco",
            "Deep House",
            "House"};
    int[] img = {
            R.drawable.great_spirit,
            R.drawable.symphony,
            R.drawable.free_tibet,
            R.drawable.the_cure,
            R.drawable.time_wont_wait,
            R.drawable.nobody_love};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_genre, container, false);
        grid = (GridView) view.findViewById(R.id.grid);
        grid.setAdapter(new GridAdapter(view.getContext(), genres, img));
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(view.getContext(), genres[+position], Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
