import java.util.Arrays;
import java.util.Scanner;
public class string_array {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String[] names = {"Mohiminul","Islam","Shimon"};

        for(String x: names){// for-each loop( variable: arrayname)
            System.out.println(x);
        }
        System.out.println(Arrays.toString(names));//another types of output
        System.out.println("............................");

        String[] name= new String[3];

        System.out.println("enter names: ");
        for(int i=0; i<3 ; i++){// for taking input use this kind loop
            name[i] = input.next();// for taking line use nextLine();
        }

        for(String x: name){// for output
            System.out.println(x);
        }
        System.out.println("............................");

        String country = "Bangladesh is my country";

        String[] country2 = country.split(" ");// splitting country string on 'space(" ")' and put them another string country2
        for(String x: country2){
            System.out.println(x);
        } 
        System.out.println("............................");


        Arrays.sort(country2);// sorting string array
        System.out.println(Arrays.toString(country2));
        System.out.println();

        input.close();
    }
    
}
