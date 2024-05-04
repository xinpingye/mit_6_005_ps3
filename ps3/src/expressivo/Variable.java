package expressivo;


// represent a Variable
// immutable
public class Variable implements Expression{
    
    private final String var;
    // representation invariant 
    // which are case-sensitive nonempty sequences of letters 
    // abstraction function
    // represent a variable in expression
    // Safety from rep exposure
    // all fields are immutable and final and immutable
    
    /** make a Varibale **/
    public Variable(String var)
    {
        this.var = var;
        
        checkRep();
    }
    
    private void checkRep()
    {
        assert var.split(" ").length == 1;
        assert var.matches("[a-zA-Z]+");
    }
    
    public String getVar()
    {
        return var;
    }
    
    @Override public String toString() 
    {
        return var;
    }
    
    @Override public boolean equals (Object thatObject)
    {
        if (!(thatObject instanceof Variable)) return false;
        
        Variable thatVariable = (Variable)thatObject;
        
        return this.getVar().equals(thatVariable.getVar());
    }
    
    @Override public int hashCode() 
    {
        return 1111;
    }
}
