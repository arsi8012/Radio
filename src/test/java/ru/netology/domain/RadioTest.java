package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio rds = new Radio();

    @Test
    void shouldTotalRadio() {
        Radio rds = new Radio (30);
        rds.setTotalRadio(30);
        assertEquals(30, rds.getTotalRadio());
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
        rds.setCurrentRadio(8);
        rds.nextRadio();
        int expected = 9;
        int actual = rds.getCurrentRadio();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextRadio3() {
        rds.setCurrentRadio(29);
        rds.nextRadio();
        int expected = 0;
        int actual = rds.getCurrentRadio();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextRadio4() {
        rds.setCurrentRadio(40);
        rds.nextRadio();
        int expected = 0;
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
        assertEquals(2, rds.getCurrentRadio());
    }

    @Test
    void shouldPrevRadio3() {
        Radio rds = new Radio (30);
        rds.setCurrentRadio(0);
        rds.prevRadio();
        int expected = 29;
        int actual = rds.getCurrentRadio();
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevRadio4() {
        Radio rds = new Radio (30);
        rds.setCurrentRadio(-10);
        rds.prevRadio();
        int expected = 29;
        int actual = rds.getCurrentRadio();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentRadio() {
        rds.setCurrentRadio(9);
        int expected = 9;
        int actual = rds.getCurrentRadio();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentRadio2() {
        rds.setCurrentRadio(0);
        int expected = 0;
        int actual = rds.getCurrentRadio();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentRadio3() {
        rds.setCurrentRadio(1);
        int expected = 1;
        int actual = rds.getCurrentRadio();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentRadio6() {
        rds.setCurrentRadio(8);
        int expected = 8;
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