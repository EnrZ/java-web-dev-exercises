package exercises.technology;

public class SmartPhone extends Computer {

    private int appsDownloaded;

    public SmartPhone(int storage, int ram, String brand, int appsDownloaded) {
        super(storage, ram, brand);
        this.appsDownloaded = appsDownloaded;
    }

    public void downloadApp() {
        this.appsDownloaded = this.appsDownloaded + 1;
    }

    public int getAppsDownloaded() {
        return this.appsDownloaded;
    }
}
