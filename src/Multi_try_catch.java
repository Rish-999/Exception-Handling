class Multi_try_catch {
    public static void main(String[] args) {
        try
        {
            int x = 25/0;
            System.out.println(x);
        }
        catch (ArithmeticException ae)
        {
            System.out.println("Exception: "+ae);
            System.out.println("You cant divide a number by zero");
        }
        //it is necessary to use the specified catch just after that try block

        try
        {
            int arr[] = new int[5];
            arr[7] = 45;
            System.out.println(arr[9]);
        }
        catch (IndexOutOfBoundsException iobe)
        {
            System.out.println("Exception: "+iobe);
            System.out.println("Index you are trying to access is not exist");
        }

    }

}
