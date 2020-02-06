package com.bedrock.opengl_es_30_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bedrock.opengl_es_30_demo.openGL.GLWorld;

public class MainActivity extends AppCompatActivity {

    private GLWorld glWorld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setContentView(new GLWorld(this));
        glWorld = findViewById(R.id.gl_world);

    }
}
