import java.util.*;

public class demo {

    public static boolean isSumDigit(int n, int k){
        int sum=0;

        int temp = n;
        while(temp>0){
            int ldigit = temp%10;
            sum += ldigit;
            temp = temp/10;
        }

        if(sum==k) return true;
        else return false;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();

        int cnt=0;
        int num=1;
    
        while(cnt<n){
            if(isSumDigit(num,k)){
                System.out.println(num);
                cnt++;
            }
            
            num = num+1;
        }

        
    }
}
