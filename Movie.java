import java.util.Comparator;

public class Movie {

private String movie_name;
private String movie_year;
private int movie_rating;
private String movie_director;
private float movie_boxofficegross;
private String comment;
private int rating;

public Movie(String moviename, String movieyear, int movierating, String moviedirector, float movieboxofficegross,String comm,int rat) {
this.movie_name = moviename;
this.movie_year = movieyear;
this.movie_rating = movierating;
this.movie_director = moviedirector;
this.movie_boxofficegross = (float) movieboxofficegross;
this.comment = comm;
this.rating = rat;
}
//getter methods
public String getMovie_name() {
return movie_name;
}

public String getMovie_year() {
return movie_year;
}

public int getMovie_rating() {
return movie_rating;
}

public String getMovie_director() {
return movie_director;
}

public float getMovie_boxofficegross() {
return movie_boxofficegross;
}

public String getComment() {
return comment;
}

public int getRating() {
return rating;
}

//toString method

@Override
public String toString() {
return "movie{" + "movie_name=" + movie_name + ", movie_year=" + movie_year + ", movie_rating=" + movie_rating + ", movie_director=" + movie_director + ", movie_boxofficegross=" + movie_boxofficegross + ", comment=" + comment + ", rating=" + rating + '}';
}
//title comparator
public static Comparator<Movie> TitleComparator = new Comparator<Movie>() {

   public int compare(Movie s1, Movie s2) {
   String title1 = s1.getMovie_name().toUpperCase();
   String title2 = s2.getMovie_name().toUpperCase();
   //ascending order
   return title1.compareTo(title2);
}};

//rating comparator
public static Comparator<Movie> RatingComparator = new Comparator<Movie>() {

   public int compare(Movie s1, Movie s2) {
   int rating1 = s1.getMovie_rating();
   int rating2 = s2.getMovie_rating();
   //ascending order
   return rating1-rating2;
}};

//gross comparator
public static Comparator<Movie> GrossComparator = new Comparator<Movie>() {

   public int compare(Movie s1, Movie s2) {
   int rating1 = (int) s1.getMovie_boxofficegross();
   int rating2 = (int) s2.getMovie_boxofficegross();
   //ascending order
   return rating1-rating2;
}};

//director comparator
public static Comparator<Movie> DirectorComparator = new Comparator<Movie>() {

   public int compare(Movie s1, Movie s2) {
   String title1 = s1.getMovie_director().toUpperCase();
   String title2 = s2.getMovie_director().toUpperCase();
   //ascending order
   return title1.compareTo(title2);
}};

  
}