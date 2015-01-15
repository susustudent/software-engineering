package people;

public class Person 
{
	private String name;
	private String surname;
	private int age;
	Person(){name = "Name"; surname = "Surname"; age = 0;}
	Person(String name, String surname, int age) throws WrongAgeValueException 
	{
		this.name = name; this.surname = surname; SetAge(age);
	}
	public void SetAge(int age) throws WrongAgeValueException 
	{
		if (age >= 0)
			this.age = age;
		else
			throw new WrongAgeValueException();
	}
	
	void Output()
	{
		System.out.println(name + " " + surname + ", " + age + " years");
	}
}
