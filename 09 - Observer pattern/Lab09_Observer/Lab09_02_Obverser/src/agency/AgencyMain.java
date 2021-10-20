package agency;

public class AgencyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NewsAgency observable = new NewsAgency();
		NewsChannel observer = new NewsChannel();

		observable.addObserver(observer);
		observable.setNews("news");
		assertEquals(observer.getNews(), "news");
	}

}
