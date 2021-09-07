package ru.netology.domain;

public class Radio {
    private int currentRadio;
    int firstRadio = 0;
    int pastRadio = 9;
    int maxVolume = 10;
    int minVolume = 0;
    private int currentVolume;

    public void setNextRadio(int currentRadio) {
        if (currentRadio >= 9) {
            currentRadio = firstRadio;
        }
        else {
            currentRadio += 1;
        }
        this.currentRadio = currentRadio;
    }


    public void setPrevRadio(int currentRadio) {
        if (currentRadio <= 0) {
            currentRadio = pastRadio;
        }
        else {
            currentRadio += 1;
        }
        this.currentRadio = currentRadio;
    }

    public void setCurrentRadio(int newRadio) {
        currentRadio = newRadio;
    }

    public int getCurrentRadio() {
        return currentRadio;
    }

    public void setIncreaseVolume(int currentVolume) {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        else {
            currentVolume = 10;
        }
        this.currentVolume = currentVolume;
    }

    public void setDecreaseVolume(int currentVolume) {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        else {
            currentVolume = 0;
        }
        this.currentVolume = currentVolume;
    }

    public void setMinVolume(int currentVolume) {
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
        }
        else {
            currentVolume = currentVolume + 1;
        }
        this.currentVolume = currentVolume;
    }

    public void setMaxVolume(int currentVolume) {
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
        }
        else {
            currentVolume -= 1;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}