import java.util.Random;
public class SEARCHER
{
    private Random randomGenerator = new Random();
    private int[] numberList;
    private int target;
    private boolean found;

    public SEARCHER() {
    }

    public void processSearch()
    {
        numberList = new int[20];

        for (int i=0; i<20; i++) {
            numberList[i] = randomGenerator.nextInt(100);
            System.out.print(numberList[i] + " ");
        }
        System.out.println();

        found = false;
        target = randomGenerator.nextInt(100);
        int index = 0;
        while ((index < 20) && (!found)) {
            if (numberList[index] == target) {
                found = true;
            }
            System.out.print(numberList[index] + " ");
            index = index+1;
        }
        System.out.println();

        System.out.print("The value " + target  +" was ");
        if (found) {
            System.out.println("found.");
        }   else  {
            System.out.println("not found");
        }
    }
}
