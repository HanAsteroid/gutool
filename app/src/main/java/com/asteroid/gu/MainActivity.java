package com.asteroid.gu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//         ./gradlew clean build bintrayUpload -PbintrayUser=asteroidgu -PbintrayKey=8ea2f03cc05045bb1b8a21082cdbf5533b9fa0ae -PdryRun=false
    }
}
