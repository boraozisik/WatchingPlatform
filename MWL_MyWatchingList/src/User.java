import java.util.ArrayList;
import java.util.Scanner;



public class User {
	private String userName;
	private String password;
	private String email;
	private boolean isOnline;
	private int age;
	private ArrayList<User> friends;
	private ArrayList<Movie> watchedMovies;
	private ArrayList<Movie> planToWatchMovies;
	private ArrayList<TvSeries> watchedTvSeries;
	private ArrayList<TvSeries> planToWatchTvSeries;
	private ArrayList<Anime> watchedAnimes;
	private ArrayList<Anime> planToWatchAnimes;
	
	
	public User(String userName, String password, String email,int age) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.age = age;
		this.friends = new ArrayList<User>();
		this.watchedMovies = new ArrayList<Movie>();
		this.planToWatchMovies = new ArrayList<Movie>();
		this.watchedTvSeries = new ArrayList<TvSeries>();
		this.planToWatchTvSeries = new ArrayList<TvSeries>();
		this.watchedAnimes = new ArrayList<Anime>();
		this.planToWatchAnimes = new ArrayList<Anime>();
		
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isOnline() {
		return isOnline;
	}

	public void setOnline(boolean isOnline) {
		this.isOnline = isOnline;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void addFriend(User user) {
		this.friends.add(user);
	}	
	public void addWatchedMovie(Movie movie) {
		this.watchedMovies.add(movie);
	}
	public void addPlanToWatchMovie(Movie movie) {
		this.planToWatchMovies.add(movie);
	}
	public void addWatchedTvSerie(TvSeries tvSerie) {
		this.watchedTvSeries.add(tvSerie);
	}
	public void addPlanToWatchTvSerie(TvSeries tvSerie) {
		this.planToWatchTvSeries.add(tvSerie);
	}
	public void addWatchedAnime(Anime anime) {
		this.watchedAnimes.add(anime);
	}
	public void addPlanToWatchAnime(Anime anime) {
		this.planToWatchAnimes.add(anime);
	}
	public void viewFriends() {
		System.out.println(this.userName + "'S FRIENDS");
		System.out.println("**************************");
		 for(int i = 0; i < this.friends.size(); i++) {
			 System.out.println(i+1 + ".friends's name is: " + this.friends.get(i).getUserName());			 
		 }
	}
	public void reachFriendsInfo() {
		Scanner input = new Scanner(System.in);
		System.out.println("Which friend do you wanna reach? (number of your friend ==> like 1,2,3)");
		int answer = input.nextInt();	
		this.friends.get(answer-1).viewUserInfo();
		this.friends.get(answer-1).viewWatchedMovies();
		this.friends.get(answer-1).viewWatchedTvSeries();
		this.friends.get(answer-1).viewWatchedAnimes();
		this.friends.get(answer-1).viewPlanToWatchMovies();
		this.friends.get(answer-1).viewPlanToWatchTvSeries();
		this.friends.get(answer-1).viewPlanToWatchAnimes();
	}
	public void viewWatchedMovies() {
		System.out.println(this.userName + "'S WATCHED MOVIES");
		System.out.println("*********************************");
		for(int i = 0; i < this.watchedMovies.size(); i++) {
			System.out.println(i+1 + ":" + this.watchedMovies.get(i).getMovieName());
		}
	}
	public void viewPlanToWatchMovies() {
		System.out.println(this.userName + "'S PLAN TO WATCH MOVIES");
		System.out.println("***************************************");
		for(int i = 0; i < this.planToWatchMovies.size(); i++) {
			System.out.println(i+1 + ":" + this.planToWatchMovies.get(i).getMovieName());
		}
	}
	public void viewWatchedTvSeries() {
		System.out.println(this.userName + "'S WATCHED TV SERIES");
		System.out.println("************************************");
		for(int i = 0; i < this.watchedTvSeries.size(); i++) {
			System.out.println(i+1 + ":" + this.watchedTvSeries.get(i).getTvSerieName());
		}
	}
	public void viewPlanToWatchTvSeries() {
		System.out.println(this.userName + "'S PLAN TO WATCH TV SERIES");
		System.out.println("******************************************");
		for(int i = 0; i < this.planToWatchTvSeries.size(); i++) {
			System.out.println(i+1 + ":" + this.planToWatchTvSeries.get(i).getTvSerieName());
		}
	}
	public void viewWatchedAnimes() {
		System.out.println(this.userName + "'S WATCHED ANIMES");
		System.out.println("*********************************");
		for(int i = 0; i < this.watchedAnimes.size(); i++) {
			System.out.println(i+1 + ":" + this.watchedAnimes.get(i).getAnimeName());
		}
	}
	public void viewPlanToWatchAnimes() {
		System.out.println(this.userName + "'S PLAN TO WATCH ANIMES");
		System.out.println("***************************************");
		for(int i = 0; i < this.planToWatchAnimes.size(); i++) {
			System.out.println(i+1 + ":" + this.planToWatchAnimes.get(i).getAnimeName());
		}
	}
	public void viewUserInfo() {
		System.out.println("---USER INFORMATIONS---");
		System.out.println("***********************");
		System.out.println("Username:" +this.userName);
		System.out.println("E-mail:" +this.email);
		System.out.println("Age:" +this.age);
		System.out.println("Is Online? :" +this.isOnline);						
	}
	public boolean login(String username , String password) {
		if(isOnline == true) {
			System.out.println("You are already logged in...");
		}
		else if(username.equals(this.userName) & password.equals(this.password)) { 
			isOnline = true;
			System.out.println("Login successful , Welcome!!!");
		}
		else {
			System.out.println(" Login unsuccessful , wrong password or username...");
		}
		return this.isOnline;
	 }
	
	public void logout() {
		this.isOnline = false;
		System.out.println("You are logged out!!!");
	}
	public void suggestMovie() {
		int randomNumber = (int)(Math.random() * 6);
			if(randomNumber == 1) {
				Movie rm1 = new Movie("The Shawshank Redemption", "Drama", "Two imprisoned men bond over a number of years, finding solace and eventual"
						+ " redemption through acts of common decency.", 9.3);
				rm1.viewMovieInfo();
			}
			else if(randomNumber == 2) {
				Movie rm2 = new Movie("The Godfather", "Crime,Drama", "An organized crime dynasty's aging patriarch transfers control of his clandestine "
						+ "empire to his reluctant son.", 9.2);
				rm2.viewMovieInfo();
			}
			else if(randomNumber == 3) {
				Movie rm3 = new Movie(" 12 Angry Men", "Crime,Drama", "A jury holdout attempts to prevent a miscarriage of justice by forcing his "
						+ "colleagues to reconsider the evidence.", 8.9);
				rm3.viewMovieInfo();
			}
			else if(randomNumber == 4) {
				Movie rm4 = new Movie("The Lord of the Rings", "Action,Adventure", "A meek Hobbit from the Shire and eight companions set out on a journey "
						+ "to destroy the powerful One Ring and save Middle-earth from the Dark Lord Sauron.", 8.8);
				rm4.viewMovieInfo();
			}
			else {
				Movie rm5 = new Movie("Inception", "Sci-Fi,Action", "A thief who steals corporate secrets through the use of dream-sharing technology "
						+ "is given the inverse task of planting an idea into the mind of a C.E.O.", 8.8);
				rm5.viewMovieInfo();
			}
	}
	public void suggestTvSeries() {
		int randomNumber = (int)(Math.random() * 6);
			if(randomNumber == 1) {
				TvSeries rtvs1 = new TvSeries("How I Met Your Mother", "Comedy", "A father recounts to his children - through a series of flashbacks - "
						+ "the journey he and his four best friends took leading up to him meeting their mother.", 8.3);
				rtvs1.viewTvSerieInfo();
			}
			else if(randomNumber == 2) {
				TvSeries rtvs2 = new TvSeries("Prison Break", "Action,Crime", "Due to a political conspiracy, an innocent man is sent to death row and his"
						+ " only hope is his brother, who makes it his mission to deliberately get himself sent to the same prison in order to break the "
						+ "both of them out, from the inside.", 8.3);
				rtvs2.viewTvSerieInfo();
			}
			else if(randomNumber == 3) {
				TvSeries rtvs3 = new TvSeries("Elite", "Crime,Drama", "When three working-class teenagers begin attending an exclusive private school in "
						+ "Spain, the clash between them and the wealthy students leads to murder.", 7.5);
				rtvs3.viewTvSerieInfo();
			}
			else if(randomNumber == 4) {
				TvSeries rtvs4 = new TvSeries("Suits", "Comedy,Drama", "On the run from a drug deal gone bad, brilliant college dropout Mike Ross finds himself"
						+ " working with Harvey Specter, one of New York City's best lawyers.", 8.4);
				rtvs4.viewTvSerieInfo();
			}
			else {
				TvSeries rtvs5 = new TvSeries("TheCrown", "Biography", "Follows the political rivalries and romance of Queen Elizabeth II's reign"
						+ " and the events that shaped the second half of the twentieth century.", 8.6);
				rtvs5.viewTvSerieInfo();
			}
	}
	public void suggestAnime() {
		int randomNumber = (int)(Math.random() * 6);
			if(randomNumber == 1) {
				Anime ra1 = new Anime("Code Geass", "Action,Drama", "After being given a mysterious power to control others, an outcast prince becomes "
						+ "the masked leader of the rebellion against an all powerful empire", 8.7);
				ra1.viewAnimeInfo();
			}
			else if(randomNumber == 2) {
				Anime ra2 = new Anime("Attack on Titan", "Action", "After his hometown is destroyed and his mother is killed, young Eren Jaeger "
						+ "vows to cleanse the earth of the giant humanoid Titans that have brought humanity to the brink of extinction.", 9.0);
				ra2.viewAnimeInfo();
			}
			else if(randomNumber == 3) {
				Anime ra3 = new Anime("Black Clover", "Action", "Asta and Yuno were abandoned together at the same church and have been inseparable since."
						+ " As children, they promised that they would compete against each other to see who would become the next Emperor Magus.", 
						8.3);
				ra3.viewAnimeInfo();
			}
			else if(randomNumber == 4) {
				Anime ra4 = new Anime("Fullmetal Alchemist: Brotherhood", "Action", "Two brothers search for a Philosopher's Stone after "
						+ "an attempt to revive their deceased mother goes awry and leaves them in damaged physical forms.", 9.1);
				ra4.viewAnimeInfo();
			}
			else {
				Anime ra5 = new Anime("Bleach", "Action", "High school student Ichigo Kurosaki, who has the ability to see ghosts,"
						+ " gains soul reaper powers from Rukia Kuchiki and sets out to save the world from \"Hollows\".", 8.1);
				ra5.viewAnimeInfo();
			}
	}
	
}
