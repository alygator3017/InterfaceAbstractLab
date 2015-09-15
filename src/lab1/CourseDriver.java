/*
 * 
 */
package lab1;

/**
 *The problem I had in this lab was figuring out how to fix it from the perspective
 * of hard coding JOptionPane and system.out.println. That was my biggest obstacle 
 * in this lab. Because I left all of the methods abstract in the abstract class 
 * (because of these things) I had to override all of the methods in the subclasses.
 * 
 * no properties are in the abstract superclass, reason? I only had abstract methods.
 * Why did I use only abstract methods?
 *      - I could have used a concrete method is I had made another interface and 
 *          subclass for a writer or output.
 *      - if I have time I will try to do this in a version 2 kind of thing. 
 * Good or bad things about this architecture:
 *  - good: you have the option to add concrete methods into the abstract class. 
 *      is this suggested? No, not as it is right now. If I went as added an interface
 *      I'd be able to change some of those abstract methods in the super class to concrete
 *      and move some of the variables where I can have both the getter and setter in 
 *      the superclass. 
 *  - bad: As I said, right now without that interface this is at most clunky. It's 
 *      no different than using an interface at the moment since everything has an
 *      abstract method in order to allow the developer to "change" how they output
 *      some of the error messages in the subclasses right now. With the JOptionPane
 *      and System.out.println, as I pointed out previously, ruin the ability to 
 *      add a concrete method. Especially since I can't just add a getter in the
 *      superclass and leave the setter in the subclass, I wouldn't be able to get
 *      to that property without making the property public, which as we know is a
 *      big no no. Also, as you'll see looking through, I added comment notes in what
 *      I changed. Most of the reasons I added getters is because well, how else am
 *      I supposed to access that information without once again committing a huge
 *      mistake by making the property public. Now the reason I didn't add the setter
 *      in IntroJavaCourse is because it's already being set by the program.
 *      Personally my problems with the way the code was written mostly are personal.
 *      I don't personally like the fact that some of the setters are checking for errors
 *      but others aren't, which hopefully time allowing I will fix myself. 
 * 
 * to sum up:
 *      what could I make better?
 *          - interface the output or writer
 *          - error check all setter methods, not just some.
 *      
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
