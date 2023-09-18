package ac_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

class Nicknames {
	public String print() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int person = Integer.parseInt(br.readLine());

		String[][] name = new String[person][2];
		HashMap<String, Integer> map = new HashMap<>();// 이름과 등장 횟수를 저장

		StringTokenizer st;

		for (int n = 0; n < person; n++) {
			st = new StringTokenizer(br.readLine(), " ");
			name[n][0] = st.nextToken(); // 성
			name[n][1] = st.nextToken(); // 이름

			if (!map.containsKey(name[n][0])) {
				map.put(name[n][0], 0);
			}
			map.put(name[n][0], map.get(name[n][0]) + 1);

			if (!map.containsKey(name[n][1])) {
				map.put(name[n][1], 0);
			}
			map.put(name[n][1], map.get(name[n][1]) + 1);

		}

		br.close();
		
		String answer = "Yes";

		for (String[] n : name) {
			if (map.get(n[0]) > 1 && map.get(n[1]) > 1 && !(n[0].equals(n[1])) && map.get(n[0])>=2) {
				return answer = "No";
			}
		}
		
		return answer;
	}
}

public class Q15_UniqueNicknames {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Nicknames nn = new Nicknames();
		System.out.println(nn.print());
	}
}
