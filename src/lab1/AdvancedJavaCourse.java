package lab1;

import javax.swing.JOptionPane;

/**
 * This class needs to be able to get and set prerequisites, credits, courseName
 * and courseNumber. It also is able to capitalize the course name, which in the 
 * grand scheme of the program seems a bit pointless since no other subclasses 
 * do this. 
 *
 * @author Aly Schmidt-Zimmel
 * @version 1.00
 */
public class AdvancedJavaCourse extends ProgrammingCourse {

    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

    public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    //no getCredits
    //put in abstract class ProgrammingCourse in order to allow us to get the credits
    @Override
    public double getCredits() {
        return credits;
    }

    @Override
    public void setCredits(double credits) {
        if (credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        //changed because this just loops on itself
        //this.setCredits(credits);
        this.credits = credits;
    }

    //@Override
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    //No getCourseName in IntroJavaCourse put one in the ProgrammingCourse Class

    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public final void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    @Override
    public String getCourseNumber() {
        return courseNumber;
    }


}
