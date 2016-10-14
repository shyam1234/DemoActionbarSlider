package com.malviya.demoprogressbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.malviya.demoprogressbar.adapter.CustomRecyclerViewAdapter;
import com.malviya.demoprogressbar.model.DashBoardDataModel;

import java.util.ArrayList;
import java.util.List;

public class DashBoard extends AppCompatActivity {

    private RecyclerView mRecyclerview;
    private CustomRecyclerViewAdapter mAdapter;
    private List<DashBoardDataModel> mlist ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        init();
        initView();
    }

    private void init() {
        mlist = new ArrayList<DashBoardDataModel>();
    }

    private void initView() {
        mRecyclerview = (RecyclerView)findViewById(R.id.recyclerview_dashboard);
        RecyclerView.LayoutManager layoutManager  = new LinearLayoutManager(getApplicationContext());
        mRecyclerview.setLayoutManager(layoutManager);
        mRecyclerview.setItemAnimator(new DefaultItemAnimator());
        //--------------
        mAdapter  = new CustomRecyclerViewAdapter(DashBoard.this,mlist);
        mRecyclerview.setAdapter(mAdapter);
    }
}
