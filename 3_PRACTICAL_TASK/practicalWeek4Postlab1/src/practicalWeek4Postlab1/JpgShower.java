package practicalWeek4Postlab1;

public class JpgShower implements AdvancedImageViewer{
	@Override
    public void showPng() {
        // Not applicable for JpgShower
    }

    @Override
    public void showJpg() {
        System.out.println("Showing JPG image");
    }
}
