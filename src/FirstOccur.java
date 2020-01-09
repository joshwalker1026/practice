
public class FirstOccur {

	public static void main(String args[]) {
		String str = "ABCRERBAC";
		for (int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);
			for (int j = i+1; j < str.length(); j++)
				if (str.charAt(j) == a)
				{
					System.out.println(a);
					return;
				}
		}

	}

}