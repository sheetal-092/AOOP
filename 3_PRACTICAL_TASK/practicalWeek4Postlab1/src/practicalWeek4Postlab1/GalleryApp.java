package practicalWeek4Postlab1;

public class GalleryApp {
	ImageAdapter imageAdapter;

    public GalleryApp(String imageType) {
        imageAdapter = new ImageAdapter(imageType);
    }

    public void show() {
        imageAdapter.show();
    }
}
