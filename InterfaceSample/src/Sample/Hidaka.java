package Sample;

public class Hidaka implements IPerson
{
	private String name = "日髙";
	private String gender = "男";
	private String favorite = "";

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
		throw new RuntimeException("は好きな物はありません");
		//throw new Exception();
	}
}