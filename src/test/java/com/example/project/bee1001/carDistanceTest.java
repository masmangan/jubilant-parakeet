package com.example.project.bee1001;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarDistanceTest {

    @Test
    void testDistance30Km() {
        CarDistance carDistance = new CarDistance();
        assertEquals(60, carDistance.calculateTime(30));
    }

    @Test
    void testDistance110Km() {
        CarDistance carDistance = new CarDistance();
        assertEquals(220, carDistance.calculateTime(110));
    }

    @Test
    void testDistance7Km() {
        CarDistance carDistance = new CarDistance();
        assertEquals(14, carDistance.calculateTime(7));
    }
}
