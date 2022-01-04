package day02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HikingTest {

    @Test
    void getPlusElevationTest1() {
        Hiking hiking1 = new Hiking(Arrays.asList(4.0, 6.0, 8.0, 9.5, 4.5, 8.0, 4.0));
        assertEquals(9.0, hiking1.getPlusElevation());
    }

    @Test
    void getPlusElevationTest2() {
        Hiking hiking2 = new Hiking(Arrays.asList(4.0, 6.0, 8.0, 9.5, 14.5, 18.0, 24.0));
        assertEquals(20.0, hiking2.getPlusElevation());
    }

    @Test
    void getPlusElevationTest3() {
        Hiking hiking3 = new Hiking(Arrays.asList(10.0 ,20.0 ,15.0 ,18.0));
        assertEquals(13.0, hiking3.getPlusElevation());
    }

    @Test
    void getPlusElevationTest4() {
        Hiking hiking4 = new Hiking(Arrays.asList(30.0 ,20.0 ,15.0 ,12.0));
        assertEquals(0.0, hiking4.getPlusElevation());
    }}