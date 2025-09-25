public class StringDiff {

    public static void main(String[] args) {

        String name = "Hello";


        //methods of String class
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf('e'));
        System.out.println(name.substring(1,4));
        System.out.println(name.contains("ll"));
        System.out.println(name.equals("Hello"));
        System.out.println(name.equalsIgnoreCase("hello"));
        System.out.println(name.replace('H', 'h'));


        String name2= new String("World");
        String name3= name2;

        //StringBuilder is mutable
        //StringBuffer is mutable and synchronized

        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb);


        StringBuilder sbuild = new StringBuilder("Hello");
        sbuild.append(" World");
        System.out.println(sbuild);


        System.out.println(name2 == name3); // false, because both refer to different objects

        
    }


    public static void method1() {
        String name = "Hello";
        String name1 = "Hello";
        System.out.println(name == name1); // true, because both refer to same object in string pool
        System.out.println(name.equals(name1)); // true, because both have same value
    }


}
