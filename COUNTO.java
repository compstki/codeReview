import java.util.Random;
import javax.swing.JOptionPane;    

public class COUNTO
{
    private Random randomGenerator = new Random();
    private int[] scoreList;
    private int passMark;
    private int passCount;
    private int classSize;

    public COUNTO() {
    }

    public void processCount()
    {
        classSize = 20;
        scoreList = new int[classSize];
        for (int i=0; i < classSize; i++) {
            scoreList[i] = randomGenerator.nextInt(100);
        }

        passCount = 0;
        passMark = Integer.parseInt(JOptionPane.showInputDialog("Enter passmark ;"));
        for (int i = 0; i < classSize; i++) {
            if (scoreList[i] >= passMark) {
                passCount++;
            }
            System.out.print(scoreList[i] + "(" + passCount + ") ");
        }
        System.out.println();

        System.out.println("The passes on or above " + passMark + " is " + passCount);
        System.out.println("The fails is " + (classSize-passCount));
    }
}
