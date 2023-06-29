import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ImageCounterTest {

    private ImageCounter imageCounter;

    // I leave the @BeforeEach here - in case the class will get bigger and we need additional tests
    @BeforeEach
    public void setup() {
        imageCounter = new ImageCounter();
    }

    @Test
    public void testCountImages() {
        String html = "<html><body><img src=\"image1.jpg\"><p>Text</p><img src=\"image2.jpg\"></body></html>";
        assertEquals(2, imageCounter.countImages(html));
        html = "<html><body><p>Text</p></body></html>";
        assertEquals(0, imageCounter.countImages(html));
    }

}