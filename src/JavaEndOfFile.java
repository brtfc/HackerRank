/*
*
The challenge here is to read  lines of input until you reach EOF, then number and print all  lines of content.

Hint: Java's Scanner.hasNext() method is helpful for this problem.

Input Format

Read some unknown lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.

Output Format

For each line, print the line number, followed by a single space, and then the line content received as input.

Sample Input

Hello world
I am a file
Read me until end-of-file.
Sample Output

1 Hello world
2 I am a file
3 Read me until end-of-file.
* */

import java.util.Scanner;

public class JavaEndOfFile {

    public static void main(String[] args){

        // create a new scanner with the specified String Object
        Scanner scanner = new Scanner(System.in);

        //scanner.hasNext() returns true if the scanner has another token upon reaching the end of line
        //also, note that hasNext() opens the keyboard input stream when it is called.
        //else hasNext() would always return false.
        int i = 0;
        while(scanner.hasNext()){
            String s = scanner.nextLine();
            System.out.println(++i + ". " + s);
        }

        scanner.close();

    }
}
