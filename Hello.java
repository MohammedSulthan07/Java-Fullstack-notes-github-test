public class Hello {
    public static void main(String[] args) {
        // 1. Comments and its types
             //Single line
             /*  multi line
                  comments */

        // 2.Variable 
            // int a = 10
           // int ab = 20
           //! int 1abc = 20 error number used at start
           // int _abc=20;
           //int a_b_c c = 10
           // int \$ c = 10
           //int a$ b = 20 ; error space
           //int a b = 40
        //3.Datatypes
          //byte, short, int, long, float, double, char, boolean

         // byte a = (byte) 128; //Narrow Type Casting
         // System.out.println(a);

         // char c= 'a';//ANSCI
         // int b=c;   //Widining Type casting
         // System.out.println(b);

         // float f = 3.14f;   // in java for float we need to mention that as 'f' at the end of the number as given
         // double d = 3.14;   // there is no need for decleration but 'd' can be used

        //4.Operators
                /*Unary Operator, ---> ++,--

                int a=10;
                a=a+1; --> Normal
                a++; --> unary ,

                pre: ++a
                post: a++

                ex:
                  int a = 10
                  System.out.println(a++);//post increment
                  System.out.println(a);
                  System.out.println(++a);//pre increment

                  Arithmetic Operator, --> +,-,*,/,%

                  int a = 1% * 5
                  System.out.println(a);

                  if you know you know

                  Shift Operator,(Bitwise Operator,)
                  Relational Operator,
                  Bitwise Operator, --> &,|,^(XOR),~(not)

                  //4.bitwise operator-> &,|,^,, <<, >>

                  int a=2&10;
                  System.out.println(a);

                  1.decimal -base-10
                  2.binary base-2
                  3.octal base-8
                  4. hexedecimal base-16 (10-15,A-F)

                  & - if both 1 then true
                  | - if any one 1 then true(1)
                  ^ - if different(opposite) like 0 and 1 then true
                  << - move left , if 2= 0010 then 2<<1 will be 0100
                  >> - same as left but right
                  ~ - write the inverse and also the msb and lsb

                  Logical Operator, --> && ,|| ,!

                  Ternary Operator and
                  Assignment Operator. */ 
        
        //5. Flow of control
             //if

             //ex:

             // public class Hello {
             // Run | Debug
             // public static void main(String[] args) {
             // int age=18;
             // if(age >= 18) {
             // System.out.println(x: "eligible to vote");
             // }
             // else{
             //    System.out.println("Not eligible to vote");
             // }
             // }
             // }

             //else and else if:

             /* 
                public class Hello {
                  public static void main(String[] args) {
                         int percentage=50;
                         boolean hasHallTicket=true;
                         if(hasHallTicket) {
                             if(percentage>=60){
                                  System.out.println(x: "eligible to write exam");
                                }
                            else{
                                  System.out.println(x: "pay fine amount");
                                }
                        }else{
                             System.out.println(x: "not eligible to write exam");
                            }
                     }
                } */

            //switch:

            /*
             int a=3;
             switch(a){
                 case 1:
                    System.out.println(a++);
                    break;
                case 2:
                    System.out.println(a++);
                    break;
                case 3:
                    System.out.println(a++);
                    break;
                case 4:
                    System.out.println(a++);
                    break;
                case 5:
                    System.out.println(a++);
                    break;
                default:
                    System.out.println("Default")
                    break;
                
                     } */

        //To take input from user use
        /*
        import java.util.Scanner;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextint() */

        //Example:
        /*
        
         import java.util.Scanner;
        public class Got {
             public static void main(String[] args) {
                   Scanner sc=new Scanner(System.in);
                   int a=sc.nextInt();
                   int b=sc.nextInt();
                   if (a>b) {
                        System.out.println(a+" is greater than B");
                   }
                   else{
                        System.out.println(b+" is greater than A");
                   }
    }
    
}
 */

        
    }
}