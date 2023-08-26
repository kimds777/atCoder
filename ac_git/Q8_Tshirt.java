package ac_git;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q8_Tshirt {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int aRank = Integer.parseInt(st.nextToken());
		int bRank = Integer.parseInt(st.nextToken());
		int randomTshirt = Integer.parseInt(st.nextToken());
		int IrohaRank = Integer.parseInt(st.nextToken());
		double probability;
		
		if(aRank>=IrohaRank) {
			probability = 1;
		}else if(bRank<IrohaRank) {
			probability = 0;
		}else {
			probability = (double)randomTshirt/(bRank-aRank);
		}
		System.out.printf("%.12f",probability);
		br.close();
	}
}
