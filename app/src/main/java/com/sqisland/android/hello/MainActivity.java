package com.sqisland.android.hello;

import android.app.Activity;
import android.os.Bundle;
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

public class MainActivity extends Activity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    AppCenter.start(getApplication(), "b007f239-99d8-492b-a682-215b0d075456",
                  Analytics.class, Crashes.class);
  }
}
