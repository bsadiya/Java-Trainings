package com.trainings.java.collectionframework;

public class Movie implements Comparable<Movie>{ // Comparable and comparator  -->implement sorting logic
	
	int rating;
	String name;
	
	public Movie(int rating, String name) {
		super();
		this.rating = rating;
		this.name = name;
	}
	
	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Movie [ name=" + name + "]";
	}

	
	/*
	 * @Override public int compareTo(Object o) { Movie m = (Movie) o; return
	 * name.compareTo(m.getName()); }
	 */
	
	
	/*
	 * @Override public int compareTo(Object o) { Movie m = (Movie) o;
	 * 
	 * if (rating < m.getRating()) { return -1; } else if (rating > m.getRating()) {
	 * return 1; } else { return 0; }
	 */
		
	/*
	 * @Override public int compareTo(Object o) { Movie m = (Movie) o;
	 * 
	 * if (name.length() < m.getName().length()) { return -1; } else if
	 * (name.length() > m.getName().length()) { return 1; } else { return 0; } }
	 */

		@Override
		public int compareTo(Movie m) {
			if (name.length() > m.getName().length()) {
				return -1;
			} else if (name.length() < m.getName().length()) {
				return 1;
			} else {
				return 0;
			}
		}
	 
	
	
	
}
