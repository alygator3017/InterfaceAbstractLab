/*
 * 
 * 
 */
package lab1;

/**
 *
 * @author Aly Schmidt-Zimmel
 */
public abstract class ProgrammingCourse {
    
    //public abstract void setCourseName(String courseName);
    //allowing classes to return courseName since the classes store the courseName
    public abstract String getCourseName();
    //abstract because joptionpane
    public abstract void setCredits(double credits);
    //allowing the classes to return credits since those classes store credits 
    //set credits (because of Joption Pane) through abstract so not stored in abstract class
    public abstract double getCredits();
    //abstract because IntroToProgramming uses joption pane and is different
    public abstract void setCourseNumber(String courseNumber);
    //abstract because setter is not set inside abstract class
    public abstract String getCourseNumber();
    
    
}
