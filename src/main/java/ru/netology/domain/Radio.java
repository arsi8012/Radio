package ru.netology.domain;

public class Radio {
    private int currentRadio;
    int firstRadio = 0;
    int lastRadio = 9;
    int maxVolume = 10;
    int minVolume = 0;
    private int currentVolume;

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

    public void setCurrentRadio(int newRadio) {
        currentRadio = newRadio;
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

    public void minVolume() {
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
        } else {
            currentVolume = currentVolume + 1;
        }
    }

    public void maxVolume() {
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
        } else {
            currentVolume -= 1;
        }
    }
}