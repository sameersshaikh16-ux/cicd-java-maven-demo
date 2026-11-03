
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void testApplicationMessage() {

        App app = new App();

        String actual = app.getMessage();

        String expected = "Java application is running successfully!";

        assertEquals(expected, actual);
    }
}
