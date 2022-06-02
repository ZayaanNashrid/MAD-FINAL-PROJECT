package com.example.projectfinal;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link EntertingMainHallwayFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EntertingMainHallwayFragment extends Fragment {

    View view;
    Button ProceedButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_enterting_main_hallway, container, false);
        ProceedButton = (Button) view.findViewById(R.id.EnteringMainHallwayProceedButton);

        ProceedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainGameScreen)getActivity()).EnterMainHallway();
            }
        });

        return view;
    }
}