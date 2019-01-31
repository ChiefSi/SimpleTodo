package com.example.simpletodo;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CustomItemViewHolder extends RecyclerView.ViewHolder {
    private View mView;
    public CustomItemViewHolder(View v) {
        super(v);
        mView = v;
    }

    public void setText(String text) {
        TextView t = mView.findViewById(R.id.textView3);
        Button b = mView.findViewById(R.id.my_button);
        t.setText(text);
        b.setText(text);
    }
}
