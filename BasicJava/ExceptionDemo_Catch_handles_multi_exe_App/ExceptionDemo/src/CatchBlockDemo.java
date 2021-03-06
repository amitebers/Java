public class CatchBlockDemo
{

	public static void main(String[] args)
	{

		try
		{
			String str = null;

			// This line will throw NullPointerException
			System.out.println(str.length());

			// This line will throw ArithmeticException
			int a = 5 / 0;

		}

		catch (ArithmeticException | NullPointerException exe)
		{
			exe.printStackTrace();
		}

		System.out.println("Normal flow---");

	}
}
