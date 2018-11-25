package com.quintus.labs.recyclerviewads;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRV;
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] data = {"ksjdahfjak;", "feawjkhfew", "flosujfeka", "hjgweafiwaf",
                "oneahfewa", "mowaforw", "hfejwafewa", "fewalfuewaf",
                "ksjdahfjak;", "feawjkhfew", "flosujfeka", "hjgweafiwaf",
                "oneahfewa", "mowaforw", "hfejwafewa", "fewalfuewaf"};

        mRV = findViewById(R.id.recyclerview);
        adapter = new MyAdapter(this, data);
        mRV.setAdapter(adapter);
        mRV.setLayoutManager(new LinearLayoutManager(this));

    }


}
