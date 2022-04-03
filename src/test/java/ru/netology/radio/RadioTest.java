package ru.netology.radio;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {

    @Test
    void setCurrentStation() {
        Radio station = new Radio();
        int expected = 7;

        station.setCurrentStation(expected);

        Assertions.assertEquals(expected, station.getCurrentStation());
    }

    @Test
    void incorrectMinValueSetCurrentStation() {
        Radio station = new Radio();
        int expected = station.getCurrentStation();

        station.setCurrentStation(-1);

        Assertions.assertEquals(expected, station.getCurrentStation());
    }

    @Test
    void incorrectMaxValueSetCurrentStation() {
        Radio station = new Radio();
        int expected = station.getCurrentStation();

        station.setCurrentStation(10);

        Assertions.assertEquals(expected, station.getCurrentStation());
    }

    @Test
    void pushNextRadioStation() {
        Radio station = new Radio(5);
        station.setCurrentStation(4);
        station.nextStation();

        int expected = 0;

        Assertions.assertEquals(expected, station.getCurrentStation());
    }

    @Test
    void pushDoubleNextRadioStation() {
        Radio station = new Radio();
        station.setCurrentStation(9);
        station.nextStation();
        station.nextStation();

        int expected = 1;

        Assertions.assertEquals(expected, station.getCurrentStation());
    }

    @Test
    void pushPrevRadioStation() {
        Radio station = new Radio();
        station.setCurrentStation(0);
        station.prevStation();


        int expected = 9;

        Assertions.assertEquals(expected, station.getCurrentStation());
    }

    @Test
    void pushDoublePrevRadioStation() {
        Radio station = new Radio();
        station.setCurrentStation(2);
        station.prevStation();
        station.prevStation();


        int expected = 0;

        Assertions.assertEquals(expected, station.getCurrentStation());
    }

    @Test
    void setCurrentVolume() {
        Radio station = new Radio();
        int expected = 8;

        station.setCurrentVolume(expected);

        Assertions.assertEquals(expected, station.getCurrentVolume());
    }

    @Test
    void incorrectMaxValueSetCurrentVolume() {
        Radio station = new Radio();
        int expected = station.getCurrentVolume();

        station.setCurrentVolume(0);

        Assertions.assertEquals(expected, station.getCurrentVolume());
    }

    @Test
    void incorrectMinValueSetCurrentVolume() {
        Radio station = new Radio();
        int expected = station.getCurrentVolume();

        station.setCurrentVolume(-1);

        Assertions.assertEquals(expected, station.getCurrentVolume());
    }

    @Test
    void volumeUpCurrentVolume() {
        Radio station = new Radio();
        station.setCurrentVolume(100);

        station.increaseCurrentVolume();

        Assertions.assertEquals(station.getMaxVolume(), station.getCurrentVolume());
    }

    @Test
    void volumeDoubleUpCurrentVolume() {
        Radio station = new Radio();
        station.setCurrentVolume(99);

        station.increaseCurrentVolume();
        station.increaseCurrentVolume();

        Assertions.assertEquals(station.getMaxVolume(), station.getCurrentVolume());
    }

    @Test
    void volumeDownCurrentVolume() {
        Radio station = new Radio();
        station.setCurrentVolume(0);

        station.decreaseCurrentVolume();

        Assertions.assertEquals(station.getMinVolume(), station.getCurrentVolume());
    }

    @Test
    void volumeDoubleDownCurrentVolume() {
        Radio station = new Radio();
        station.setCurrentVolume(1);

        station.decreaseCurrentVolume();
        station.decreaseCurrentVolume();

        Assertions.assertEquals(station.getMinVolume(), station.getCurrentVolume());
    }

    @Test
    void shouldCreateRadioWithStationCount() {
        Radio station = new Radio(5);
        station.setCurrentVolume(1);

        station.decreaseCurrentVolume();
        station.decreaseCurrentVolume();

        Assertions.assertEquals(station.getMinVolume(), station.getCurrentVolume());

        org.junit.jupiter.api.Assertions Assertions;
    }
}

