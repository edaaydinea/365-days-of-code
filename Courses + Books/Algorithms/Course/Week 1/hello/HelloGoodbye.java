public class HelloGoodbye {
    public static void main (String[] args)
    {
        String first_name = args[0];
        String second_name = args[1];

        System.out.println("Hello " + first_name +" and " + second_name + ".");
        System.out.println("Goodbye " + second_name +" and " + first_name + ".");
    }
}