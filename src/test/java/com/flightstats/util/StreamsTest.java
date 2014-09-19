package com.flightstats.util;

import org.junit.Test;

import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class StreamsTest {

    @Test
    public void testTimes() throws Exception {
        AtomicInteger resultCount = new AtomicInteger(0);
    	Streams.times(100).forEach(x -> {
            assertNull(x);
            resultCount.incrementAndGet();
        });
        assertEquals(100, resultCount.get());
    }

}