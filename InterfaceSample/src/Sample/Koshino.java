package Sample;

public class Koshino implements IPerson, IEmployee
{
	private String name = "越野";
	private String gender = "女";
	private String hobby = "登山";
	private String favorite = "米";
	@Override
	public String getName()
	{
		return name;
	}

	public String getGender()
	{
		return gender;
	}

	public String getHobby()
	{
		return hobby;
	}

	public String getFavorite()
	{
		return favorite;
	}

	@Override
	public int getId() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public String getDivision() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}