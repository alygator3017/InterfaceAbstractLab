/*
 * 
 */
package lab1;

/**
 *The problem I had in this lab was figuring out how to fix it from the perspective
 * of hard coding JOptionPane and system.out.println. That was my biggest obstacle 
 * in this lab. Because I left all of the methods abstract in the abstract class 
 * (because of these things) I had to override all of the methods in the subclasses
 * @author Aly
 */
public class CourseDriver {

    public static void main(String[] args) {       
        //This part is good for going through the methods from the ProgrammingCourse abstract class
        //show courseName and courseNumber
        //adds courses to courses array using Liskov Principle
        ProgrammingCourse[] courses = {
            new AdvancedJavaCourse("Advanced Java", "152-082"),
            new IntroJavaCourse("Intro To Java", "152-385"),
            new IntroToProgrammingCourse("Into To Programming", "152-193")
        };
        //set credits for courses
        courses[0].setCredits(4.0);
        courses[1].setCredits(4.0);
        courses[2].setCredits(2.0);
        //get courses and credits
        for (ProgrammingCourse c : courses) {
            System.out.println(c.getCourseName());
            System.out.println(c.getCourseNumber());
            System.out.println("Credits: " + c.getCredits());
        }
        //here I am grabbbing the two classes that had extra methods in them besides what came from the abstract class. 
        //I am demonstrating how they are used.
        AdvancedJavaCourse advanced = new AdvancedJavaCourse("Advanced Java", "152-082");
        IntroJavaCourse introJava = new IntroJavaCourse("Intro To Java", "152-385");
        
        System.out.println(advanced.getCapitalizedCourseName());
        
        advanced.setPrerequisites("Intro To Java");
        introJava.setPrerequisites("Intro To Programming");
        
        System.out.println(advanced.getPrerequisites());
        System.out.println(introJava.getPrerequisites());
        

    }

}
