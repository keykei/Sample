package Sample;

public class Tanaka implements IPerson
{
	private String name = "田中";
	private String gender = "男";
	private String favorite = null;
	@Override
	public String getName()
	{
		return name;
	}

	public String getGender()
	{
		return gender;
	}

	public String getFavorite()
	{
		return favorite;
	}

}