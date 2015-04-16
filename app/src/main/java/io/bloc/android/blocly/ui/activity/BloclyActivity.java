package io.bloc.android.blocly.ui.activity;

import android.app.Activity;
<<<<<<< HEAD
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
=======

import com.nostra13.universalimageloader.cache.memory.impl.LruMemoryCache;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;

import javax.sql.DataSource;
>>>>>>> checkpoint-38-assignment

/**
 * Created by benwong on 2015-04-13.
 */

    public class BloclyActivity extends Activity {
<<<<<<< HEAD
    ItemAdapter itemAdapter;
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
=======
    @Override
    public void onCreate() {
        super.onCreate();
        sharedInstance = this;
        dataSource = new DataSource();

// #1
        DisplayImageOptions defaultOptions = new DisplayImageOptions.Builder()
                .cacheOnDisk(true)
                .cacheInMemory(true)
                .build();

// #2
        ImageLoaderConfiguration configuration = new ImageLoaderConfiguration.Builder(this)
                .tasksProcessingOrder(QueueProcessingType.LIFO)
                .denyCacheImageMultipleSizesInMemory()
                .memoryCache(new LruMemoryCache(2 * 1024 * 1024))
                .memoryCacheSize(2 * 1024 * 1024)
                .diskCacheSize(50 * 1024 * 1024)
                .diskCacheFileCount(100)
                .defaultDisplayImageOptions(defaultOptions)
                .build();

        ImageLoader.getInstance().init(configuration);
>>>>>>> checkpoint-38-assignment
    }

<<<<<<< HEAD





>>>>>>> checkpoint-35-assignment
=======
>>>>>>> checkpoint-37-assignment
