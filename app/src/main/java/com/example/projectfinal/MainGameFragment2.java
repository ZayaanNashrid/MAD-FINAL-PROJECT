package com.example.projectfinal;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MainGameFragment2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainGameFragment2 extends Fragment {
    int score = 0;
    int hasClosetKey = 0; //player doesn't have a key yet.

    View view;
    Button SearchClosetButton, CheckDoorButton;
    TextView currentTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view = inflater.inflate(R.layout.fragment_main_game2, container, false);
        SearchClosetButton = (Button) view.findViewById(R.id.MainGameScreenFragment2Button1);
        CheckDoorButton = (Button) view.findViewById(R.id.MainGameScreenFragment2Button2);


        SearchClosetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentTextView = requireActivity().findViewById(R.id.MainGameScreenFragment2TextView);
                currentTextView.setText("You open the closet door. Inside, there's nothing inside but a key sitting by itself on one of the shelves. You take it.");

                score = score + 1;
                ((MainGameScreen)getActivity()).incrementScore(score);
                hasClosetKey = 1;
                ((MainGameScreen)getActivity()).getClosetKey(hasClosetKey);
            }
        });

        CheckDoorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(hasClosetKey){
                    case 1:
                        ((MainGameScreen)getActivity()).MoveToEnteringMainHallwayFragment();
                        break;
                    default:
                        currentTextView = requireActivity().findViewById(R.id.MainGameScreenFragment2TextView);
                        currentTextView.setText("You reach for the door and try to open it only to be greeted by the sound of locks. You're trapped inside.");

                }

            }
        });


        return view;
    }


}