package com.googleanalyticsdemo;

import android.app.Application;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;

/**
 * Created by dhananjay on 24/7/15.
 */
public class ApplicationController extends Application {

    public static GoogleAnalytics googleAnalytics;
    public static Tracker tracker;


    @Override
    public void onCreate() {
        super.onCreate();

        googleAnalytics = GoogleAnalytics.getInstance(this);
        googleAnalytics.setLocalDispatchPeriod(1800);

        tracker = googleAnalytics.newTracker(getResources().getString(R.string.analytics_tracker_id));
        tracker.enableExceptionReporting(true);
        tracker.enableAdvertisingIdCollection(true);
        tracker.enableAutoActivityTracking(true);
        
    }

    public static GoogleAnalytics getGoogleAnalytics (){
        return googleAnalytics;
    }

    public static Tracker getTracker(){
        return tracker;
    }
}
