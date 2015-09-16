/*
 * interface for programming courses
 */
package lab2;

/**
 *
 * @author Alyson
 */
public interface ProgrammingCourse {
    //what do all courses have?
    //courseName
    public abstract String getCourseName();
    public abstract void setCourseName(String courseName);
    //courseNumber
    public abstract String getCourseNumber();
    public abstract void setCourseNumber(String courseNumber);
    //credits
    public abstract double getCredits();
    public abstract void setCredits(double credits);
}
