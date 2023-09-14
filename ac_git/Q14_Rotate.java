package ac_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Rotate {
	public void rotatePrint() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int abc = Integer.parseInt(br.readLine());
		br.close();
		
		int sum = abc;
		int temp = 0;
		for (int s = 0; s < 2; s++) {
			int first = abc/100;
			temp = (abc-(first*100))*10+first;
			sum += temp;
			abc = temp;
		}

		System.out.println(sum);
	}
}

public class Q14_Rotate {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Rotate r = new Rotate();
		r.rotatePrint();
	}
}
