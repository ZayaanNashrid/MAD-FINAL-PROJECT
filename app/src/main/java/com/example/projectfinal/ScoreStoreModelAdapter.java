package com.example.projectfinal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class ScoreStoreModelAdapter extends RecyclerView.Adapter<ScoreStoreModelAdapter.ScoreViewHolder>{

    Context context;
    List<ScoreStoreModel> Scorelist;

    public ScoreStoreModelAdapter(Context context, List<ScoreStoreModel> Scorelist){
        this.context = context;
        this.Scorelist = Scorelist;
    }

    public ScoreViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_recycler_view, parent, false);
        return new ScoreViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ScoreStoreModelAdapter.ScoreViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ScoreViewHolder extends RecyclerView.ViewHolder{
        private TextView textview;

        public ScoreViewHolder(@NonNull View itemView){
            super(itemView);
            textview = itemView.findViewById(R.id.RecyclerViewItemTextView);
        }

        public void setData(int position, String name, int score){
            textview.setText(position + ". " + "Name: " + name + " Score: " + score);
        }

    }



}
