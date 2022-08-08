package ru.netology.manager;


public class PosterManager {
    private String [] films = new String[0];
    private int limit;

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public PosterManager() {
        limit = 10;
    }

    public String[] getFilm() {
        return films;
    }

    public void addFilm(String film) {
        String[] tmp = new String[films.length + 1];
        for(int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int resultLenght;
        if (limit <= films.length) {
            resultLenght = limit;
        } else {
            resultLenght = films.length;
        }
        String[] tmp = new String[resultLenght];
        for (int i = 0; i < tmp.length; i++){
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }

}
