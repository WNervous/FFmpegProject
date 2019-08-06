package com.wys.ffmpegproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.SurfaceView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private SurfaceView   surfaceView;
    private PlayerManager playerManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        surfaceView = findViewById(R.id.surfaceView);
        playerManager = new PlayerManager();
        playerManager.setSurfaceView(surfaceView);
    }


    public void open(View view) {
//        String uri = "android.resource://" + getPackageName() + "/" + R.raw.abc;
        playerManager.start("rtmp://58.200.131.2:1935/livetv/hunantv");
    }
}
