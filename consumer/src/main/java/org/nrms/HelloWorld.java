package org.nrms;

import org.apache.servicecomb.provider.pojo.Invoker;
import org.apache.servicecomb.provider.pojo.RpcReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@Component
public class HelloWorld {
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorld.class);

    @RpcReference(microserviceName = "perf", schemaId = "helloworld")
    private HelloWorldApi hello;

    public void show() throws InterruptedException, ExecutionException {
//        hello = Invoker.createProxy(
//                PerfConfiguration.producer,
//                "helloworld",
//                HelloWorldApi.class);

//        System.out.println(" ----------runAsyncConsumers 开始--------------");
//        CompletableFuture<String> future = intf.asyncQuery(PerfConfiguration.id,
//                PerfConfiguration.step,
//                PerfConfiguration.all,
//                PerfConfiguration.fromDB);
//        LOGGER.info("runAsyncConsumer: {}", future.get());

        LOGGER.info("----------  非常高兴看见你："+hello.sayHello("赵金铭"));
    }
    public void runAsyncConsumer(){
        CompletableFuture<String> future = hello.asyncSayHello("异步赵金金");
        future.whenComplete((r, e) -> {
            if (e == null) {
                LOGGER.info("@@@@@@  异步成功了");
                return;
            }

            throw new IllegalStateException("#############   invoke failed.", e);
        });
    }
}
