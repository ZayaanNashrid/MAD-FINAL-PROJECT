package com.example.projectfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;

public class MainGameScreen extends AppCompatActivity {

    FragmentManager fragmang;
    int hasClosetKey = 0;
    int hasMainDoorKey = 0;
    int GeneratorStatus = 0;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_game_screen);

        fragmang = getSupportFragmentManager();

        if(savedInstanceState == null){
            fragmang.beginTransaction()
                    .replace(R.id.MainGameScreenFragmentContainer1, MainGameFragment1.class, null)
                    .commit();


        }

    }

    public void MoveToFragment2(){
        fragmang.beginTransaction()
                    .replace(R.id.MainGameScreenFragmentContainer1, MainGameFragment2.class, null)
                    .commit();

    }

    public void MoveToEnteringMainHallwayFragment(){

        fragmang.beginTransaction()
                .replace(R.id.MainGameScreenFragmentContainer1,EntertingMainHallwayFragment.class, null)
                .commit();

    }

    public void EnterMainHallway(){
        fragmang.beginTransaction()
                .replace(R.id.MainGameScreenFragmentContainer1, MainHallwayFragment.class, null)
                .commit();

    }

    public void EnterGeneratorRoom(){
        fragmang.beginTransaction()
                .replace(R.id.MainGameScreenFragmentContainer1, GeneratorRoomFragment.class, null)
                .commit();

    }

    public void EnterOrnateRoom(){
        fragmang.beginTransaction()
                .replace(R.id.MainGameScreenFragmentContainer1, OrnateRoomFragment.class, null)
                .commit();

    }

    public void GameOver(){
        fragmang.beginTransaction()
                .replace(R.id.MainGameScreenFragmentContainer1, GameOverFragment.class, null)
                .commit();

    }

    public void GameSuccess(){
        fragmang.beginTransaction()
                .replace(R.id.MainGameScreenFragmentContainer1, GameSuccess.class, null)
                .commit();
    }




    public void incrementScore(int currentscore){score = score + currentscore;}
    public void getClosetKey(int i){
        hasClosetKey = i;
    }
    public void getMainDoorKey(int i){ hasMainDoorKey = i; }
    public void getGeneratorStatus(int i){GeneratorStatus = i;}

    public int sendGeneratorStatus(){return GeneratorStatus;}
    public int sendMainKeyStatus(){return hasMainDoorKey;}
    public int sendScore(){return score;};
}