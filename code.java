package first;

import java.util.Scanner;

public class ebek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many number you're gonna enter:");
        int n = input.nextInt();
        int eb=0;
        int ek=0;
        for(int i=1; i<=n;i++){
            System.out.print(i+".number:");
            int num = input.nextInt();
            if(i==1){
                 eb = num;
                 ek = num;
            } else if (i>1) {
                if(num<eb) {
                    eb = num;
                }else{
                    ek = num;
                }
            }
        }
        System.out.println("highest number:"+eb+"\nlowest number:"+ek);

    }
}
