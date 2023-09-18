package ac_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class WeirdFunction{
	public long print() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		br.close();
		
		long answer = f(f(f(t)+t)+f(f(t)));
		return answer;
	}
	
	public long f(long f) {
		return f*f+2*f+3;		
	}
}

public class Q16_WeirdFunction {
	public static void main(String[] args) throws NumberFormatException, IOException {
		WeirdFunction wf = new WeirdFunction();
		System.out.println(wf.print());
	}

}
