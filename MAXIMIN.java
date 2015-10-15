import java.util.Random;
public class MAXIMIN
{

    public MAXIMIN() {
    }

    public void processMaxMin()
    {
        Random randomGenerator = new Random();
        int[] tempList;
        int maxTemperature;
        int minTemperature;
        int tempReadings = 30;

        tempList = new int[tempReadings];

        for (int i=0; i<tempReadings; i++) {
            tempList[i] = randomGenerator.nextInt(25);
        }

        maxTemperature = tempList[0];
        minTemperature = tempList[0];

        for (int i=1; i<tempReadings; i++) {

            if (tempList[i] > maxTemperature) {
                maxTemperature = tempList[i];

            } else {

                if (tempList[i] < minTemperature) {
                    minTemperature = tempList[i];
                }
            }
        }

        System.out.println("Max " + maxTemperature);
        System.out.println("Min " + minTemperature);
        System.out.println("Difference " + (maxTemperature - minTemperature));
    }
}
