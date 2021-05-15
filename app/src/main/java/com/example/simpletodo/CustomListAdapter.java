package com.example.simpletodo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomListAdapter extends RecyclerView.Adapter<CustomItemViewHolder> {
    private ArrayList<String> mItems;

    public CustomListAdapter(ArrayList<String> items) {
        mItems = items;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public CustomItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_entry, parent, false);
        CustomItemViewHolder vh = new CustomItemViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(CustomItemViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        //holder.mTextView.setText(mItems.get(position));
        System.out.println("View position: " + position);
        holder.setText(mItems.get(position));
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mItems.size();
    }
}
