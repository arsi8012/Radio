package ru.netology.domain;

public class Radio {
    private int currentRadio;
    private int firstRadio = 0;
    private int lastRadio = 9;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentVolume;

    public void setCurrentRadio(int currentRadio) {
        if (currentRadio >= lastRadio) {
            this.currentRadio = lastRadio;
            return;
        }
        if (currentRadio <= firstRadio) {
            this.currentRadio = firstRadio;
            return;
        }
        this.currentRadio = currentRadio;
    }

    public int getCurrentRadio() {
        return currentRadio;
    }

    public void nextRadio() {
        if (currentRadio >= lastRadio) {
            currentRadio = firstRadio;
        } else {
            currentRadio += 1;
        }
    }

    public void prevRadio() {
        if (currentRadio <= firstRadio) {
            currentRadio = lastRadio;
        } else {
            currentRadio += 1;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVolume;
        }
    }
}