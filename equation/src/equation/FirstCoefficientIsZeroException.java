package equation;

public class FirstCoefficientIsZeroException extends ArithmeticException
{
	FirstCoefficientIsZeroException(){};
	FirstCoefficientIsZeroException(String msg){super(msg);};
}
