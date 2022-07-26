public class _String{// class name should not be like keyword, here using _String not string
    public static void main(String[] args){

        String s1="Mohiminul Islam";
        String s3=" Shimon";//begining has a space for concatenation part 
        String s2= new String("mohiminul islam");//this way also string can be taken as input
        System.out.println("s1 = "+s1);
        System.out.println("s2 = "+s2);
        System.out.println("............................");

        int len = s1.length();
        System.out.println("length of s1 = "+len);
        System.out.println("............................");

        if(s1.equals(s2)){   //it will show not equal cz case sensitive
            System.out.println("Equals");
        }
        else{
            System.out.println("Not equals");
        }

        if(s1.contains(s2)){   //alternate of equals
            System.out.println("Equals");
        }
        else{
            System.out.println("Not equals");
        }

        if(s1.equalsIgnoreCase(s2)){   //it will ignore case when compare
            System.out.println("Equals");
        }
        else{
            System.out.println("Not equals");
        }
        System.out.println("............................");

        boolean con = s1.contains("Islam");// return true or false value
        System.out.println("con = "+con);

        boolean empty = s1.isEmpty();
        System.out.println("empty? = "+empty);

        System.out.println("............................");

        boolean start = s1.startsWith("Moh");
        System.out.println("starts_with = "+start);

        boolean end = s1.endsWith("n");
        System.out.println("ends_with = "+end);

        System.out.println("............................");
        /*we cant operating in same string, thats why take another
        string; for operating in same string use stringbuffer */

        String fullname1 = s1+ s3;//concate
        System.out.println("Fullname = "+fullname1);

        String fullname2 = s1.concat(s3);//alternate concatenation
        System.out.println("Fullname = "+fullname2);

        System.out.println("............................");

        String uppername = fullname1.toUpperCase();
        System.out.println("Upper letter = "+uppername);

        String lowername = fullname2.toLowerCase();
        System.out.println("Lower letter = "+lowername);

        System.out.println("............................");

        String country = "Bangladesh is my country";

        char ch = country.charAt(0);
        System.out.println(ch);
      
        int value = country.codePointAt(0);//returns ASCII value
        System.out.println("ASCII value of index 0 : "+value);

        int pos = country.indexOf('i');
        System.out.println("position of i in country : "+pos);
        System.out.println("............................");

        String rep = country.replace('m', 'k');//replacing character
        System.out.println(rep);
        System.out.println("............................");
        
        //conversion to string to/from other data types
        int i = 100;
        String in = Integer.toString(i);
        System.out.println(in);

        double d = 10.1;
        String doub = Double.toString(d);
        System.out.println(doub);

        String s = "32";
        int str = Integer.parseInt(s);
        System.out.println(str);
    }
}