package com.sunrain;

import org.junit.Test;
import reactor.core.publisher.Flux;

public class FluxTest {



    @Test
    public void fluxJustTest() {
        Flux.just("1", "A", 3).subscribe(System.out::println);
    }
}
