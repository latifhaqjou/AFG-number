package afgnum;

import java.util.Scanner;

public class AFGnum {
    public static void main(String[] args) {
        Scanner obg=new Scanner(System.in);
        System.out.print("enter your phon number :");
        String inNum=obg.nextLine();
        if (inNum.startsWith("07"))
        {
            if((inNum.length()==10))
            {
                if      (inNum.startsWith("070"))
                {
                    System.out.println("it's an AWCC number");
                }
                else if (inNum.startsWith("071"))
                {
                    System.out.println("it's an AWCC  number");
                }
                else if (inNum.startsWith("072"))
                {
                    System.out.println("it's a ROSHAN  number");
                }
                else if (inNum.startsWith("073"))
                {
                    System.out.println("it's an ETESALAT  number");
                }
                else if (inNum.startsWith("074"))
                {
                    System.out.println("it's a SALAM  number");
                }
                else if (inNum.startsWith("076"))
                {
                    System.out.println("it's a MTN number");
                }
                else if (inNum.startsWith("077"))
                {
                    System.out.println("it's a MTN  number");
                }
                else if (inNum.startsWith("078"))
                {
                    System.out.println("it's an ETESALAT number");
                }
                else if (inNum.startsWith("079"))
                {
                    System.out.println("it's a ROSHAN number");
                }
                else
                {
                    System.out.println(" out of range");
                }


            }
            else {System.out.println("wrong number");}
              
        }
        else {System.out.println("wrong number");}
    }

}
