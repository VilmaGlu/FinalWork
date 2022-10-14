package lt.pages.Lemodus;

import lt.pages.Common;

public class HomePage {

    public static void setUp() {
        Common.setUp();

    }

    public static void open(String url) {
        Common.openUrl(url);

    }

    public static void close() {
        Common.close();
    }
}
