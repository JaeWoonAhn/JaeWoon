import java.io.*;
import java.lang.*;

public class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
 
        
        String stars = new String("*******************************************************************************************************************************************************************************************************");
        String blanks = new String("                                                                                                                                                                                                       ");
        String arr[] = new String[N];
        
        for(int i=0;i<N;i++){
           arr[i] = blanks.substring(199-(N-i-1));
            
           arr[i] += stars.substring(199-(2*i+1));
        }
        for(int i=0;i<N;i++){
            System.out.println(arr[i]);
        }
        for(int i=N-2;i>=0;i--){
            System.out.println(arr[i]);
        }
        
        br.close();
    }
}
