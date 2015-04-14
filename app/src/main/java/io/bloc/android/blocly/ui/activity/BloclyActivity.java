package io.bloc.android.blocly.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import io.bloc.android.blocly.R;

/**
 * Created by benwong on 2015-04-13.
 */

    public class BloclyActivity extends Activity {
        @Override
        protected void onCreate(Bundle savedInstanceState){
            super.onCreate((savedInstanceState));
            setContentView(R.layout.activity_blocly);
            itemAdapter = new ItemAdapter();

            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_activity_blocly);
// #12
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setItemAnimator(new DefaultItemAnimator());
            recyclerView.setAdapter(itemAdapter);
        }
    }
