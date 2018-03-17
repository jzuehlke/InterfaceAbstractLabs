package lab1;

/*
    I will start by saying I really like this architecture.  In the Superclass of this example all the similar
    necessary methods are set up and final, and the only optional property (prerequisites) is abstracted.  This
    is a very strong and convenient way to set up sub-classes which have a lot in common.  In this example, it is
    unlikely there will be much to stray from as a sub-class which won't already be covered in the Superclass.  This
    allows a lot of code to be in one place so it can be referenced or used elsewhere, which means if it needs to be
    changed later, there is no digging or changing multiple areas involved.
    The weakness in this architecture lies in more diverse or vague similarities between subclasses for the Superclass
    to try and cover.  For example, earlier in the semester there was a "talkable" interface which was implemented by
    an animal and person class, which were then superclasses of dog and cat, and student respectively.  If "talkable"
    was a Superclass instead of an interface, it would be far less useful due to how different the classes using it
    were.  
 */

public class Startup
{
    public static void main(String args[])
    {
        Course ajc = new AdvancedJavaCourse("Matt's Advanced Java", "103");
        System.out.println("Course Name: " + ajc.getCourseName());
        System.out.println("Course Number: " + ajc.getCourseNumber());
        ajc.setCredits(10.0);
        System.out.println("Credits: " + ajc.getCredits());
        ajc.setPrerequisites("Intro to Java");
        System.out.println("Prerequisites: " + ajc.getPrerequisites());

        Course ijc = new IntroJavaCourse("Matt's Intro to Java", "102");
        System.out.println("\nCourse Name: " + ijc.getCourseName());
        System.out.println("Course Number: " + ijc.getCourseNumber());
        ijc.setCredits(3.5);
        System.out.println("Credits: " + ijc.getCredits());
        ijc.setPrerequisites("");
        System.out.println("Prerequisites: " + ijc.getPrerequisites());

        Course itpc = new IntroToProgrammingCourse("Drew's Intro to Programming", "101");
        System.out.println("\nCourse Name: " + itpc.getCourseName());
        System.out.println("Course Number: " + itpc.getCourseNumber());
        itpc.setCredits(.2);
        System.out.println("Credits: " + itpc.getCredits());
        itpc.setPrerequisites("All classes, this is the final class for no reason");
        System.out.println("Prerequisites: " + itpc.getPrerequisites());
    }
}
