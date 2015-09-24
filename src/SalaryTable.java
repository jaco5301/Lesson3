
import hsa.*;
import BreezySwing.Format;

public class SalaryTable {

    public static void main(String[] args) {
        Console c = new Console();
        Format f = new Format();
        double salaryold = 0, salarynew = 40000, raise = 40000;
        c.print(Format.justify('r', "Year", 6));
        c.print(Format.justify('r', "Old Salary", 15));
        c.print(Format.justify('r', "Raise", 11));
        c.print(Format.justify('r', "New Salary\n", 17));
        c.print(Format.justify('r', "----", 6));
        c.print(Format.justify('r', "--- ------", 15));
        c.print(Format.justify('r', "-----", 11));
        c.print(Format.justify('r', "--- ------\n", 17));
        for (int x = 0; x <= 9; x++) {
            c.print(Format.justify('r', x + 1, 6));
            c.print(Format.justify('r', salaryold, 15, 2));
            c.print(Format.justify('r', raise, 12, 2));
            c.println(Format.justify('r', salarynew, 14, 2));
            raise = (salarynew * .03);
            salaryold = salarynew;
            salarynew = raise + salaryold;
        }

    }

}
