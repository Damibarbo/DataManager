package com.example.voltifyd;

public class Brano {
    private String titolo;
    private String autore;
    private String genere;
    private Integer durata;

    public String getTitle() {
        return titolo;
    }
    public void setTitle(String title) {
        this.titolo = titolo;
    }
    public String getArtist() {
        return autore;
    }
    public void setArtist(String artist) {
        this.autore = autore;
    }
    public String getGenre() {
        return genere;
    }
    public void setGenre(String genre) {
        this.genere = genere;
    }
    public Integer getDuration() { return durata; }
    public void setDuration(Integer duration) {
        this.durata = durata;
    }
}
