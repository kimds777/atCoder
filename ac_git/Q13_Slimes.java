package ac_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Snuke {
	public void shouts() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		br.close();

		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		long k = Long.parseLong(st.nextToken());

		int cnt = 0;

		while (a < b) {
			a *= k;
			cnt++;
		}
		
		System.out.println(cnt);
	}
}

public class Q13_Slimes {
	public static void main(String[] args) throws IOException {
		Snuke s = new Snuke();
		s.shouts();
	}
}
