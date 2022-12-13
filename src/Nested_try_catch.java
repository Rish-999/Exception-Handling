//finally runs independently try or catch no matter exception occcur or not finally block will always run in the
// End.
class Nested_try_catch {
    public static void main(String[] args) {
        try
        {
            int x = 25/5; //In try if this line runs fine then interpreter will go to the next nested try block to check for exception else
            // it will jump to it's catch block and nested try won't run anyway like nested if-else.
            System.out.println(x);
            try {
                int arr[] = new int[5];
                arr[7] = 57;
                System.out.println(arr[9]);
            }
            catch (IndexOutOfBoundsException iobe)
            {
                System.out.println("Exception: "+ iobe);
                System.out.println("index not exists");
            }
            finally {
                System.out.println("I am finally of nested try");
            }
        }
        catch (ArithmeticException ae)
        {
            System.out.println("Exception: "+ae);
            System.out.println("number can't divide by zero");
        }
        //finally always runs independent of try & catch block
        finally {
            System.out.println("i am finally of Try");
        }
    }
}
