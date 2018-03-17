package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse extends Course
{
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber)
    {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }


    @Override
    public String getPrerequisites()
    {
        return prerequisites;
    }
    @Override
    public void setPrerequisites(String prerequisites)
    {
        try
        {
            if (prerequisites == null || prerequisites.length() == 0)
            {
                throw new NullPointerException();
            }
            this.prerequisites = prerequisites;
        }
        catch (NullPointerException e)
        {
            System.out.println(e + " Prerequisites name cannot be set to blank!");
        }
    }
}
