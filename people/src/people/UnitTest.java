package people;
import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTest {
	
	@Test (expected = WrongAgeValueException.class)
	public void test_wrong_age() throws WrongAgeValueException
	{
			Person p = new Person("a", "b", -5); 
	}
	
	@Test (expected = WrongAgeValueException.class)
	public void test_right_age() throws WrongAgeValueException
	{
			Person p = new Person("c", "d", 4); 
	}
}
