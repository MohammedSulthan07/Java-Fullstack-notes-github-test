public class MissingNumber { 
    public static void main(String[] args) {

        int a[] = {0, 1, 2, 3, 5};
        int N=5;
        // int n = arr.length;
        // int total = n * (n + 1) / 2;
        // int sum = 0;
        // for (int num : arr) {
        //     sum += num;
        // }
        // int missingNumber = total - sum;
        // System.out.println("The missing number is: " + missingNumber);

        int xor1=0,xor2=0;
        for(int i=0;i<N-1;i++)
        {
            xor1=xor1^(i+1);
            xor2=xor2^ a[i];

        }
        System.out.println(xor1^xor2);
    }

}