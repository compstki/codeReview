import java.util.Random;
public class MAXIMINB
{
    private Random randomGenerator = new Random();
    private int[] numberList;
    private int maxVal;
    private int minVal;
    private int difference;

    public MAXIMINB() {
    }

    public void processMaxMin()
    {
        numberList = new int[30];

        for (int i=0; i<30; i++) {
            numberList[i] = randomGenerator.nextInt(100);
        }

        maxVal = 0;
        minVal = 100;
        
        int index = 0;
        while (index < 30) {
            
            if ((numberList[index] > maxVal) && (numberList[index] != maxVal)){
                maxVal = numberList[index];
            }
            
            index = index + 1;
            difference = maxVal - minVal;
        }

        index = 0;
        while (index < 30) {
            if ((numberList[index] < minVal) && (numberList[index] != minVal)) {
                minVal = numberList[index];
            }
            index = index + 1;
            difference = maxVal - minVal;
        }

        System.out.println("Max " + maxVal);
        System.out.println("Min " + minVal);   
        System.out.println("Difference " + difference);   
    }
}
