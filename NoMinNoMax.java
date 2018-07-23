import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NoMinNoMax {
    public static void main(String[] args)throws IOException {
//        int a[]={1,2,3,4,5};
//        for(int i=1;i<32;i++){
//            for(int j=0;j<5;j++){
//                int cond=(1<<j)&i;
//                if(cond>0){
//                    System.out.print(a[5-(j+1)]+ " ");
//                }
//            }
//            System.out.println("");
//        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases=Integer.parseInt(br.readLine());
        for(int t=0;t<testCases;t++){
            String str[]=br.readLine().split(" ");
            int n=Integer.parseInt(str[0]);
            int k=Integer.parseInt(str[1]);
            long product=1;
            long arrayproduct=1;
            //int minmaxArray[]= new int[k];
            str=br.readLine().split(" ");
            int array[]=new int[n];
            int total=(int)Math.pow(2,n)-1;
            for(int i=0;i<=total;i++){
                int minmaxArray[]= new int[k];
                int count=0;
                for(int j=0;i<n && count<=k;j++){
                    int cond=(1<<j)&i;
                    if(cond>0){
                        minmaxArray[count]=array[n-(j+1)];
                        count++;
                    }
                }
                int min=minmaxArray[0],max=minmaxArray[0];
                if(count==k){
                    arrayproduct=minmaxArray[0];
                    for(int j=1;j<count;j++){
                        if(min>minmaxArray[j]){
                            min=minmaxArray[j];
                        }
                        arrayproduct=arrayproduct*minmaxArray[j];
                        if(max<minmaxArray[j]){
                            max=minmaxArray[j];
                        }
                    }
                    arrayproduct=arrayproduct/(max*min);
                }
                product=product*arrayproduct;
            }
            System.out.println(product);
        }
    }
}
