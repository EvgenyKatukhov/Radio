package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private final int minStation = 0;
    private int maxStation = 9;
    private final int minVolume = 0;
    private final int maxVolume = 100;

    public Radio() {

    }

    public Radio(int stations) {
        if (stations <= 0) {
            throw new IllegalArgumentException("Argument stations should be positive");
        }
        this.maxStation = stations - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (currentStation == maxStation) {
            currentStation = minStation;
            return;
        }
        currentStation++;
    }

    public void prevStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
            return;
        }
        currentStation--;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseCurrentVolume() {
        if (currentVolume < maxVolume)
            currentVolume++;
    }

    public void decreaseCurrentVolume() {
        if (currentVolume > minVolume)
            currentVolume--;
    }
}

