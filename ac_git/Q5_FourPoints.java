package ac_git;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Q5_FourPoints {
	// 1번째 도전 실패! -> 재도전!! 성공!!!
//		// -1 -1
//		// -1  2
//		//  3  2
//		//  3 -1 ->4번째 값(세번째 x값, 첫번째 y값)
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] firstPoint = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] secondPoint = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] thirdPoint = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		int[] fourthPoint = new int[firstPoint.length];
		
		for(int i =0; i<fourthPoint.length;i++) {
			if (firstPoint[i] == secondPoint[i]) {
				fourthPoint[i] = thirdPoint[i];
			} else if (firstPoint[i] == thirdPoint[i]) {
				fourthPoint[i] = secondPoint[i];
			} else if (secondPoint[i] == thirdPoint[i]) {
				fourthPoint[i] = firstPoint[i];
			}
		}
		
		for(int four : fourthPoint) {
			System.out.print(four+" ");
		}

	}
}