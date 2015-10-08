import java.util.Random;
import javax.swing.JOptionPane;    

public class COUNTOB
{
    private Random randomGenerator = new Random();
    private int[] list;
    private int pass;
    private int fail;

    public COUNTOB() {
    }

    public void processCount()
    {
        list = new int[20];
        for (int i = 0; i < 20; i++) {
            list[i] = randomGenerator.nextInt(100);
        }

        pass = 0;
        fail = 0;

        for (int i = 0; i < 20; i++) {
            if (list[i] > 50) {
                pass = pass + 1;
            }
        }

        for (int i = 0; i < 20; i++) {
            if (list[i] < 50) {
                fail = fail + 1;
            }
        }

        System.out.println("Pass " + pass);
        System.out.println("Fail " + fail);
    }
}