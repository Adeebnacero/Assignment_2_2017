package cput.ac.za;

/**
 * Created by Adeebo on 2017/03/18.
 */
public class Main {

    public int Addition(int n1, int n2){

        return n1 + n2;
    }

    public String nullTest(String notEmpty){

        if (notEmpty == "")
            return "Null";
        else
            return notEmpty;
    }

    public String value(String a){

        return a;
    }

    public double floatingPoint(double a, double b){

        return a + b;
    }

    public boolean isEven(double num)
    {
        if(num%2 == 0)
        {
            System.out.print(true);
            return true;
        }
        else
        {
            System.out.print(false);
            return false;
        }
    }
}
