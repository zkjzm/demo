package org.nrms.helloworld;

import org.apache.servicecomb.provider.pojo.RpcSchema;

import java.util.concurrent.CompletableFuture;


@RpcSchema(schemaId = "helloworld")
public class HelloWorldProvider implements HelloWorldApi {
    public String sayHello(String name)  {
        return "你好"+ name;
    }

    @Override
    public CompletableFuture<String> asyncSayHello(String name) {
        CompletableFuture<String> future = new CompletableFuture<>();
        future.complete("服务器返回：异步成功"+name);
        return future;
    }
}
