package com.gxy.protocol;

import com.gxy.common.Invocation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.math.BigInteger;
import java.util.concurrent.Callable;

public class HttpServerHandler {
    public void handle(HttpServletRequest req, HttpServletResponse resp) {
        //解析请求,得到请求需要使用远程的什么接口,方法,什么参数

        //接受invocation对象
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(req.getInputStream());
            Invocation obj = (Invocation) objectInputStream.readObject();
            String interfaceName = obj.getInterfaceName();
            String methodName = obj.getMethodName();
            Class<?>[] parameterTypes = obj.getParameterTypes();
            Object[] arguments = obj.getArguments();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
