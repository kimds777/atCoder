package ac_git;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q6_GoodMorning {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] time = new int[st.countTokens()];
		for (int i = 0; i < time.length; i++) {
			time[i] += Integer.parseInt(st.nextToken());
		}

		if (time[0] == time[2]) {
			if (time[1] == time[3] || time[1] < time[3]) {
				System.out.println("Takahashi");
			} else {
				System.out.println("Aoki");
			}
		} else if (time[0] < time[2]) {
			System.out.println("Takahashi");
		} else {
			System.out.println("Aoki");
		}

	}
}
