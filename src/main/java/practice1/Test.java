package practice1;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //String day="Java;
        Day day = Day.MONDAY;
        System.out.println(day);
        Day[] days=Day.values();
        System.out.println(Arrays.toString(days));
    switch(day){
        case MONDAY:
            System.out.println("Today is Monday");
            break;
        case TUESDAY:
            System.out.println("Today is TUESDAY");
            break;
        case WEDNESDAY:
            System.out.println("Today is WEDNESDAY");
            break;
        case THURSDAY:
            System.out.println("Today is THURSDAY");
            break;
        case FRIDAY:
            System.out.println("Today is FRIDAY");
            break;
        case SATURDAY:
            System.out.println("Today is SATURDAY");
            break;
        case SUNDAY:
            System.out.println("Today is SUNDAY");
            break;
        default:
                System.out.println("Invalid day");


    }
    }
}
