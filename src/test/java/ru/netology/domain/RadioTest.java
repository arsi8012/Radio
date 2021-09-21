package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio rds = new Radio();

    @Test
    void shouldNextRadio() {
        rds.setCurrentRadio(9);
        rds.nextRadio();
        int expected = 0;
        int actual = rds.getCurrentRadio();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextRadio2() {
        rds.setCurrentRadio(8);
        rds.nextRadio();
        int expected = 9;
        int actual = rds.getCurrentRadio();
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevRadio() {
        rds.setCurrentRadio(0);
        rds.prevRadio();
        int expected = 9;
        int actual = rds.getCurrentRadio();
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevRadio2() {
        rds.setCurrentRadio(1);
        rds.prevRadio();
        int expected = 2;
        int actual = rds.getCurrentRadio();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetNewRadio() {
        rds.setCurrentRadio(0);
        assertEquals(0, rds.getCurrentRadio());
    }

    @Test
    void shouldSetNewRadio2() {
        rds.setCurrentRadio(9);
        assertEquals(9, rds.getCurrentRadio());
    }

    @Test
    void shouldSetNewRadio3() {
        rds.setCurrentRadio(1);
        assertEquals(1, rds.getCurrentRadio());
    }

    @Test
    void shouldSetNewRadio4() {
        rds.setCurrentRadio(8);
        assertEquals(8, rds.getCurrentRadio());
    }

    @Test
    void shouldSetNewRadio5() {
        rds.setCurrentRadio(-10);
        assertEquals(0, rds.getCurrentRadio());
    }

    @Test
    void shouldSetNewRadio6() {
        rds.setCurrentRadio(100500);
        assertEquals(9, rds.getCurrentRadio());
    }

    @Test
    void shouldIncreaseVolume() {
        rds.setCurrentVolume(4);
        rds.increaseVolume();
        int expected = 5;
        int actual = rds.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolume2() {
        rds.setCurrentVolume(10);
        rds.increaseVolume();
        int expected = 10;
        int actual = rds.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolume() {
        rds.setCurrentVolume(3);
        rds.decreaseVolume();
        int expected = 2;
        int actual = rds.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolume2() {
        rds.setCurrentVolume(0);
        rds.decreaseVolume();
        int expected = 0;
        int actual = rds.getCurrentVolume();
        assertEquals(expected, actual);
    }
}