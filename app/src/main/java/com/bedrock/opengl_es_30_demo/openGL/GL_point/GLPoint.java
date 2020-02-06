package com.bedrock.opengl_es_30_demo.openGL.GL_point;

import com.bedrock.opengl_es_30_demo.openGL.GLBuffer;

import java.nio.FloatBuffer;

public class GLPoint {

    //顶点着色
    final String vsh = "#version 300 es\n" +
            "layout (location = 0) in vec3 aPosition; \n" +
            "layout (location = 1) in vec4 aColor;\n" +
            "\n" +
            "out vec4 color2frag;\n" +
            "\n" +
            "void main(){\n" +
            "    gl_Position = vec4(aPosition.x,aPosition.y, aPosition.z, 1.0);\n" +
            "    color2frag = aColor;\n" +
            "gl_PointSize=10.0;"+
            "}";

    //片段着色代码
    final String fsh = "#version 300 es\n" +
            "precision mediump float;\n" +
            "out vec4 outColor;\n" +
            "in vec4 color2frag;\n" +
            "\n" +
            "void main(){\n" +
            "    outColor = color2frag;\n" +
            "}";

    //顶点数组
    private final float[] vertexes = {0.0f,0.0f,0.0f};//原点

    //颜色数组
    private final float[] colors = new float[]{1.0f,1.0f,1.0f,1.0f};//白色

    private int program;
    private static final int VERTEX_DIMENSION = 3;
    private static final int COLOR_DIMENSION = 4;

    private FloatBuffer verBuffer;
    private FloatBuffer colorBuffer;

    private int aPosition = 0; //位置的句柄
    private int aColor = 1; //颜色的句柄


    public GLPoint(){
        program = initProgram();
        verBuffer = GLBuffer.getFloatBuffer(vertexes);
        colorBuffer = GLBuffer.getFloatBuffer(colors);
    }

    private int initProgram(){
        int program;
        //顶点shader加载
        int vertextShader ;
    }



}





















