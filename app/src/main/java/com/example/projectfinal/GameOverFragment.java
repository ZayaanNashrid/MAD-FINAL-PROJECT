package com.example.projectfinal;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link GameOverFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GameOverFragment extends Fragment {
    int score = 0;
    View view;
    Button Proceed;
    TextView textview;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        score = ((MainGameScreen)getActivity()).sendScore();
        view = inflater.inflate(R.layout.fragment_game_over, container, false);
        Proceed = (Button) view.findViewById(R.id.GameOverProceedButton);

        Proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(requireActivity(), ResultsScreen.class);
                intent.putExtra("score", score);
                startActivity(intent);
            }
        });



        return view;
    }
}