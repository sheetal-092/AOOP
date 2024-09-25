package practicalWeek4Postlab1;

public class ImageAdapter implements ImageViewer {
	AdvancedImageViewer advancedImageViewer;
    String imageType;

    public ImageAdapter(String imageType) {
        if (imageType.equalsIgnoreCase("png")) {
            advancedImageViewer = new PngShower();
        } else if (imageType.equalsIgnoreCase("jpg")) {
            advancedImageViewer = new JpgShower();
        }
        this.imageType = imageType;
    }

    @Override
    public void show() {
        if (imageType.equalsIgnoreCase("png")) {
            advancedImageViewer.showPng();
        } else if (imageType.equalsIgnoreCase("jpg")) {
            advancedImageViewer.showJpg();
        }
    }
}
