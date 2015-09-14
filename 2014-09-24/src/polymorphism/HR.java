package polymorphism;

public class HR {
	
	public Object recruit(String empType)
	{
		if(empType.equals("I"))
		{
			return new Intern();
			
		}
		else if(empType.equals("P"))
		{
			return new Permanent();
		}		
		else if(empType.equals("C"))
		{
			return new Contract();
		}
		return null;
	}

}
