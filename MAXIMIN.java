import java.util.Random;
public class MAXIMIN
{
    private Random randomGenerator = new Random();
    private int[] numberList;
    private int maxVal;
    private int minVal;

    public MAXIMIN() {
    }

    public void processMaxMin()
    {
        numberList = new int[20];

        for (int i=0; i<20; i++) {
            numberList[i] = randomGenerator.nextInt(100);
        }

        maxVal = numberList[0];
        minVal = maxVal;
        for (int i=1; i<20; i++) {
            if (numberList[i] > maxVal) {
                maxVal = numberList[i];
            } else {
                if (numberList[i] < minVal) {
                    minVal = numberList[i];
                }
            }
        }

        System.out.println("Max " + maxVal);
        System.out.println("Min " + minVal);
        System.out.println("Difference " + (maxVal - minVal));
    }
}
