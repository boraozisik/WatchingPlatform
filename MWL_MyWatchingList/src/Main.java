
public class Main {

	public static void main(String[] args) {
		SignUpManager signUpManager = new SignUpManager(new UserCheckInfo());
		User u1 = new User("Giorno Giovanna", "1234", "JoJo@gg.com", 21);
		signUpManager.signUp(u1, "Bora", "Özýþýk");
		u1.login("Giorno Giovanna", "1234");
		System.out.println("****************************************");
		Movie m1 = new Movie("Fight Club", "Drama", "An insomniac office worker and a devil-may-care soap maker form an underground fight club that "
				+ "evolves into much more.", 8.8);
		Movie m2 = new Movie("The Matrix", "Action,Sci-Fi", "When a beautiful stranger leads computer hacker Neo to a forbidding underworld,"
				+ " he discovers the shocking truth--the life he knows is the elaborate deception of an evil cyber-intelligence.", 8.7);
		Movie m3 = new Movie("The Green Mile ", "Crime,Drama", "The lives of guards on Death Row are affected by one of their charges: a black man "
				+ "accused of child murder and rape, yet who has a mysterious gift.", 8.6);
		Movie m4 = new Movie("Star Wars", "Action,Adventure,Fantasy", "Luke Skywalker joins forces with a Jedi Knight, a cocky pilot, "
				+ "a Wookiee and two droids to save the galaxy from the Empire's world-destroying battle station, while also attempting to"
				+ " rescue Princess Leia from the mysterious Darth Vader.", 8.6);
		Movie m5 = new Movie("Interstellar", "Adventure,Drama,Sci-Fi", "A team of explorers travel through a wormhole in space"
				+ " in an attempt to ensure humanity's survival.", 8.6);
		Movie m6 = new Movie("The Pianist", "Biography,Drama", "A Polish Jewish musician struggles to survive the destruction of the Warsaw "
				+ "ghetto of World War II.", 8.5);
		u1.addWatchedMovie(m2);
		u1.addWatchedMovie(m4);
		u1.addWatchedMovie(m5);
		u1.addPlanToWatchMovie(m1);
		u1.addPlanToWatchMovie(m3);
		u1.addPlanToWatchMovie(m6);
		u1.viewWatchedMovies();
		u1.viewPlanToWatchMovies();
		System.out.println("****************************************");
		TvSeries tvs1 = new TvSeries("Friends", "Comedy,Romance", "Follows the personal and professional lives of six twenty to "
				+ "thirty-something-year-old friends living in Manhattan.", 8.9);
		TvSeries tvs2 = new TvSeries("Vikings", "Action,Adventure", "Vikings transports us to the brutal and mysterious"
				+ " world of Ragnar Lothbrok, a Viking warrior and farmer who yearns to explore - and raid - the distant shores across the ocean.", 8.5);
		TvSeries tvs3 = new TvSeries("Breaking Bad", "Crime,Drama", "A high school chemistry teacher diagnosed with inoperable lung cancer "
				+ "turns to manufacturing and selling methamphetamine in order to secure his family's future.", 9.4);
		TvSeries tvs4 = new TvSeries("Dark", "Crime,Drama,Mystery", "A family saga with a supernatural twist, set in a German town,"
				+ " where the disappearance of two young children exposes the relationships among four families.", 8.8);
		TvSeries tvs5 = new TvSeries("Brooklyn Nine-Nine", "Comedy,Crime", "Comedy series following the exploits of Det. Jake"
				+ " Peralta and his diverse, lovable colleagues as they police the NYPD's 99th Precinct.", 8.4);
		TvSeries tvs6 = new TvSeries("Sherlock", "Crime,Mystery", "A modern update finds the famous sleuth and his doctor partner "
				+ "solving crime in 21st century London.", 9.1);
		u1.addWatchedTvSerie(tvs1);
		u1.addWatchedTvSerie(tvs2);
		u1.addWatchedTvSerie(tvs3);
		u1.addPlanToWatchTvSerie(tvs4);
		u1.addPlanToWatchTvSerie(tvs5);
		u1.addPlanToWatchTvSerie(tvs6);
		u1.viewWatchedTvSeries();
		u1.viewPlanToWatchTvSeries();
		System.out.println("****************************************");
		Anime a1 = new Anime("One Piece", "Action,Adventure", "Follows the adventures of Monkey D. Luffy and his pirate crew in order "
				+ "to find the greatest treasure ever left by the legendary Pirate, Gold Roger. The famous mystery treasure named \"One Piece\".", 8.8);
		Anime a2 = new Anime("JoJo's Bizarre Adventure", "Action,Adventure", "The story of the Joestar family, who are possessed"
				+ " with intense psychic strength, and the adventures each member encounters throughout their lives.", 8.4);
		Anime a3 = new Anime("Gintama", "Comedy,Action", "In an era where aliens have invaded and taken over feudal Tokyo, an "
				+ "unemployed samurai finds work however he can.", 8.6);
		Anime a4 = new Anime("The Disastrous Life of Saiki K.", "Comedy,Fantasy", "Saiki Kusuo is a powerful psychic who hates attracting attention, "
				+ "yet he is surrounded by colorful characters who always find a way to remove him from his everyday life.", 8.3);		
		Anime a5 = new Anime("Tenkuu Shinpan", "Action,Horror", "High schooler Yuri finds herself atop a skyscraper in a strange world, where "
				+ "she must survive against masked assailants bent on killing their prey.", 6.7);
		Anime a6 = new Anime("Tokyo Revengers", "Action,Drama", "A middle-aged loser travels in time to his school years and in order to save the "
				+ "love of his life from future doom, he must become the leader of a dreaded school gang.", 8.6);
		u1.addWatchedAnime(a1);
		u1.addWatchedAnime(a2);
		u1.addWatchedAnime(a3);
		u1.addPlanToWatchAnime(a4);
		u1.addPlanToWatchAnime(a5);
		u1.addPlanToWatchAnime(a6);
		u1.viewWatchedAnimes();
		u1.viewPlanToWatchAnimes();
		System.out.println("****************************************");
		User u2 = new User("Joseph Joestar", "4321", "jojo@jj.com", 21);
		signUpManager.signUp(u2, "Rüzgar", "Özýþýk");
		u2.addFriend(u1);
		u2.viewFriends();
		u2.reachFriendsInfo();
		System.out.println("****************************************");
		u1.suggestMovie();
		u1.suggestTvSeries();
		u1.suggestAnime();
		
		

	}

}
