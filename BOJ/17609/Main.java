import java.io.*;
import java.util.*;

public class Main{
	static String S;
	static int N;
	public static void main(String[] args) throws IOException{


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb;

		int T = Integer.parseInt(br.readLine());
		String[] str = new String[T];
		String temp = new String();

		for(int i=0;i<T;i++){
			str[i] = br.readLine();
		}
		for(int i=0;i<T;i++){
			N = str[i].length()-1;
			S = str[i];
			int result = Answer();
			System.out.println(result);
		}
	}

	private static boolean checkPalindrome(String S){
		int left = 0, right = S.length() - 1;
		
		while(left <= right) {
			if(S.charAt(left++) != S.charAt(right--)) return false;
		}
		
		return true;
	}
		
	static boolean checkPseudoPal(){
		int left = 0;
		int right = N;

		while(left <= right){
			if(S.charAt(left) != S.charAt(right)){
				return checkPalindrome(S.substring(left,right))||checkPalindrome(S.substring(left+1,right+1));
			}
			left++;
			right--;
		}
		return false;
	}

	static int Answer(){
		if(checkPalindrome(S)){
			return 0;
		}
		else if(checkPseudoPal()){
			return 1;
		}
		else{
			return 2;
		}
	}
}
