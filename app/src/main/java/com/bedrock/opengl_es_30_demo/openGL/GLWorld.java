package com.bedrock.opengl_es_30_demo.openGL;

import android.content.Context;
import android.opengl.GLES30;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class GLWorld extends GLSurfaceView implements GLSurfaceView.Renderer {

    private static final String TAG = "GLWorld";

    public GLWorld(Context context) {
        super(context,null);
    }

    public GLWorld(Context context, AttributeSet attrs) {
        super(context, attrs);
        setEGLContextClientVersion(3);//设置open gl es 3.0 context
        setRenderer(this);//设置渲染器
    }

    @Override
    public void onSurfaceCreated(GL10 gl10, EGLConfig eglConfig) {
        Log.i(TAG, "on surface created");
        GLES30.glClearColor(1.0f, 0.0f, 0.0f, 1.0f);//rgba

    }

    @Override
    public void onSurfaceChanged(GL10 gl10, int i, int i1) {
        //i  width - i1 height
        Log.i(TAG, "on surface changed");
        GLES30.glViewport(0, 0, i, i1);

    }

    @Override
    public void onDrawFrame(GL10 gl10) {
        Log.i(TAG, "on draw frame");

    }
}
