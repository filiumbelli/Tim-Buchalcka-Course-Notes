package scope;

public class ScopeCheck {

    public int publicVar = 0;
    private int privateVar = 1;

    public ScopeCheck(){
        System.out.println(privateVar + " and " + publicVar);
    }
    
}
