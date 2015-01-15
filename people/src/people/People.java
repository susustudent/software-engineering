package people;

public class People 
{
	Person[] person = new Person[] {
		new Person("Spike", "Jonze", 44),
		new Person("Charlie", "Kaufman", 55),
		new Person("Sofia", "Coppola", 43),
		new Person("Michel", "Gondry", 51),
	};
	
	People() throws WrongAgeValueException {}
	
	Person GetPerson(int num)
	{
		return person[num];
	}
}
