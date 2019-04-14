import java.util.Scanner;

/**
 * Given an input integer, you must determine which primitive data types are capable of properly storing that input.
 *
 * To get you started, a portion of the solution is provided for you in the editor.
 *
 * Reference: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
 *
 * Input Format
 *
 * The first line contains an integer, , denoting the number of test cases.
 * Each test case, , is comprised of a single line with an integer, , which can be arbitrarily large or small.
 *
 * Output Format
 *
 * For each input variable  and appropriate primitive , you must determine if the given primitives are capable of storing it. If yes, then print:
 *
 * n can be fitted in:
 * * dataType
 * If there is more than one appropriate data type, print each one on its own line and order them by size (i.e.: ).
 *
 * If the number cannot be stored in one of the four aforementioned primitives, print the line:
 *
 * n can't be fitted anywhere.
 *
 * Sample Input
 * 5
 * -150
 * 150000
 * 1500000000
 * 213333333333333333333333333333333333
 * -100000000000000
 *
 * Sample Output
 * -150 can be fitted in:
 * * short
 * * int
 * * long
 * 150000 can be fitted in:
 * * int
 * * long
 * 1500000000 can be fitted in:
 * * int
 * * long
 * 213333333333333333333333333333333333 can't be fitted anywhere.
 * -100000000000000 can be fitted in:
 * * long
 */


public class JavaDataTypes {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++) {
            try { //we use try since errors are likely to happen here
                long x = sc.nextLong();
                System.out.println(x+" can be fitted in:");
                /*
                Standard Java Primitive Integer Types
                byte 1 byte  -128 to 127
                short 2 bytes  -32,768 to 32,767
                int 4 bytes -2,147,483,648 to 2,147,483,647
                long 8 bytes -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
                * */
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x>=-32_768 && x<=32_768)System.out.println("* short");
                if(x>=-2_147_483_648 && x<=2_147_483_647)System.out.println("* int");
                if(x>=-9_223_372_036_854_775_808L && x<=9_223_372_036_854_775_807L)System.out.println("* long");
            }
            catch(Exception e) { //we call the catch method to handle errors
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
