package com.stackroute.domain;

import com.stackroute.domain.Actor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie  implements ApplicationContextAware, BeanNameAware , BeanFactoryAware {
    private String movieName;
    private String genre;
    Actor actor;
    private ApplicationContext applicationContext =null;

    public Movie() {
        //System.out.println("MOVIE");
    }
    //constructor
    public Movie(Actor actor){
        this.actor=actor;
    }
    public Movie(String movieName, String genre,Actor actor) {
        this.movieName = movieName;
        this.genre = genre;
        this.actor=actor;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    //Setters
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
    public void setApplicationContext(ApplicationContext context) throws BeansException
    {
        this.applicationContext = context;
    }
    @Override
    public void setBeanName(String beanName)
    {
        System.out.println("Bean name is: "+beanName);
    }
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory is  " +beanFactory);
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