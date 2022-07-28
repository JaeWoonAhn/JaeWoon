import java.io.*;
import java.util.*;

public class Main{
	static int N;
	static String str = new String();

	public static void main(String[] args) throws Exception{
		Answer();
	}
	public static void Input() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		str = br.readLine();
	}
	private static int[] ConvertStrToIntArr(String P){
		StringTokenizer st = new StringTokenizer(P, " ");
		int arr[] = new int[N];

		for(int i=0;st.hasMoreTokens();i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}	 
		return arr;
	}
//	private static int[] ArrSort(int[] arr){
//		int[] arr1 = new int[arr.length];
//
//		arr1 = Arrays.sort(arr);
//
//		return arr1;
//	}
	private static int MinimizeP_iSum(int[] arr){
		int sum = 0;
		int temp = 0;
		for(int i=0;i<arr.length;i++){
			temp = temp + arr[i];
			//FIXME
			sum = sum + temp;	
			//FIXME
		}
		return sum;
	}
	private static void Answer() throws IOException{
		Input();

		int P_i[] = new int[N];

		P_i = ConvertStrToIntArr(str);

		Arrays.sort(P_i);

		System.out.println(MinimizeP_iSum(P_i));	
	}
}

