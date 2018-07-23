import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class MagicSet {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int testCases=Integer.parseInt(br.readLine());
        for(int t=0;t<testCases;t++){
            String str[]=br.readLine().split(" ");
            int n=Integer.parseInt(str[0]);
            int m=Integer.parseInt(str[1]);
            char binary[];
            //int Number=Integer.parseInt(br.readLine());
            //String str=Integer.toString(Number,2);
            //System.out.println("Binary of "+Number +" is " +str);
            str=br.readLine().split(" ");
            int array[]= new int[n];
            for(int i=0;i<n;i++){
                array[i]=Integer.parseInt(str[i]);
            }
            //System.out.println(Arrays.toString(array));
            long total=(long)Math.pow(2,n)-2;
            long count=0;
            for(int i=1;i<=total;i++){
                binary=(Integer.toString(i,2)).toCharArray();
                System.out.println("Binary of "+i+" is"+(Arrays.toString(binary)));
                int binaryLength=binary.length; //to initialize the length of binary array
                int sum=0,num=n-1;
                while(binaryLength>0){
                    int value=Integer.parseInt(binary[binaryLength-1]+"");
                    sum+=value*array[num];
                    binaryLength--;
                    num--;
                }
                System.out.println("Sum is "+sum);
                if(sum%m==0){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
