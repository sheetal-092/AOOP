package practical6ALms;

import java.util.ArrayDeque;

public class BrowsingHistory {
	 private ArrayDeque<String> history;
	    private String currentPage;

	    public BrowsingHistory() {
	        history = new ArrayDeque<>();
	        currentPage = null;
	    }

	    public void addPage(String page) {
	        if (currentPage != null) {
	            history.push(currentPage);
	        }
	        currentPage = page;
	    }

	    public void goBack() {
	        if (!history.isEmpty()) {
	            currentPage = history.pop();
	        }
	    }

	    public void displayCurrentPage() {
	        System.out.println("Current Page: " + currentPage);
	    }
}
