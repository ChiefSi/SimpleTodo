package com.example.simpletodo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    /*
    Member variables we will want to use throughout the class
     - Defined here so they are in the entire class scope
     - "private" so they are not directly visible to other classes
     - member variables named to be obviously distinct to local variables, here start with "m"
     */
    private ArrayList<String> mItems;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    // A key function equivalent to "main"?
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Appbar
        Toolbar toolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);

        // Create our array with some data already in
        mItems = new ArrayList<String>();
        mItems.add("First");
        mItems.add("Second");

        // As per documentation
        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new CustomListAdapter(mItems);
        mRecyclerView.setAdapter(mAdapter);
    }

    public void onAddItem(View v) {
        EditText editText = findViewById(R.id.textView);
        String item = editText.getText().toString();
        if (!item.isEmpty()) {
            System.out.println("Adding: " + item);
            mItems.add(item);
            System.out.println(mItems);
            mAdapter.notifyDataSetChanged();
            editText.setText("");
        }
    }
}
