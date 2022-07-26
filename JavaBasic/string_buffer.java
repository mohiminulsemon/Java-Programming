public class string_buffer {
    public static void main(String[] args) {
        
        String s1 = "Mohiminul";
        StringBuffer sb = new StringBuffer(s1);
        System.out.println(sb);
        System.out.println("............................");
        
        sb.reverse();
        System.out.println(sb);

        sb.reverse();
        System.out.println("............................");

        sb.append(" Islam ");
        sb.append(25);
        System.out.println(sb);
        System.out.println("............................");

        sb.insert(0,"name ");// (position , string to insert)
        System.out.println(sb);

        sb.replace(0, 5, "Hi ");
        System.out.println(sb);
         
        sb.delete(0, 3);// end point means operation take place from start index to end -1 positon
        System.out.println(sb);
        System.out.println("............................");

        String s2 = sb.toString();//to convert stringbuffer to string otherwise we cant keep stringbuffer in string data type
        System.out.println(s2);
    }
}
