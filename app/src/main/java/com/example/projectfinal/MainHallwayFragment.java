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
 * Use the {@link MainHallwayFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainHallwayFragment extends Fragment {

    View view;
    int score = 0;
    int hasMainDoorKey = 0;
    int GeneratorStatus = 0;
    Button MainDoor, RustyDoor, OrnateDoor;
    TextView currentTextView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view = inflater.inflate(R.layout.fragment_main_hallway, container, false);
        GeneratorStatus = ((MainGameScreen)getActivity()).sendGeneratorStatus();

        MainDoor = (Button) view.findViewById(R.id.EnterMainHallwayMainDoor);
        RustyDoor = (Button) view.findViewById(R.id.EnterMainHallwayRustyDoor);
        OrnateDoor = (Button) view.findViewById(R.id.EnterMainHallwayOrnateDoor);



        MainDoor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hasMainDoorKey = ((MainGameScreen)getActivity()).sendMainKeyStatus();
                switch(hasMainDoorKey){
                    case 1:
                        ((MainGameScreen)getActivity()).GameSuccess();
                        break;
                    default:
                        currentTextView = requireActivity().findViewById(R.id.MainHallwayTextView);
                        currentTextView.setText("You try to open the door, but it's locked. Thwarted again.");
                }
            }
        });

        RustyDoor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainGameScreen)getActivity()).EnterGeneratorRoom();

            }
        });

        OrnateDoor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GeneratorStatus = ((MainGameScreen)getActivity()).sendGeneratorStatus();
                switch (GeneratorStatus){
                    case 1:
                        ((MainGameScreen)getActivity()).EnterOrnateRoom();
                        break;
                    default:
                        ((MainGameScreen)getActivity()).GameOver();
                }
            }
        });



        return view;
    }
}