package lt.pages;

import utils.Driver;

public class Common {
    public static void setUp() {
        Driver.setDriver();

    }

    public static void openUrl(String url) {
        Driver.openUrl(url);
    }

    public static void close() {
        Driver.close();
    }
}

