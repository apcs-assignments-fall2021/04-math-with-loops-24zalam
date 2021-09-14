import java.util.Scanner;

public class MyMain {

    // Calculates the factorial of a number
    public static double factorial(int x) {
        int fact= 1;
        for (int y=1; y<x+1; y++) {
           fact*=y;
         }
        return fact;

        // factorial(4) : 1*2*3*4
        // factorial(5) : 1*2*3*4*5
        // facotirla(6) : 1*2*3*4*5*6



        //4*1*4*2*4*3*4*4


    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static double calculateE() {
        double calc=0;
        int fac=0;
        while (!((calc>(Math.E-0.00001 )) && ((calc<(Math.E+0.00001))))) {
        calc+=1/factorial(fac);
        fac+=1;

        }

        // calc : 0
        // calc : 0 + 1/factorial(0)
        // calc : 0 + 1/factorial(0) + 1/factorial(1)


        return calc;
        }

    // Let's assume that x is the inputted double
    //Start with a guess, n. n can be any positive number.
    //Use the following formula to get a better guess: m = (n + x/n) / 2
    //As m is a better guess than n, update the value of your guess (set n = m)
    //Repeat steps 1-4 (with a loop) until the difference between your current n value and your previous n value is less than 0.00001
    //At this point, n will be a very close approximation of the squareroot.
    public static double babylonian(double x) {
        double n = Math.abs(x);
        //double m = (n + x / n) / 2;
        double y=1;
        //n = m;
        double e = 0.00001;

        while (Math.abs(x - y) > e) {
            x = (x + y) / 2;
            y = n / x;

        }
        return x;






    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //factorial(10);
        //System.out.println(factorial(10));
        //System.out.println(calculateE());
        //System.out.println(Math.E);
        babylonian(16);
        System.out.println(babylonian(16));





        scan.close();
    }
}
