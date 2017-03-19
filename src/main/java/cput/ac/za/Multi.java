package cput.ac.za;

/**
 * Created by Adeebo on 2017/03/19.
 */
public class Multi {

    Main main = new Main();

    public boolean calculate(){

        int number1 = 10;
        int number2 = 2;
        int number3 = 4;

        int val1, val2;
        boolean val3;

        val1 = main.Addition(number1,number3);
        val2 = main.Division(val1,number2);
        val3 = main.isEven(val2);

        return val3;
    }
}
