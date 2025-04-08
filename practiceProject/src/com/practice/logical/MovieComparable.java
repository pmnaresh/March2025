package com.practice.logical;

import java.util.Comparator;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

	public class MovieComparable {
	    public static void main(String[] args) {
	        NavigableSet<Movie> movieList = new TreeSet<Movie>();
	        movieList.add(new Movie("Bahubali", 8.3, 2015));
	        movieList.add(new Movie("Janbar", 8.7, 1977));
	        movieList.add(new Movie("Mr.India", 8.8, 1980));
	        movieList.add(new Movie("Amar Akbar Anthony", 8.4, 1983));

	        System.out.println("Movies after sorting: ");
	        for (Movie movie : movieList) {
	            System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
	        }
	        //assending
	      List<Movie> assenMovie=  movieList.stream().sorted(Comparator.comparing(Movie::getRating)).collect(Collectors.toList());
	      System.out.println(assenMovie);
	      //desending
	      List<Movie> desendMovie=  movieList.stream().sorted(Comparator.comparing(Movie::getRating).reversed()).collect(Collectors.toList());
	      System.out.println(desendMovie);
	    }
	}
	class Movie implements Comparable<Movie> {
	    private double rating;
	    private String name;
	    private int year;

	    public int compareTo(Movie m) {
	        return this.year - m.year;
	    }

	    public Movie(String name, double rating, int year) {
	        this.name = name;
	        this.rating = rating;
	        this.year = year;
	    }

	    public double getRating() { return rating; }
	    public String getName() { return name; }
	    public int getYear() { return year; }
	    
	    @Override
	    public String toString() {
	        return "Movie{name='" + name + "', rating=" + rating + ", year=" + year + "}";
	    }
	}

