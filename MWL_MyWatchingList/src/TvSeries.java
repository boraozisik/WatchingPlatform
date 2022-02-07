
public class TvSeries {
	private String tvSerieName;
	private String tvSerieGenre;
	private String tvSerieDescription;
	private double imdbPoint;
	
	
	public TvSeries(String tvSerieName, String tvSerieGenre, String tvSerieDescription, double imdbPoint) {
		super();
		this.tvSerieName = tvSerieName;
		this.tvSerieGenre = tvSerieGenre;
		this.tvSerieDescription = tvSerieDescription;
		this.imdbPoint = imdbPoint;
	}


	public String getTvSerieName() {
		return tvSerieName;
	}


	public void setTvSerieName(String tvSerieName) {
		this.tvSerieName = tvSerieName;
	}


	public String getTvSerieGenre() {
		return tvSerieGenre;
	}


	public void setTvSerieGenre(String tvSerieGenre) {
		this.tvSerieGenre = tvSerieGenre;
	}


	public String getTvSerieDescription() {
		return tvSerieDescription;
	}


	public void setTvSerieDescription(String tvSerieDescription) {
		this.tvSerieDescription = tvSerieDescription;
	}


	public double getImdbPoint() {
		return imdbPoint;
	}


	public void setImdbPoint(double imdbPoint) {
		this.imdbPoint = imdbPoint;
	}
	public void viewTvSerieInfo() {
		System.out.println(this.tvSerieName +"'S INFORMATIONS");
		System.out.println("*******************************");
		System.out.println("Tv Serie Name:" +this.tvSerieName);
		System.out.println("Tv Serie Genre:" +this.tvSerieGenre);
		System.out.println("Tv Serie's IMDB Point:" +this.imdbPoint);
		System.out.println("Tv Serie's Description:");
		System.out.println(this.tvSerieDescription);
	}
	
	
	
	
	
	
	
}
