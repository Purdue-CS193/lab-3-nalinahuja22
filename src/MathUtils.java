/*@author Nalin Ahuja*/

public class MathUtils {
    /**
     * divideNumbers -- a / b
     * Divide a by b and return the result
     */
    public static double divideNumbers(double dividend, double divisor) {
        return (dividend / divisor);
    }

    /**
     * raiseToPower -- (base)^(exp)
     * Raise the number base to power exp
     */
    
    public static double raiseToPower(int base, int exp) {
            	
    	boolean isExpNegative = false;
    	
    	if(exp < 0)
    	{
    		exp = Math.abs(exp);
    		isExpNegative = true;
    	}
    	
    	double result = Math.pow(base, exp);
    	
    	if(isExpNegative)
    	{
    		return (1/result);
    	}
    	
    	else
    	{
    		return result;
    	}
    }    
}
