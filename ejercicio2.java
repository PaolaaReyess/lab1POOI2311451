/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    int numero;
	    
	    Scanner leer = new Scanner(System.in);
	    System.out.println("Ingrese un número: ");
	    numero = leer.nextInt();
	    
	    if ( numero > 0 && numero%2 !=0)
	        System.out.println("True");
	}
}
