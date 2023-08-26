package ac_git;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q1_T {
	public static void main(String[] args) throws IOException {
		System.out.println("값을 입력하세요 ▼");
		Scanner sc = new Scanner(System.in);
		
		String inputs = sc.nextLine();

		String[] arr = inputs.split(" ");
		int a = Integer.valueOf(arr[0]);
		int b = Integer.parseInt(arr[1]);
		int c = Integer.parseInt(arr[2]);
		int d = Integer.parseInt(arr[3]);
		int e = Integer.parseInt(arr[4]);
		int f = Integer.parseInt(arr[5]);
		int x = Integer.parseInt(arr[6]);
		
		
		System.out.println(a+" "+b);
		
		sc.close();
	}
}