package equation;

public class Equation
{
    double a;
    double b;
    double c;
    Equation(double a, double b, double c) 
    {
        this.a = a;
        this.b = b;
        this.c = c;
        if (a == 0) throw new FirstCoefficientIsZeroException("first coefficient is zero");
    }
    public void Count(Complex x1, Complex x2)
    {
    	double D = b*b - 4*a*c;
		if (D >= 0)
		{
			x1.re = (-b + Math.sqrt(D))/(2*a);
			x2.re = (-b - Math.sqrt(D))/(2*a);
			x1.im = 0; x2.im = 0;
		}
		else
		{
			x1.re = x2.re = -b/(2*a);
			x1.im = Math.sqrt(Math.abs(D))/(2*a);
			x2.im = -Math.sqrt(Math.abs(D))/(2*a);
		}
    return;
    }
}