package triangle;

public class TriangleClass 
{

    public static String triangle(double firstSide, double secondSide, double thirdSide) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private double firstTriangleSide;
    private double secondTriangleSide;
    private double thirdTriangleSide;
    private double firstTriangleAngleSide;
    private double secondTriangleAngleSide;
    private double thirdTriangleAngleSide;
    
    public TriangleClass( )
    {
        firstTriangleSide = 0.0;
        secondTriangleSide = 0.0;
        thirdTriangleSide = 0.0;
        
        firstTriangleAngleSide = 0.0;
        secondTriangleAngleSide = 0.0;
        thirdTriangleAngleSide = 0.0;

    }
    
    public TriangleClass (double initialise_firstTriangleSide, 
            double initialise_secondTriangleSide, 
            double initialise_thirdTriangleSide) 
          
    {
        firstTriangleSide = initialise_firstTriangleSide;
        secondTriangleSide = initialise_secondTriangleSide;
        thirdTriangleSide = initialise_thirdTriangleSide;

    }
    
    public void setFirstTriangleSide(double initialise_firstTriangleSide)
    {
//        assert (firstTriangleSide != 0.0);
        try
        {
            if (initialise_firstTriangleSide < 0.0)
           
                throw new NegativeTriangleSideException( );
                
            else
            
                firstTriangleSide = initialise_firstTriangleSide;
            
        }
        catch (NegativeTriangleSideException firstSideExceptionThrown)
        {
            System.out.println(firstSideExceptionThrown.getMessage( ));
        }
    }
                 

    public void setSecondTriangleSide(double initialise_secondTriangleSide)
    {
//        assert (secondTriangleSide != 0.0);
        try
        {
            if (secondTriangleSide < 0.0)
            {
                throw new NegativeTriangleSideException( );
            }
            else
            {
                secondTriangleSide = initialise_secondTriangleSide;
            }
        }
        catch (NegativeTriangleSideException secondSideExceptionThrown)
        {
            System.out.println(secondSideExceptionThrown.getMessage( ));
        }
    }
    
    public void setThirdTriangleSide(double initialise_thirdTriangleSide)
    {
//        assert (thirdTriangleSide != 0.0);
        try
        {
            if (thirdTriangleSide < 0.0)
            {
                throw new NegativeTriangleSideException( );
            }
            else
            {
                thirdTriangleSide = initialise_thirdTriangleSide;
            }
        }
        catch (NegativeTriangleSideException thirdSideExceptionThrown)
        {
            System.out.println(thirdSideExceptionThrown.getMessage( ));
        }
    }   
    
    public double getFirstTriangleSide( )
    {
        return firstTriangleSide;
    }
    
    public double getSecondTriangleSide( )
    {
        return secondTriangleSide;
    }
    
    public double getThirdTriangleSide( )
    {
        return thirdTriangleSide;
    }
    
    /**
     * Inequality of triangles. We all know that inequality of triangles follows
     * the pattern c < a + b, or b < a + c, or a < b + c, where c is hypothenuse 
     * of a triangle, a and b are our cathetus of a triangle. That means triangle
     * under these conditions cannot be constructed. 
     * This method checks whether is possible to construct a triangle.
     * @return false, if it is impossible to construct the triangle, else true.
     */
    public boolean isTrianglePossibleToConstruct( )
    {
        if (firstTriangleSide + secondTriangleSide < thirdTriangleSide ||
                secondTriangleSide + thirdTriangleSide < firstTriangleSide
                || thirdTriangleSide + firstTriangleSide < secondTriangleSide)
        {
            return false;
        }
        return true;
    }
    
    /**
     * Using the method to compute the angle of a triangle. 
     * Plugging in the necessary formula and checking the side that we
     * want to construct a triangle.
     * @param sideCheck - side that needs to be checked for a triangle 
     * construction.
     */
    public void computeTriangleAngles(double sideCheck) 
    {

        double convertedAngle;
        double calculationAngle = 0.0;
        
        if (sideCheck == firstTriangleSide)
        {
            calculationAngle = (Math.pow(secondTriangleSide, 2) + 
                    Math.pow(thirdTriangleSide, 2) - Math.pow(sideCheck, 2)) /
                    (2 * secondTriangleSide * thirdTriangleSide);
        }
        else if (sideCheck == secondTriangleSide)
        {
            calculationAngle = (Math.pow(thirdTriangleSide, 2) + 
                    Math.pow(firstTriangleSide, 2) - Math.pow(sideCheck, 2))
                    / (2 * thirdTriangleSide * firstTriangleSide);
        }
        else
        {
            calculationAngle = (Math.pow(firstTriangleSide, 2) + 
                    Math.pow(secondTriangleSide, 2) - Math.pow(sideCheck, 2))
                    / (2 * firstTriangleSide * secondTriangleSide);
        }
            convertedAngle = Math.toDegrees(Math.acos(calculationAngle));
    }
    
    /**
     * Method returns the angles measured in degrees and rounded 
     * to the nearest teens where necessary. 
     * @param convertedAngle - an angle in degrees.
     * @return angle calculated in degrees and rounded to the nearest teens.
     */
    public double getComputed(double convertedAngle)
    {
        return Math.round(convertedAngle);  
    }
    
    /**
     * Method that checks the type of an angle.
     * @return
     */
    public String getTriangleAngleType( )
    {
        if (!isTrianglePossibleToConstruct( ))
        {
            return null;
        }
        if ((getComputed(firstTriangleSide) == 90.0) || 
                (getComputed(secondTriangleSide) == 90.0) ||
                        (getComputed(thirdTriangleSide) == 90.0))
        {
            return "Right Angle Triangle";
        }
        
        else if ((getComputed(firstTriangleSide) < 90.0 && 
                (getComputed(secondTriangleSide) < 90.0) &&
                (getComputed(thirdTriangleSide) < 90.0)))
        {
            return "Acute Triangle";
        }
        
        else if ((getComputed(firstTriangleSide) > 90.0 && 
                (getComputed(secondTriangleSide) > 90.0) &&
                (getComputed(thirdTriangleSide) > 90.0)))
        {
            return "Obsute Triangle";
        }
        return null;
    }
    
    /**
     * Method that checks which sides we have for the triangle.
     * @return types of sides: equilateral, isosceles or scalene. 
     */
    public String getTriangleSides( )
    { 
          if (!isTrianglePossibleToConstruct( ))
          { 
              System.out.println("Cannot construct a triangle.");
              return null; 
          }      
    
          if (firstTriangleSide == secondTriangleSide && 
                  secondTriangleSide == thirdTriangleSide)
          {
              return "Equilateral Triangle";
          }
          else if ((firstTriangleSide == secondTriangleSide && 
                  thirdTriangleSide != secondTriangleSide) || 
                  (firstTriangleSide == thirdTriangleSide 
                  && secondTriangleSide != firstTriangleSide) || 
                  (secondTriangleSide == thirdTriangleSide 
                  && firstTriangleSide != secondTriangleSide))
          {
              return "Isosceles Triangle";
          }
          else
          {
              return "Scalene Triangle"; 
          }
    }
    @Override
    public boolean equals(Object otherObject)
    {
        if (otherObject != null)
        {
            return false;
        }
        else if (this.getClass( ) != otherObject.getClass( ))
        {
            return false;
        }
        else
        {
            TriangleClass triangle = (TriangleClass)otherObject;
            return (this.getFirstTriangleSide( ) == 
                    triangle.getFirstTriangleSide( ) &&
                    this.getSecondTriangleSide( ) == 
                    triangle.getSecondTriangleSide( )) &&
                    this.getThirdTriangleSide( ) == 
                    triangle.getThirdTriangleSide( );
        }
    }
    
    @Override
    public String toString( )
    {
        return ("Possible to construct? " + isTrianglePossibleToConstruct( ) + 
                "\n" + "Triangle Sides: " + getTriangleSides( ) + "\n" + 
                "Triangle Type: " + getTriangleAngleType( ));
    }
}