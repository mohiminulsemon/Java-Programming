import java.util.Scanner;//for input 

public class basicio{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);//input is a variable name

        System.out.print("the next output  will print in same line.");
        System.out.println("the next output will print in a new line.");
        System.out.print("Printed.\n");
        System.out.println("This is for printing inverted comma (\") ");

        int a = 10;
        System.out.println(a);
        System.out.println("a = "+a);
        System.out.printf("By using printf a = %d\n",a);
        
        System.out.println("enter a int number: ");
        int n = input.nextInt();
        System.out.println("number = "+n);

        System.out.println("enter a double number: ");
        double n1 = input.nextDouble();
        System.out.println("number = "+n1);

        //Typecasting
        double result;
        result = (double) n/n1;
        System.out.println(result);

        //character input
        char ch;
        System.out.println("enter a character: ");
        ch = input.next().charAt(0);//take char at position 0
        System.out.println(ch);

        //String input
        String name;
        System.out.println("enter a String: ");
        name = input.next();
        System.out.println(name);

        input.close();//for solving "Resource leak: input is never closed"

    }
}