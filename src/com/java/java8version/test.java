package com.java.java8version;

import java.util.Arrays;
import java.util.List;

class Movies {
	private int year;
	private String moviename;
	private String code;

	Movies(int year, String moviename, String code)
	{
		this.year = year ;
		this.moviename= moviename;
		this.code= code;

	}
	public int getYear()
	{
		return  year;
	}
	public void setYear(int year)
	{
		this.year = year;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
}
public class test {

	public static void main(String[] args) 
	{
		List<Movies> list = Arrays.asList(new Movies(2021,"siva","si"),new Movies(2022,"guru","ss"),new Movies(2022,"raj","ss"),new Movies(2022,"mo","ss"));
		list.stream().filter(m->m.getYear() == 2022)
					.map(Movies::getMoviename)
					.sorted()
					.forEach(System.out::println);
	}
}
