package ac_git;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q7_Shampoo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int shampoo = Integer.parseInt(st.nextToken());
		int father = Integer.parseInt(st.nextToken());
		int mother = Integer.parseInt(st.nextToken());
		int takahashi = Integer.parseInt(st.nextToken());
		
		while(shampoo>=0) {
			if(shampoo-father<0) {
				System.out.println("F");
				break;
			}else {
				shampoo -=father;
			}
			
			if(shampoo-mother<0) {
				System.out.println("M");
				break;
			}else {
				shampoo-=mother;
			}
			
			if(shampoo-takahashi<0) {
				System.out.println("T");
				break;
			}else {
				shampoo-=takahashi;
			}
		}
	}
}
