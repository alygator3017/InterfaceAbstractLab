package lab1;

/**
 * Describe responsibilities here.
 *
 * @author Aly Schmidt-Zimmel
 * @version 1.00
 */
public class IntroJavaCourse extends ProgrammingCourse {

    private final String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public final void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    @Override
    public final void setCredits(double credits) {
        if (credits < 0.5 || credits > 4.0) {
            System.out.println(
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        //changed because otherwise it just looped on itself. 
//        this.setCredits(credits);
        this.credits = credits;
    }

    @Override
    public double getCredits() {
        return credits;
    }

        //missing setcourseName? because it sets it in the constructor
    
    //missing getCourseName? added it
    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public String getCourseNumber() {
        return courseNumber;
    }

    @Override
    public final void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

}
