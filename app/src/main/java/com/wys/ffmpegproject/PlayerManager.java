package com.wys.ffmpegproject;

import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class PlayerManager implements SurfaceHolder.Callback {

    static {
        System.loadLibrary("ffmpeg");
    }

    private SurfaceHolder surfaceHolder;

    public void setSurfaceView(SurfaceView surfaceView) {
        if (this.surfaceHolder != null) {
            surfaceHolder.removeCallback(this);
        }
        this.surfaceHolder = surfaceView.getHolder();
        surfaceHolder.addCallback(this);
    }

    public void start(String path) {
        native_star(path, surfaceHolder.getSurface());
    }


    @Override
    public void surfaceCreated(SurfaceHolder holder) {

    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
        this.surfaceHolder = holder;
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }

    public native void native_star(String path, Surface surface);

}
