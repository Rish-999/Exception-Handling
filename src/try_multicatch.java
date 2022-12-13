class Try_multicatch
{
    public static void main(String[] args) {
        {
            try {
                int x = 25 / 5;//In try if this runs fine then check interpreter will check for another logical error
                System.out.println(x);
                int arr[] = new int[5]; //like this and in this case we will use try-multicatch
                arr[6] = 45;
                System.out.println(arr[9]);
            }
            catch (ArithmeticException aee) {
                System.out.println("Exception: " + aee);
                System.out.println("You can't a number by zero");
            }
            catch (IndexOutOfBoundsException iobe) {
                System.out.println("Exception: " + iobe);
                System.out.println("Index not found or available");
            }
        }

    }
}
