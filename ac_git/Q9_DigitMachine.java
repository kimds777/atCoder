package ac_git;
//9 0 1 2 3 4 5 6 7 8
//화면에 출력되는 숫자 -> 0
//버튼1번 누름 -> a[0] -> 9
//버튼2번 누름 -> a[9] -> 8
//버튼3번 누름 -> a[8] -> 7
//
//4 8 8 8 0 8 8 8 8 8
//화면에 출력되는 숫자 -> 0
//버튼1번 누름 -> a[0] -> 4
//버튼2번 누름 -> a[4] -> 0
//버튼3번 누름 -> a[0] -> 4

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Digit{
	public void button() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int[] arr = new int[st.countTokens()];
		for(int i=0; i<arr.length;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int push = 0; int btn = 0;
		while(push<3) {
			btn = arr[btn];
			push++;			
		}
		System.out.println(btn);
	}
}

public class Q9_DigitMachine {
	public static void main(String[] args) throws IOException {
		Digit digit = new Digit();
		digit.button();
				
	}
}
