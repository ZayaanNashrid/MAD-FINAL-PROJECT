package com.example.projectfinal;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;



/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MainGameFragment1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainGameFragment1 extends Fragment {

    View view;
    Button Fragment1Button1;
    //FragmentManager fragman = getFragmentManager();
    //Fragment Fragment2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        view = inflater.inflate(R.layout.fragment_main_game1, container, false);

        Fragment1Button1 = (Button) view.findViewById(R.id.MainGameScreenFragment1Button1);

        Fragment1Button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                ((MainGameScreen)getActivity()).MoveToFragment2();

            }
        });

        return view;
    }
}