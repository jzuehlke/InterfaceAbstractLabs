package lab1;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroToProgrammingCourse extends Course
{
    public IntroToProgrammingCourse(String courseName, String courseNumber)
    {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }


    @Override
    public String getPrerequisites()
    {
        return null;
    }
    @Override
    public void setPrerequisites(String prerequisites) { }
}
