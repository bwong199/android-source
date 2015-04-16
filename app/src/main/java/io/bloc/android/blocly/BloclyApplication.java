package io.bloc.android.blocly;

import android.app.Application;
<<<<<<< HEAD

import io.bloc.android.blocly.api.DataSource;

/**
 * Created by benwong on 2015-04-13.
 */

    public class BloclyApplication extends Application {

        // #1
        public static BloclyApplication getSharedInstance() {
            return sharedInstance;
        }

        // #2
        public static DataSource getSharedDataSource() {
            return BloclyApplication.getSharedInstance().getDataSource();
        }

        private static BloclyApplication sharedInstance;
        private DataSource dataSource;

        // #3
        @Override
        public void onCreate() {
            super.onCreate();
            sharedInstance = this;
            dataSource = new DataSource();
        }

        public DataSource getDataSource() {
            return dataSource;
        }
=======
import android.widget.TextView;

import javax.sql.DataSource;

/**
 * Created by benwong on 2015-04-14.
 */
public class BloclyApplication extends Application {

    // #1
    public static BloclyApplication getSharedInstance() {
        return sharedInstance;
    }

    // #2
    public static DataSource getSharedDataSource() {
        return BloclyApplication.getSharedInstance().getDataSource();
    }

    private static BloclyApplication sharedInstance;
    private DataSource dataSource;

    // #3
    @Override
    public void onCreate() {
        super.onCreate();
        sharedInstance = this;
        dataSource = new DataSource();
    }

    public DataSource getDataSource() {
        return dataSource;
    }




>>>>>>> checkpoint-35-assignment
}
