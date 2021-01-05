package org.nrms.helloworld;

import java.util.concurrent.CompletableFuture;

public interface HelloWorldApi {

    String sayHello(String name);
    CompletableFuture<String> asyncSayHello(String name);
}
