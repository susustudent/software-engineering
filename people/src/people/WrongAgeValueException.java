package people;

public class WrongAgeValueException extends Exception
{
	WrongAgeValueException(){super("age of person is below than zero");};
}
