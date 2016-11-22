package de.hfu.BuchstabenGross;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println( "Gebe deinen Text ein!:" );
    	String s = sc.nextLine();
    	
    	System.out.println(s.toUpperCase());
    	
    	sc.close();
    }
}
