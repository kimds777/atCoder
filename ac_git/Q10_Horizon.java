package ac_git;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Square{
	public void result(Double h) {
		System.out.printf("%.9f",Math.sqrt(h*(12800000+h)));
	}
}

public class Q10_Horizon {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Square sq = new Square();
		sq.result(Double.parseDouble(br.readLine()));
		br.close();
	}
}
