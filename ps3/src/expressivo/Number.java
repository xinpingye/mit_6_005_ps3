package expressivo;


// represent a Number
// immutable
public class Number implements Expression{
    
    private final double d;
    
    // representation invariant 
    // nonnegative numbers in decimal representation, which consist of digits and an optional decimal point
    // abstraction function
    // represent a number
    // Safety from rep exposure
    // all fields are immutable and final
    
    /** make a Number **/
    public Number(double d)
    {
        this.d = d;
        
        checkRep();
    }
    
    private void checkRep()
    {
        assert d >= 0;
    }
    
    public double getNumber()
    {
        return d;
    }
    
    @Override public String toString() 
    {
        return String.valueOf(d);
    }
    
    @Override public boolean equals (Object thatObject)
    {
        if (!(thatObject instanceof Number)) return false;
        
        Number thatNumber = (Number)thatObject;
        
        return this.getNumber() == thatNumber.getNumber();
            
    }
    
    @Override public int hashCode() 
    {
        return 1111;
    }
    
}
