package lab2;

/*
    As mentioned in Lab 1, the interface architecture is great!  However, in this example it sees little usage thanks
    to how very similar all the classes implementing it are.  The most handy part about this interface is
    when adding new classes which implement it, those classes will have all the methods automatically written in and
    ready for customization.  Overall, this would see far more use in something more vague, such as being an interface
    for any school activity, or for homework in general.
 */

public class Startup
{
    public static void main(String args[])
    {
        Courseable ajc = new AdvancedJavaCourse("Matt's Advanced Java", "103");
        System.out.println("Course Name: " + ajc.getCourseName());
        System.out.println("Course Number: " + ajc.getCourseNumber());
        ajc.setCredits(10.0);
        System.out.println("Credits: " + ajc.getCredits());
        ajc.setPrerequisites("Intro to Java");
        System.out.println("Prerequisites: " + ajc.getPrerequisites());

        Courseable ijc = new IntroJavaCourse("Matt's Intro to Java", "102");
        System.out.println("\nCourse Name: " + ijc.getCourseName());
        System.out.println("Course Number: " + ijc.getCourseNumber());
        ijc.setCredits(3.5);
        System.out.println("Credits: " + ijc.getCredits());
        ijc.setPrerequisites("");
        System.out.println("Prerequisites: " + ijc.getPrerequisites());

        Courseable itpc = new IntroToProgrammingCourse("Drew's Intro to Programming", "101");
        System.out.println("\nCourse Name: " + itpc.getCourseName());
        System.out.println("Course Number: " + itpc.getCourseNumber());
        itpc.setCredits(.2);
        System.out.println("Credits: " + itpc.getCredits());
        itpc.setPrerequisites("All classes, this is the final class for no reason");
        System.out.println("Prerequisites: " + itpc.getPrerequisites());
    }
}
