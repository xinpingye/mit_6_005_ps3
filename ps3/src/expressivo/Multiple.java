package expressivo;

//represent a expression multiple another expression
//immutable
public class Multiple implements Expression{
    
    private final Expression left, right;
    // Rep invariant
    // True
    // Abstraction function
    // represents the multiple of two expressions left+right
    // all fields are immutable and final and immutable
    
    /** make a Multiple **/
    public Multiple(Expression left, Expression right)
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
        return "(" + left + ")*(" + right + ")";
    }
    
    @Override public boolean equals (Object thatObject)
    {
        if (!(thatObject instanceof Multiple)) return false;
        
        Multiple thatSum = (Multiple)thatObject;
        
        return this.getLeft().equals(thatSum.getLeft()) && this.getRight().equals(thatSum.getRight());
    }

    @Override public int hashCode() 
    {
        return 1111;
    }    

}
