package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio rds = new Radio();

    @Test
    void shouldTotalRadio() {
        Radio rds = new Radio (50);
        rds.setTotalRadio(50);
        assertEquals(50, rds.getTotalRadio());
    }

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
    void shouldIncreaseVolume() {
        rds.setCurrentVolume(4);
        rds.increaseVolume();
        int expected = 5;
        int actual = rds.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolume2() {
        rds.setCurrentVolume(100);
        rds.increaseVolume();
        int expected = 100;
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