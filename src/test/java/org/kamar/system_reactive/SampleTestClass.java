package org.kamar.system_reactive;

import io.netty.util.concurrent.Future;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

@DisplayName("a sample test.")
public class SampleTestClass {

    @Test
    @DisplayName("sample test.")
    void sampleTest(){

        CompletionStage<String> result = CompletableFuture.completedFuture("Hello World!");
        result.thenApply(String::toUpperCase)
                .thenApply(resp -> resp+ " yeey!")
                .thenAccept(System.out::println);



    }
}
