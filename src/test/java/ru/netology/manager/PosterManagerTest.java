package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    PosterManager manager = new PosterManager();



    @Test
    public void shlouldAddFilmInArrayLessLimit(){
        manager.addFilm("Kino1");
        manager.addFilm("Kino2");
        manager.addFilm("Kino3");

        String[] expected = {"Kino1", "Kino2", "Kino3"};
        String[] actual = manager.getFilm();

        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void shouldShowIfLimitPointed() {
        PosterManager manager1 = new PosterManager(3);
        manager1.addFilm("Kino1");
        manager1.addFilm("Kino2");
        manager1.addFilm("Kino3");
        manager1.addFilm("Kino4");
        manager1.addFilm("Kino5");
        manager1.addFilm("Kino6");

        String[] expected = {"Kino6", "Kino5", "Kino4"};
        String[] actual = manager1.findLast();

        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void shlouldAddFilmInArrayOverLimit(){
        manager.addFilm("Kino1");
        manager.addFilm("Kino2");
        manager.addFilm("Kino3");
        manager.addFilm("Kino4");
        manager.addFilm("Kino5");
        manager.addFilm("Kino6");
        manager.addFilm("Kino7");
        manager.addFilm("Kino8");
        manager.addFilm("Kino9");
        manager.addFilm("Kino10");
        manager.addFilm("Kino11");
        manager.addFilm("Kino12");

        String[] expected = {"Kino12", "Kino11", "Kino10", "Kino9", "Kino8", "Kino7", "Kino6", "Kino5", "Kino4", "Kino3"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected,actual);
    }
}
