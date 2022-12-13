//Exception is unresolved condition occur in the run time and can interrupt the flow of the program from expected flow

//Exception can be handled but error can't.

//In java.lang by default package there is a Super class Throwable and have its own child class Error and Exception.

//Exception class has try,catch,finally,throw and throws methods to handle exception.

class Exception {
    public static void main(String[] args)
    {
       try {
           int x = 25 / 5;
           System.out.println(x);
       }
       catch (ArithmeticException aee)
       {
           System.out.println("Exception: "+aee);
           System.out.println("You can't a number by zero");
       }
       finally {
           System.out.println("i always runs in the end of try and catch independently");
       }



    }
}