/**
 *
 */
package Sample;

/**
 * @author a_kos
 *
 */
public class PersonImple implements IPerson
{
	private String name = "";
	private String gender = "";
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
		return favorite;
	}

}
