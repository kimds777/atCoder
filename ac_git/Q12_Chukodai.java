package ac_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

class ChageString {
	public void change() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] str = (br.readLine()).toCharArray();
		int[] index = Stream.of(br.readLine().split(" ")) //분할된 문자열 배열을 스트림으로 변환
				.mapToInt(Integer::parseInt) // 각 문자열을 정수로 변환
				.toArray(); // 정수 스트림을 배열로 변환
		
		br.close();
		
		char tmp = str[index[0]-1];
		str[index[0]-1] = str[index[1]-1];
		str[index[1]-1] = tmp;
		
		System.out.println(str);

	}
}

public class Q12_Chukodai {
	public static void main(String[] args) throws IOException {
		ChageString cs = new ChageString();
		cs.change();
	}
}
