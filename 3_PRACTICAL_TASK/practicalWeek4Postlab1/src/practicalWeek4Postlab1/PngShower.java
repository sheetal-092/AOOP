package practicalWeek4Postlab1;

public class PngShower implements AdvancedImageViewer{
	@Override
    public void showPng() {
        System.out.println("Showing PNG image");
    }

    @Override
    public void showJpg() {
        // Not applicable for PngShower
    }
}
