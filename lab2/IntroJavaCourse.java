package lab2;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse implements Courseable
{
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber)
    {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }


    @Override
    public String getCourseName()
    {
        return courseName;
    }
    @Override
    public void setCourseName(String courseName)
    {
        try
        {
            if (courseName == null || courseName.length() == 0)
            {
                throw new NullPointerException();
            }
            this.courseName = courseName;
        }
        catch (NullPointerException e)
        {
            System.out.println(e + " Course name cannot be left blank!");
        }
    }


    @Override
    public String getCourseNumber()
    {
        return courseNumber;
    }
    @Override
    public void setCourseNumber(String courseNumber)
    {
        this.courseNumber = courseNumber;
    }


    @Override
    public double getCredits()
    {
        return credits;
    }
    @Override
    public void setCredits(double credits)
    {
        this.credits = credits;
    }


    @Override
    public String getPrerequisites()
    {
        return prerequisites;
    }
    @Override
    public void setPrerequisites(String prerequisites)
    {
        this.prerequisites = prerequisites;
    }
}
