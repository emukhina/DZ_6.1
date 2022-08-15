public class SQRService {

    public int calculate(int startLimit, int endLimit) {
        int sum = 0;
        for (int i = 10; i <= 99; i++) {
            if (startLimit <= i * i && i * i <= endLimit) {
                sum++;
            }
        }
        return sum;
    }
}
