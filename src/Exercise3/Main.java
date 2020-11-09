
package Exercise3;


import java.util.Scanner;

import java.time.LocalDate;

import java.util.ArrayList;
        

public class Main {

    static public String setCourse() {
        Scanner input = new Scanner(System.in);
        System.out.println("CourseName?");
        String course = input.nextLine();
        return course;
    }

    static public LocalDate setStartDate() {
        Scanner input = new Scanner(System.in);
        System.out.println("Start Date");
        System.out.println("Year ####");
        int year = input.nextInt();
        System.out.println("Month ##");
        int month = input.nextInt();
        System.out.println("Day ##");
        int day = input.nextInt();
        LocalDate dstart = LocalDate.of(year, month, day);
        return dstart;
    }

    static public LocalDate setFinDate() {
        Scanner input = new Scanner(System.in);
        System.out.println("End Date");
        System.out.println("Year ####");
        int year = input.nextInt();
        System.out.println("Month ##");
        int month = input.nextInt();
        System.out.println("Day ##");
        int day = input.nextInt();
        LocalDate dfin = LocalDate.of(year, month, day);
        return dfin;
    }

    public static void main(String[] args) {

        ArrayList<Courses> listCourses = new ArrayList<Courses>();

        System.out.println("Create 1 bootcamp, name, start date, end date");
        int i;
        for (i = 0; i < 1; i++) {
            Courses newcourse = new Courses(setCourse(), setStartDate(), setFinDate());
            listCourses.add(newcourse);
        }
        System.out.println(listCourses);

        System.out.println("Check Availabilty. Enter Date");
        LocalDate checkDate = setStartDate();

        int nums = listCourses.get(0).startingDate.compareTo(checkDate);
        int nume = listCourses.get(0).endingDate.compareTo(checkDate);

        if (nums < 0 && nume > 0) {
            System.out.println("Bootcamp " + listCourses.get(0).getCourse() + " will be available in " + checkDate + " It starts " + listCourses.get(0).startingDate + " and ends " + listCourses.get(0).endingDate);
        } else {
            System.out.println("Sorry no bootcamp available in " + checkDate);
        }
    }
}






//        int val = d1.compareTo(d2);
//      if(val > 0)
//         System.out.println("\nThe first LocalDate object is greater than the second LocalDate object");
//      else if(val < 0)
//         System.out.println("\nThe first LocalDate object is lesser than the second LocalDate object");
//      else
//         System.out.println("\nThe LocalDate objects are equal"); 
    
    

