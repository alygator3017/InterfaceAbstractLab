package lab2;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse implements ProgrammingCourse{
    //made private
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        //changed to .set method
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

    //getCourseName?
    @Override
    public String getCourseName() {
        return courseName;
    }

    //setCourseName?
    @Override
    public final void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    @Override
    public String getCourseNumber() {
        return courseNumber;
    }

    @Override
    public final void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    @Override
    public double getCredits() {
        return credits;
    }

    @Override
    public void setCredits(double credits) {
        this.credits = credits;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    

    
}
