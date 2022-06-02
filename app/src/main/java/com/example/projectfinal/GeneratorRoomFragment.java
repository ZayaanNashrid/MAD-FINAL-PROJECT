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
 * Use the {@link GeneratorRoomFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GeneratorRoomFragment extends Fragment {
    int score;
    View view;
    int GeneratorStatus;
    Button StopGeneratorButton, Leave;
    TextView currentTextView;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        view = inflater.inflate(R.layout.fragment_generator_room, container, false);
        GeneratorStatus = ((MainGameScreen)getActivity()).sendGeneratorStatus();

        StopGeneratorButton = (Button) view.findViewById(R.id.GeneratorRoomStopGeneratorButton);
        Leave = (Button) view.findViewById(R.id.GeneratorRoomLeaveButton);



        StopGeneratorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(GeneratorStatus){
                    case 1:
                        currentTextView = ((MainGameScreen)getActivity()).findViewById(R.id.GeneratorRoomTextView);
                        currentTextView.setText("The Generator is already off.");

                        break;
                    default:

                        GeneratorStatus = 1;
                        score = score + 1;
                        currentTextView = ((MainGameScreen)getActivity()).findViewById(R.id.GeneratorRoomTextView);
                        currentTextView.setText("The room is silent when you turn it off.");
                        ((MainGameScreen)getActivity()).getGeneratorStatus(GeneratorStatus);
                        ((MainGameScreen)getActivity()).incrementScore(score);
                }
            }
        });

        Leave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainGameScreen)getActivity()).EnterMainHallway();
            }
        });



        return view;
    }
}