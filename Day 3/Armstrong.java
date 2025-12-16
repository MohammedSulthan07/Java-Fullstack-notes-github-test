import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int originalnum = num;
        int rem=0;
        int result=0;
        while(num!=0){
            rem=num%10;
            result+=Math.pow(rem,3);
            num/=10;
        }
        if(result==originalnum){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an Armstrong number");
        }
    }
}