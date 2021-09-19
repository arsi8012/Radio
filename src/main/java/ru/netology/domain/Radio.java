package ru.netology.domain;

public class Radio {
    private int currentRadio;
    private int totalRadio = 10;
    private int firstRadio = 0;
    private int lastRadio = 9;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;

    public Radio(int totalRadio) {
        this.totalRadio = totalRadio;
    }

    public void setTotalRadio(int totalRadio) {
        if (currentRadio == firstRadio) {
            currentRadio = totalRadio - 1;
        } else
            currentRadio += 1;
    }

    public int getTotalRadio() {
        return totalRadio;
    }

    public Radio() {
    }

    public void setCurrentRadio(int currentRadio) {
        if (currentRadio <= firstRadio) {
            this.currentRadio = lastRadio;
            return;
        }
        if (currentRadio >= lastRadio) {
            this.currentRadio = firstRadio;
            return;
        }
        this.currentRadio = currentRadio;
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