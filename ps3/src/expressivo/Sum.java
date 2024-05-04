package expressivo;

//represent a expression plus another expression
//immutable
public class Sum implements Expression{
    
    private final Expression left, right;
    // Rep invariant
    // True
    // Abstraction function
    // represents the sum of two expressions left+right
    // all fields are immutable and final
    
    /** make a Sum **/
    public Sum(Expression left, Expression right)
    {
        this.left = left;
        this.right = right;
        
        checkRep();
    }
    
    private void checkRep()
    {
        assert left != null;
        assert right != null;
    }
    
    public Expression getLeft()
    {
        return this.left;
    }
    
    public Expression getRight()
    {
        return this.right;
    }
    
    @Override public String toString()
    {
        return "(" + left + ")+(" + right + ")";
    }
    
    @Override public boolean equals (Object thatObject)
    {
        if (!(thatObject instanceof Sum)) return false;
        
        Sum thatSum = (Sum)thatObject;
        
        return this.getLeft().equals(thatSum.getLeft()) && this.getRight().equals(thatSum.getRight());
    }

    @Override public int hashCode() 
    {
        return 1111;
    }
}
