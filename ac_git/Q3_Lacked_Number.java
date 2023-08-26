package ac_git;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3_Lacked_Number {
	//2차 도전 성공!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		br.close();
		char[] sChar = s.toCharArray();
		
		int sumTotal = 0;		
		int sTotal = 0;
		for(int i=0;i<s.length();i++) {
			sumTotal +=(i+1); 
			sTotal +=Character.getNumericValue(sChar[i]);
		}
		
		System.out.println(sumTotal-sTotal);
	}
	
}

// 1차 도전 실패! -> 재도전중
//public static void main(String[] args) throws IOException {
//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	String s = br.readLine();
//	br.close();
//	char[] sChar = s.toCharArray();
//	int[] sInt = new int[s.length()];
//	int count = 0;
//
//	for (int i = 0; i < s.length(); i++) {
//		sInt[i] = sChar[i] - '0';
//	}
//
//	Arrays.sort(sInt);
//
//	for (int i = 0; i < s.length(); i++) {
//		for (int j = 0; j <= s.length(); j++) {
//			if (sInt[i] == j) {
//				count++;
//			}
//			
//			if (count == 0) {
//				System.out.println(j);
//				break;
//			} else {
//				count = 0;
//			}
//		}
//	}
//}

