package com.bedrock.opengl_es_30_demo.openGL;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public class GLBuffer {

    /**
     * @param vertex  顶点
     * @return 获取浮点型缓冲数据
     */
    public static FloatBuffer getFloatBuffer(float[] vertex){
        FloatBuffer buffer;
        //每个浮点数 ： 坐标个数 * 4字节
        ByteBuffer qbb = ByteBuffer.allocateDirect(vertex.length * 4);
        //使用本机硬件设备的字节顺序
        qbb.order(ByteOrder.nativeOrder());
        //从字节缓冲区创建浮点缓冲区
        buffer = qbb.asFloatBuffer();
        //将坐标添加到 float buffer
        buffer.put(vertex);
        //设置缓冲区可以读取第一个坐标
        buffer.position(0);
        return buffer;
    }


}
