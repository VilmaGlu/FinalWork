package Tests.Lemodus;

import Tests.TestBase;
import org.testng.annotations.Test;

public class HomeTest extends TestBase {


    @Test
    private void test() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }

    }
}

