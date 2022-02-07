
public class Movie {
	private String movieName;
	private String movieGenre;
	private String movieDescription;
	private double imdbPoint;
	
	public Movie(String movieName, String movieGenre, String movieDescription, double imdbPoint) {
		super();
		this.movieName = movieName;
		this.movieGenre = movieGenre;
		this.movieDescription = movieDescription;
		this.imdbPoint = imdbPoint;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieGenre() {
		return movieGenre;
	}

	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}

	public String getMovieDescription() {
		return movieDescription;
	}

	public void setMovieDescription(String movieDescription) {
		this.movieDescription = movieDescription;
	}

	public double getImdbPoint() {
		return imdbPoint;
	}

	public void setImdbPoint(double imdbPoint) {
		this.imdbPoint = imdbPoint;
	}
	public void viewMovieInfo() {
		System.out.println(this.movieName +"'S INFORMATIONS");
		System.out.println("*******************************");
		System.out.println("Movie Name:" +this.movieName);
		System.out.println("Movie Genre:" +this.movieGenre);
		System.out.println("Movie IMDB Point:" +this.imdbPoint);
		System.out.println("Movie Description:");
		System.out.println(this.movieDescription);
	}
	
	
	

	
	
	
	
}
