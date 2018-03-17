package lab2;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroToProgrammingCourse implements Courseable
{
    private String courseName;
    private String courseNumber;
    private double credits;

    public IntroToProgrammingCourse(String courseName, String courseNumber)
    {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }


    @Override
    public String getCourseName()
    {
        return courseName;
    }
    @Override
    public final void setCourseName(String courseName)
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
    public final void setCourseNumber(String courseNumber)
    {
        try
        {
            if (courseNumber == null || courseNumber.length() == 0)
            {
                throw new NullPointerException();
            }
            this.courseNumber = courseNumber;
        }
        catch (NullPointerException e)
        {
            System.out.println(e + " Course number cannot be left blank!");
        }
    }


    @Override
    public double getCredits()
    {
        return credits;
    }
    @Override
    public void setCredits(double credits)
    {
        try
        {
            if (credits < 0.5 || credits > 4.0)
            {
                throw new IllegalArgumentException();
            }
            this.credits = credits;
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e + " Credits range is from .5 to 4.0");
        }
    }


    @Override
    public String getPrerequisites()
    {
        return null;
    }
    @Override
    public void setPrerequisites(String prerequisites) { }
}
