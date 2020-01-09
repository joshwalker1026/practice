import java.util.ArrayList;
import java.util.Arrays;

class strStr {
	public static int strStr(String sub, String whole) {
		int index = 0;
		int j = 0;

		if (sub == null || whole == null || whole.length() == 0)
			return -1;

		if (sub.length() == 0)
			return -1;

		if (whole.length() < sub.length())
			return -1;

		for (int i = 0; i <= whole.length() - sub.length(); i++) {
			index = i;
			j = 0;

			while (sub.charAt(j) == whole.charAt(index)) {
				if (i + j == whole.length()) 
					return -1;
				if (j == sub.length() - 1)
					return i;
				j++;
				index++;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		System.out.println(strStr("asd", "adefvasd"));

	}

}
