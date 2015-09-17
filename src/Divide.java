
import hsa.*;

public class Divide {

    public static void main(String[] args) {
        Console c = new Console();
        int numb[];
        int answer=0;
        int remain=0;
        numb = new int[2];

        for (int x = 0; x <= 1; x++) {
            c.print("Enter number " + (x + 1) + ": ");
            numb[x] = c.readInt();
        }
        if(numb[0]<=numb[1])
        {
            answer=numb[1]/numb[0];
            remain=numb[1]%numb[0];
            c.print("" + numb[1]+" divided by " + numb[0]+ " equals " + answer + " with a remainder of " + remain);
        }
        else if(numb[1]<numb[0])
        {
            answer=numb[0]/numb[1];
            remain=numb[0]%numb[1];
            c.print("" + numb[0]+" divided by " + numb[1]+ " equals " + answer + " with a remainder of " + remain);
        }
    }
}
