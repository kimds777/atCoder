package ac_git;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {
	public void pow() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long value = Long.parseLong(br.readLine());

		if (value <= Math.pow(2, 31) - 1 && value >= Math.pow(-2, 31)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

public class Q11_NotOverflow {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Result rs = new Result();
		rs.pow();
	}
}
