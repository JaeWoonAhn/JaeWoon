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

	private static boolean checkPalindrome(String A){
		boolean ret = false;
		String A1,A2 = new String();

		StringBuilder sb;

		//문자열 길이가 홀수이면서 가운데 문제를 제외하고 회문인 경우
		if(S.length()%2 == 1){
			A1 = A.substring(0,A.length()/2);
			sb = new StringBuilder(A.substring(A.length()/2+1));
			A2 = sb.reverse().toString();
			if(A1.equals(A2) == true){
				ret = true;
			}
			else{
				ret = false;
			}
		}
		//문자열 길이가 짝수 중 회문 검색
		else{
			A1 = A.substring(0,A.length()/2);
			sb = new StringBuilder(A.substring(A.length()/2));
			A2 = sb.reverse().toString();
			if(A1.equals(A2) == true){
				ret = true;
			}
			else{
				ret = false;
			}
		}
		return ret;
	}

	static boolean checkPseudoPal(){
		int left = 0;
		int right = N;

		while(left <= right){
			if(S.charAt(left) != S.charAt(right)){
				return checkPalindrome(S.substring(left+1,right))||checkPalindrome(S.substring(left,right-1));
			}
			left++;
			right--;
		}
		return true;
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
