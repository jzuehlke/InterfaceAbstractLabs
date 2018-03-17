package lab1;

public abstract class Course
{
    private String courseName;
    private String courseNumber;
    private double credits;

    public final String getCourseName()
    {
        return courseName;
    }
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


    public final String getCourseNumber()
    {
        return courseNumber;
    }
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


    public final double getCredits()
    {
        return credits;
    }
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


    public abstract String getPrerequisites();
    public abstract void setPrerequisites(String prerequisites);
}
