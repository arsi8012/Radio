package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio rds = new Radio();

    @Test
    void shouldTotalRadio() {
        Radio rds = new Radio (30);
        rds.setTotalRadio(30);
        assertEquals(29, rds.getCurrentRadio());
    }

    @Test
    void shouldTotalRadio2() {
        Radio rds = new Radio (30);
        rds.setCurrentRadio(5);
        rds.setTotalRadio(30);
        assertEquals(6, rds.getCurrentRadio());
    }


    @Test
    void shouldSetCurrentRadio() {
        rds.setCurrentRadio(9);
        int expected = 0;
        int actual = rds.getCurrentRadio();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentRadio2() {
        rds.setCurrentRadio(0);
        int expected = 9;
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