/**
 *
 */
package Sample;

/**
 * @author a_kos
 *
 */
public class Karakuri
{

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		test1();
		test2();
		test3();
		test4();
		test5();
		test6();
	}

	private static void test6() {
		IPerson[] personList = {new Koshino(), new Hidaka(), new Tanaka()};
		for (IPerson person : personList) {
			try {
				System.out.println(person.getFavorite());
			} catch (Exception e) {
				System.out.println(person.getName() + e.getMessage());
			}
		}
	}

	private static void test5() {
		IPerson[] personList = {new Koshino(), new Hidaka(), new Tanaka()};
		for (IPerson person : personList) {
			if (person instanceof Koshino) {
				Koshino koshino = (Koshino) person; //明示的なダウンキャスト

				System.out.println(koshino.getHobby());
			}
			System.out.println(person.getName());
		}
	}

	private static void test4() {
		IPerson person = new Koshino();
		//personC.getHobby();
		Koshino koshino = (Koshino) person;
		koshino.getHobby();
	}

	private static void test3() {
		IPerson[] personList = {new Koshino(), new Hidaka(), new Tanaka()};
		for (IPerson person : personList) {
			System.out.println(person.getName());
		}
	}

	private static void test2() {
		IPerson person = new Koshino();
		System.out.println(person.getName());
		person = new Hidaka();
		System.out.println(person.getName());
		person = new Tanaka();
		System.out.println(person.getName());
		System.out.println(person.getGender());
	}

	private static void test1() {
		Koshino koshino = new Koshino();
		Hidaka hidaka = new Hidaka();
		Tanaka tanaka = new Tanaka();

		System.out.println(koshino.getName());
		System.out.println(hidaka.getName());
		System.out.println(tanaka.getName());
		System.out.println(tanaka.getGender());
		System.out.println(koshino.getHobby());
	}

}
