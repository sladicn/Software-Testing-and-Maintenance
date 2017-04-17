package triangle;

public class NegativeTriangleSideException extends Exception 
{
    public NegativeTriangleSideException() 
    {
        super("Number for the triangle side entered is less than 0. Try again.");
    }
    
    public NegativeTriangleSideException(String message)
    {
        super(message);
    }   
}