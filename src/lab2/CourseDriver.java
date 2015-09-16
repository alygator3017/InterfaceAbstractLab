/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 * For me, this was easier to set up than the abstract class, even though 
 * they were essentially the same. Smoother is the way I'd describe it
 * I wasn't worried about what properties may go where and if I needed to implement 
 * any concrete methods. 
 * I think it also helped that I had all the driver code pre-made and had to 
 * tailor it to the specific lab.
 * 
 * Good- I liked the face that everything was easy to make, while the implementation
 *      probably takes longer, in the long run everything is essentially smoother
 *      and more put together. The developer of the subclasses still has the option
 *      of how they want to implement (like the way they want to deal with JOptionPane)
 *      but overall, the fact that I didn't have to deal with properties or implementation
 *      is nice.
 * Bad- I don't have much to say when it comes to bad. I mean it's a horse a piece.
 *      While you lose the option to add properties to the interface or concrete methods,
 *      you retain the ability for the developer of the subclasses to have options.
 *      Not to mention that they know what they are getting (all the stuff we've
 *      covered already on why abstract classes are dangerous- bad code, don't know what you have,
 *      may be misusing the methods, plus you might override something you aren't supposed to, 
 *      you don't have the problem with interfaces). Makes this architecture easier to use
 *      and manage. 
 * 
 * @author Alyson
 */
public class CourseDriver {
    
    public static void main(String[] args){
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
        
        advanced.setPrerequisites("Intro To Java");
        introJava.setPrerequisites("Intro To Programming");
        
        System.out.println(advanced.getPrerequisites());
        System.out.println(introJava.getPrerequisites());
    }
    
}
