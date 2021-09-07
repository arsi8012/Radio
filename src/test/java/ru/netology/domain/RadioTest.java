package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio rds = new Radio();

    @Test
    void shouldSetNextRadio() {
        rds.setNextRadio(10);
        int expected = 0;
        int actual = rds.getCurrentRadio();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetNextRadio2() {
        rds.setNextRadio(5);
        int expected = 6;
        int actual = rds.getCurrentRadio();
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevRadio() {
        rds.setPrevRadio(0);
        int expected = 9;
        int actual = rds.getCurrentRadio();
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevRadio2() {
        rds.setPrevRadio(2);
        int expected = 3;
        int actual = rds.getCurrentRadio();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentRadio() {
        rds.setCurrentRadio(3);
        assertEquals(3, rds.getCurrentRadio());
    }

    @Test
    void shouldSetIncreaseVolume() {
        rds.setIncreaseVolume(4);
        int expected = 5;
        int actual = rds.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetIncreaseVolume2() {
        rds.setIncreaseVolume(10);
        int expected = 10;
        int actual = rds.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetDecreaseVolume() {
        rds.setDecreaseVolume(3);
        int expected = 2;
        int actual = rds.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetDecreaseVolume2() {
        rds.setDecreaseVolume(0);
        int expected = 0;
        int actual = rds.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetMinVolume() {
        rds.setMinVolume(0);
        int expected =0;
        int actual = rds.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetMinVolume2() {
        rds.setMinVolume(2);
        int expected =3;
        int actual = rds.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetMaxVolume() {
        rds.setMaxVolume(10);
        int expected =10;
        int actual = rds.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetMaxVolume2() {
        rds.setMaxVolume(2);
        int expected =1;
        int actual = rds.getCurrentVolume();
        assertEquals(expected, actual);
    }
}