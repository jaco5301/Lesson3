
import hsa.*;

public class Employeepay {

    public static void main(String[] args) {
        Console c = new Console();
        double[] time;
        time = new double[5];
        double[] salary;
        salary = new double[5];

        for (int x = 0; x <= 4; x++) {
            while (true) {
                c.print("Enter employee " + (x + 1) + "'s pay: ");
                time[x] = c.readDouble();
                if (time[x] <= 70 & time[x] > 0) {
                    break;
                } else {
                    c.print("Invalid hours worked\n");
                }
            }
        }
        for (int x = 0; x <= 4; x++) {
            while (true) {
                if (time[x] <= 40) {
                    salary[x] = time[x] * 15;
                    c.print("\nEmployee " + (x + 1) + "'s pay is: $" + salary[x]);
                    break;
                } else {
                    time[x] -= 40;
                    salary[x] = time[x] * 22 + 600;
                    c.print("\nEmployee " + (x + 1) + "'s pay is: $" + salary[x]);
                    break;
                }
            }
        }

    }

}
