public class Conditionals {
    
   

    public static void main(String[] args) {

        int age =18;

        // if-else statement
        if (age < 18) {
            System.out.println("You are a minor.");
        } else if (age == 18) {
            System.out.println("You are just an adult.");
        } else {
            System.out.println("You are an adult.");
        }


        // switch statement
        int day = 3;
        String dayName;
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }
        System.out.println("Day " + day + " is " + dayName);


        //another switch example
        int grade = 85;

        switch (grade / 10) {
            case 10:
                System.out.println("A+");
                break;
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
                break;
        }
        
    }
    
}
