package com.example.android.musicplayer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class TracksFragment extends Fragment {


    ListView track;
    String[] title = {
            "Great Spirit(Original Mix)",
            "J'ai Envie De Toi (Original Mix)",
            "Free Tibet(Vini Vici Remix)",
            "The Cure(Remix)",
            "Time Won't Wait(Original Mix)",
            "Nobody To love(Original Mix)"};

    String[] artist = {
            "Armin van Buuren & Vini Vici",
            "Armin van Buuren",
            "High Tribe",
            "Lady Gaga",
            "Filatov & Karas",
            "Sigma"};


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_tracks, container, false);

        track = (ListView) view.findViewById(R.id.listView);
        track.setAdapter(new ListAdapter(view.getContext(), title, artist));
        track.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(view.getContext(), title[position], Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
