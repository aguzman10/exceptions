package exceptions;

/**
 *
 * @author aguzm
 */
public class Exceptions 
{
    public static void main(String[] args) 
    {
        int num1 = 100;
        String line = "Code 2f00";
        int subString;
        String subLine="";
        int counter = 1;
        
        
        try
        {
            subString = Integer.parseInt(line.substring(4, 8));
        }
        catch(NumberFormatException exception)
        {
            System.out.println("Format is incorrect.  Not an integer." + line.substring(4,8));
            System.out.println("Error message:");
            System.out.println(exception.getMessage());
            System.out.println("Call stack trace: ");
            exception.printStackTrace();
            System.out.println();
        }
        
        try
        {
            subLine += line.charAt(9);
        }
        catch(StringIndexOutOfBoundsException exception)
        {
            System.out.println("Index does not exist.");
            System.out.println("Error message: ");
            System.out.println(exception.getMessage());
            System.out.println("Call stack trace: ");
            exception.printStackTrace();
            System.out.println();
        }
        
        try
        {
            int num = 10;
            int den = 0;
            int result = num/den;
            System.out.print("This part does not print out because the error was made in the line before.  Control goes directly to catch statement.");
        }
        catch(ArithmeticException problem)
        {
            System.out.println("You can not divide by zero!  Thats a big no!!");
            System.out.println("Error message: ");
            System.out.println(problem.getMessage());
            System.out.println("Call stack trace: ");
            problem.printStackTrace();
            System.out.println();
        }
        
        System.out.println("This does print out because the control flow continues linearly down from the end of the last catch statement");
    }
}
