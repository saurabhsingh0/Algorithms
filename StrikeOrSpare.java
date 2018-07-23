import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrikeOrSpare {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int testCases=Integer.parseInt(br.readLine());
        for(int t=0;t<testCases;t++){
            int n=Integer.parseInt(br.readLine());
            int p=(int)Math.ceil(n/2.0);
            //System.out.println("p is "+p);
            int q=n-p;
            String ans="1";
            p=1;
            long i=0;
            for(i=0;i<q;i++){
                ans+="0";
            }
            System.out.println(p+" "+ans);
        }
    }
}
