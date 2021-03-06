package com.easycoding.easycodingrpc.service;

import com.easycoding.easycodingrpc.easyrpc.IRpcService;

import java.io.IOException;

public interface Server {

    /**
     * Socket 端口
     */
    int PORT = 9094;

    /**
     * 启动服务端
     */
    void start() throws IOException;

    /**
     * 停止服务端
     */
    void stop();

    /**
     * 服务注册
     *
     * @param serviceInterface -- 对外暴露服务接口
     * @param impl             --  内部实现类
     */
    void regist(Class<? extends IRpcService> serviceInterface, Class<? extends IRpcService> impl);
}
