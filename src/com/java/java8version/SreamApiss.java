package com.java.java8version;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Movie
{
	private String movieName;
	private int releaseYear;
	private List<String> certify;

	public Movie(String movieName, int releaseYear, List<String> certify) {
		super();
		this.movieName = movieName;
		this.releaseYear = releaseYear;
		this.certify = certify;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	public List<String> getCertify() {
		return certify;
	}
	public void setCertify(List<String> certify) {
		this.certify = certify;
	}
}
public class SreamApiss {

	public static void main(String[] args) 
	{
		//List<Movie> movieList = Arrays.asList(new Movie("siva",2020,"ds"),new Movie("sri",2025,"A11"));
	 List<Movie> movieList = Arrays.asList(new Movie("siva",2020,Arrays.asList("siva","sirngdn")));
		
		
		
//		 movieList.stream().flatMap(t -> t.)

		/*movieList.stream().filter(m->m.getReleaseYear() == 2025)
						  .map(Movie::getMovieName)
					  .forEach(System.out::println);*/

		//limit method

		Stream.of(0,1,2,3,4,5,6,7,8)
			  .limit(6)
			  .forEach(num->System.out.print("\n"+num));

		Stream.of(0,1,2,3,4,5,6,7,8)
			  .skip(6)
			  .forEach(num->System.out.println("\n"+num));
		
		
			System.out.println("Current Local Date: " + LocalDate.now());
	        //Used LocalDate API to get the date
	        System.out.println("Current Local Time: " + LocalTime.now());
	        //Used LocalTime API to get the time
	        System.out.println("Current Local Date and Time: " + LocalDateTime.now());
	        //Used LocalDateTime API to get both date and time
	        
	        /*************************************************************/
	        
	        
	        System.out.println("Intermediate Operation won't execute");
	        Arrays.stream(new int[] { 0, 1 }).map(i -> {
	            System.out.println(i);
	            return i;
	            // No terminal operation so it won't execute
	        });
	 
	        System.out.println("Terminal operation starts here");
	        Arrays.stream(new int[] { 0, 1 }).map(i ->{
	            System.out.println(i);
	            return i;
	            // This is followed by terminal operation sum()
	        }).sum();
	        
	        
	        //Map and flatMap  Difference 
	        List<String> Names = Arrays.asList("Saket", "Trevor", "Franklin", "Michael");
	        
	       List<String> UpperCase = Names.stream().map(String::toUpperCase).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	 
	        UpperCase.forEach(m->System.out.println(m));
	        
	        
	      
	}

}
