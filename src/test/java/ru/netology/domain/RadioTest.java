package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio rds = new Radio();

    @Test
    void shouldNextRadio() {
        rds.setCurrentRadio(10);
        rds.nextRadio();
        int expected = 0;
        int actual = rds.getCurrentRadio();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextRadio2() {
        rds.setCurrentRadio(5);
        rds.nextRadio();
        int expected = 6;
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
        rds.setCurrentRadio(2);
        rds.prevRadio();
        int expected = 3;
        int actual = rds.getCurrentRadio();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentRadio() {
        rds.setCurrentRadio(0);
        assertEquals(0, rds.getCurrentRadio());
    }

    @Test
    void shouldSetCurrentRadio2() {
        rds.setCurrentRadio(3);
        assertEquals(3, rds.getCurrentRadio());
    }

    @Test
    void shouldSetCurrentRadio3() {
        rds.setCurrentRadio(7);
        assertEquals(7, rds.getCurrentRadio());
    }

    @Test
    void shouldSetCurrentRadio4() {
        rds.setCurrentRadio(9);
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