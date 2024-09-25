package practical6ALms;

public class BrowsingHistoryApp {
	public static void main(String[] args) {
        BrowsingHistory history = new BrowsingHistory();
        history.addPage("Page 1");
        history.addPage("Page 2");
        history.goBack();
        history.displayCurrentPage();
    }
}
