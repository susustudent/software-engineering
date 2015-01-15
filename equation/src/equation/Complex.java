package equation;

public class Complex
{
	public double re = 0;
	public double im = 0;
	Complex()
	{}
	Complex(double re, double im)
	{
		this.re = re; this.im = im;
	};
	public void Output()
	{
		if (im == 0)
			System.out.println(re);
		else 
		{
			System.out.println(re + ((im > 0) ? "+" : "") + im + "i");
		}
	}
}
