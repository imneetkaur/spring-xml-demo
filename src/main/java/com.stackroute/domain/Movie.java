package com.stackroute.domain;

public class Movie {
    private String movieName;
    private String genre;
    Actor actor;

    public Movie() {
        System.out.println("MOVIE");
    }
    //constructor injection
    public Movie(Actor actor){
        this.actor=actor;
    }
    public Movie(String movieName, String genre,Actor actor) {
        this.movieName = movieName;
        this.genre = genre;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    //SetterInjection
    public void setActor(Actor actor){
        this.actor=actor;
    }
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }



    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", genre='" + genre + '\'' +
                ", actor=" + actor +
                '}';
    }
}
