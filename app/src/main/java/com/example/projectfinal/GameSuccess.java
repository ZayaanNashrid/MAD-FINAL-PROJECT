package com.example.projectfinal;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link GameSuccess#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GameSuccess extends Fragment {
    int score;
    View view;
    Button Proceed;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_game_success, container, false);
        Proceed = (Button) view.findViewById(R.id.GameSuccessProceedButton);
        score = ((MainGameScreen)getActivity()).sendScore();

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