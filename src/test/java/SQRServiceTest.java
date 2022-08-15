import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    void shouldCalculateUnderLimit() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.calculate(200, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNegativeNumber() {
        SQRService service = new SQRService();
        int expected = 8;
        int actual = service.calculate(-200, 300);
        Assertions.assertEquals(expected, actual);
    }
}
