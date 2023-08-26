package ac_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2_Perfect_String {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int up = 0;
		int low = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i))) {
				up = 0;
				for (int j = 0; j < s.length(); j++) {
					if (s.charAt(i) == s.charAt(j)) {
						up++;
					}
				}
				if (up > 1) {
					System.out.println("No");
					break;
				}
			} else {
				low = 0;
				for (int j = 0; j < s.length(); j++) {
					if (s.charAt(i) == s.charAt(j)) {
						low++;
					}
				}
				if (low > 1) {
					System.out.println("No");
					break;
				}

			}

			if (i == (s.length() - 1)) {
				if (up == 1 && low == 1) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			}
		}

	}
}

