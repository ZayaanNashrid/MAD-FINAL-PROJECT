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
 * Use the {@link OrnateRoomFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class OrnateRoomFragment extends Fragment {
    View view;
    int hasMainKey;
    int score;
    TextView currentTextView;
    Button ShelfButton, CupboardButton, Leave;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_ornate_room, container, false);
        ShelfButton = (Button) view.findViewById(R.id.OrnateRoomShelfButton);
        CupboardButton = (Button) view.findViewById(R.id.OrnateRoomCupboardButton);
        Leave = (Button) view.findViewById(R.id.OrnateRoomLeaveButton);
        hasMainKey = ((MainGameScreen)getActivity()).sendMainKeyStatus();


        ShelfButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (hasMainKey){
                    case 1:
                        currentTextView = requireActivity().findViewById(R.id.OrnateRoomTextView);
                        currentTextView.setText("There's nothing interesting on the shelf.");
                        break;
                    default:
                        currentTextView = requireActivity().findViewById(R.id.OrnateRoomTextView);
                        currentTextView.setText("After Rummaging through the various ornate photo frames, you manage to find a key hidden inside one of them.");
                        hasMainKey = 1;
                        ((MainGameScreen)getActivity()).getMainDoorKey(hasMainKey);
                        score = score+1;
                        ((MainGameScreen)getActivity()).incrementScore(score);
                }
            }
        });

        CupboardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentTextView = requireActivity().findViewById(R.id.OrnateRoomTextView);
                currentTextView.setText("You spend a few hours searching through the big cupboard. Unfortunately, there's nothing interesting there. You wasted your time.");
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