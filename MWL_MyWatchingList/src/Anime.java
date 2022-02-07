
public class Anime {
	private String animeName;
	private String animeGenre;
	private String animeDescription;
	private double imdbPoint;
	
	public Anime(String animeName, String animeGenre, String animeDescription, double imdbPoint) {
		super();
		this.animeName = animeName;
		this.animeGenre = animeGenre;
		this.animeDescription = animeDescription;
		this.imdbPoint = imdbPoint;
	}

	public String getAnimeName() {
		return animeName;
	}

	public void setAnimeName(String animeName) {
		this.animeName = animeName;
	}

	public String getAnimeGenre() {
		return animeGenre;
	}

	public void setAnimeGenre(String animeGenre) {
		this.animeGenre = animeGenre;
	}

	public String getAnimeDescription() {
		return animeDescription;
	}

	public void setAnimeDescription(String animeDescription) {
		this.animeDescription = animeDescription;
	}

	public double getImdbPoint() {
		return imdbPoint;
	}

	public void setImdbPoint(double imdbPoint) {
		this.imdbPoint = imdbPoint;
	}
	public void viewAnimeInfo() {
		System.out.println(this.animeName +"'S INFORMATIONS");
		System.out.println("*******************************");
		System.out.println("Anime Name:" +this.animeName);
		System.out.println("Anime Genre:" +this.animeGenre);
		System.out.println("Anime IMDB Point:" +this.imdbPoint);
		System.out.println("Anime Description:");
		System.out.println(this.animeDescription);
	}
	
}
