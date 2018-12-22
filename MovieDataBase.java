import java.util.*;
import java.util.Scanner;
public class MovieDataBase
{
public static void main(String[]args) throws Exception
{
//arraylist to store movies List declared
ArrayList<Movie> moviesList = new ArrayList<Movie>();
Scanner sc = new Scanner(System.in);
while(true){
System.out.println("1. Add 2. Delete 3. Sort by title 4.sort by rating 5.sort by boxoffice gross 6.sort by director 7.exit");
int choice = sc.nextInt();
if(choice == 1){ //adding new movie
System.out.println("Enter movie name: ");
//System.out.println();
String movieName = sc.nextLine();

System.out.println("Enter movie year: ");
String movieYear = sc.nextLine();
System.out.println("Enter movie rating: ");
int rating = sc.nextInt();
System.out.println("Enter movie Director: ");
String director = sc.nextLine();
System.out.println("Enter movie box office gross: ");
float gross = sc.nextFloat();
System.out.println("Enter movie coments: ");
String comments = sc.nextLine();
System.out.println("Enter your ratings: ");
int yourRating = sc.nextInt();
Movie obj = new Movie(movieName,movieYear,rating,director,gross,comments,yourRating);
moviesList.add(obj);
}
//delete
else if(choice == 2){
System.out.println("Enter title name to delete: ");
String delete = sc.nextLine();
for(int i=0;i<moviesList.size();i++){
if(moviesList.get(i).getMovie_name().equals(delete)){
moviesList.remove(i);
break;
}
}
}
else if(choice == 3){ //sorting by title
Collections.sort(moviesList, Movie.TitleComparator);
for(int i=0;i<moviesList.size();i++){
System.out.println(moviesList.get(i));
}
}
else if(choice == 4){ //sorting by rating
Collections.sort(moviesList, Movie.RatingComparator);
for(int i=0;i<moviesList.size();i++){
System.out.println(moviesList.get(i));
}
}
else if(choice == 5){ //sorting by gross
Collections.sort(moviesList, Movie.GrossComparator);
for(int i=0;i<moviesList.size();i++){
System.out.println(moviesList.get(i));
}
}
else if(choice == 6){ //sorting by director
Collections.sort(moviesList, Movie.DirectorComparator);
for(int i=0;i<moviesList.size();i++){
System.out.println(moviesList.get(i));
}
}
else{
System.out.println("Bye");
break;
}
}
}
}