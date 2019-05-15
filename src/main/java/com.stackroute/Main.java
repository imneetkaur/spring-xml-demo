package com.stackroute;

import com.stackroute.domain.Movie;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
    public static void main(String[] args) {
        //ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie = (Movie) context.getBean("movie");
        System.out.println(movie);

        Resource resource=new ClassPathResource("beans.xml");
        BeanFactory beanFactory=new XmlBeanFactory(resource);
        Movie movie1= (Movie) beanFactory.getBean("movie1");
        System.out.println(movie1);
    }


    //Exception message using autowire bytype
  /*  WARNING: Exception encountered during context initialization - cancelling refresh attempt:
    org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'movie1' defined in class path resource [beans.xml]:
    Unsatisfied dependency expressed through bean property 'actor';
    nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException:
    No qualifying bean of type 'com.stackroute.domain.Actor' available: expected single matching bean but found 3: actor,actor1,actor2
    Exception in thread "main" org.springframework.beans.factory.UnsatisfiedDependencyException:
    Error creating bean with name 'movie1' defined in class path resource [beans.xml]:
    Unsatisfied dependency expressed through bean property 'actor';
    nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException:
    No qualifying bean of type 'com.stackroute.domain.Actor' available:
    expected single matching bean but found 3: actor,actor1,actor2*/
}