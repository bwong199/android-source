package io.bloc.android.blocly.ui.activity;

import android.app.Activity;
import android.os.Bundle;
<<<<<<< HEAD
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
=======
import android.widget.TextView;
import android.widget.Toast;
>>>>>>> checkpoint-35-assignment

import io.bloc.android.blocly.BloclyApplication;
import io.bloc.android.blocly.R;
import io.bloc.android.blocly.ui.adapter.ItemAdapter;

/**
 * Created by benwong on 2015-04-13.
 */

    public class BloclyActivity extends Activity {
        @Override
        protected void onCreate(Bundle savedInstanceState){
            super.onCreate((savedInstanceState));
            setContentView(R.layout.activity_blocly);
<<<<<<< HEAD
<<<<<<< HEAD

            
=======
            itemAdapter = new ItemAdapter();

            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_activity_blocly);
// #12
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setItemAnimator(new DefaultItemAnimator());
            recyclerView.setAdapter(itemAdapter);
>>>>>>> checkpoint-34-assignment
        }
    }

=======
            Toast.makeText(this,
                    BloclyApplication.getSharedDataSource().getFeeds().get(0).getTitle(),
                    Toast.LENGTH_LONG).show();
            TextView text = (TextView) findViewById(R.id.Text);
            text.setText(feeds);

        }
    }






>>>>>>> checkpoint-35-assignment
