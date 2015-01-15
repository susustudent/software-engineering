package people;

public class PeopleExc {

	public static void main(String[] args)
	{
		try
		{
			People ppl = new People();
			ppl.GetPerson(1).Output();;
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

}
