package ac_git;
//문제 설명
//타카하시와 아오키는 조깅을 하기로 결정했다.
//다카하시는 다음을  반복한다: "초속 B미터로 A초간 걷고 C초간 휴식한다.”
//아오키는 다음을  반복한다: "초속 E미터로 D초 동안 걷고 F초 동안 휴식한다."
//동시에 조깅을 시작한 지 X초가 지났을 때, 다카하시와 아오키 중 누가  앞서고 있는가?

//4 3 3 6 2 5 10
//A B C D E F X

//X==A+C
//X==D+F

//10초동안 조깅한후 다음과 같이 걸었다 
//다카하시 4(A)초 걷고 3(C)초 쉬고 다시 3(A)초 걸음 ->(4+3)*3=21미터 ->걸은시간 7초, 쉰시간 3초 ,속도3
//								  -> (총걸은시간)*(총걸은시간-휴식시간) = 총미터
//아오키 6(D)초 걷고 4(F)초 쉬었음 ->6*2=12미터 ->걸은시간 6초, 쉰시간 4초, 속도2
//					   -> (총걸은시간)*(총걸은시간-휴식시간) = 총미터
//기준이 되는 걸은시간을 초과하면 마지막값은 버린다



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1_Jogging {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		int E = Integer.parseInt(st.nextToken());
		int F = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());

		
		int time_d = X;
		int dCount = 0;
		
		int time_a = X;
		int aCount = 0;

		while (time_d > 0) { 
			if (time_d > A) { 
				dCount += A * B; 
				time_d -= (A + C); 
			} else { 
				dCount += time_d * B; 
				time_d = 0;
			}
		}
		
		while (time_a > 0) {
			if (time_a > D) {
				aCount += D * E;
				time_a -= (D + F);
			} else {
				aCount += time_a * E;
				time_a = 0;
			}
		}
		String result = (dCount > aCount) ? "Takahashi" : (dCount < aCount) ? "Aoki" : "Draw";
		System.out.println(result);
	}

}
