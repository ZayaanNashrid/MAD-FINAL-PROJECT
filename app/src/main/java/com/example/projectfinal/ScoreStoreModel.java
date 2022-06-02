package com.example.projectfinal;

import androidx.recyclerview.widget.RecyclerView;

public class ScoreStoreModel{
    String name;
    int score;

    public ScoreStoreModel(String name, int score){
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
}
