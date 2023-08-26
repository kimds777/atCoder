package ac_git;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//1차 도전 성공!! 버블정렬 사용
public class Q4_Move_Right {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine(); // 1010
		char[] sChars = s.toCharArray(); // {'1','0','1','0'}
		char temp;
		for (int i = s.length() - 1; i >= 0; i--) { // i=4;i>=0
			for (int j = i - 1; j < i; j++) { // j=3;j<4
				if (j < 0) {
					sChars[i] = '0';
					break;
				}
				temp = sChars[i]; // temp='0'
				sChars[i] = sChars[j]; // sChars[i] ='1'
				sChars[j] = temp;// sChars[j]='0'

			}
		}
		for(char out:sChars) {
			System.out.print(out);
		}

	}
}
