package ru.netology.domain;

public class Radio {
    private int currentRadio;
    int firstRadio;
    int lastRadio;
    int maxVolume;
    int minVolume;
    private int currentVolume;

    public Radio(int currentRadio, int firstRadio, int lastRadio, int maxVolume, int minVolume, int currentVolume) {
        this.currentRadio = currentRadio;
        this.firstRadio = firstRadio;
        this.lastRadio = lastRadio;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.currentVolume = currentVolume;
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

    public void setCurrentRadio(int currentRadio) {
        if (currentRadio <= firstRadio) {
            return;
        } else {
            this.currentRadio = currentRadio;
        }
        if (currentRadio >= lastRadio) {
            return;
        } else {
            this.currentRadio = currentRadio;
        }
    }

    public int getCurrentRadio() {
        return currentRadio;
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