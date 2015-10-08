import java.util.Random;
public class SEARCHERB
{
    private Random randomGenerator = new Random();
    private int[] numbers;
    private int tNumber;
    int fNumber;

    public SEARCHERB() {
    }

    public void processSearch()
    {
        numbers = new int[20];

        for (int i=0; i<20; i++) {
            numbers[i] = randomGenerator.nextInt(100);
        }

        tNumber = randomGenerator.nextInt(100);
        for (int i=0; i<20; i++) {
            if (numbers[i] == tNumber) {
                fNumber = 1;
            } else {
                fNumber = 0;
            }
        }

        if (fNumber==1) {
            System.out.println("Yes");
        }

        if (fNumber==0) {
            System.out.println("No");
        }
    }
}
