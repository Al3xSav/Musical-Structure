package com.example.android.musicplayer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class PlayFragment extends Fragment {

    String url = "https://d30y9cdsu7xlg0.cloudfront.net/png/55429-200.png";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_play, container, false);
        ImageView glideImageView = (ImageView) view.findViewById(R.id.glide_image_view);
        Glide.with(view.getContext())
                .load(url)
                .into(glideImageView);
        return view;
    }
}
