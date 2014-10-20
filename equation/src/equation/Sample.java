package equation;


public class Sample 
{  
    public static void main(String[] args) 
    {
    	try
    	{
    		Complex r1 = new Complex();
    		Complex r2 = new Complex();
    		Equation x = new Equation(1, 2, 1);
    		x.Count(r1, r2);
    		r1.Output(); r2.Output();
    	}
    	catch(ArithmeticException ex)
    	{
    		System.out.println(ex);
    	}
    }
    
}