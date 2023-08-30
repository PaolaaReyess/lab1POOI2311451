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
		/* ejercicio 1a*/
		
		if(6<6+5)
		 System.out.println("Hello");
		 System.out.println("There");
		 
		 //Respuesta: Hello 
		 // There
		 
		 /*ejercicio 1b*/
		 
		 int x=1, y=2, z=3;
		 
		 if(x>y)
    	 if(x>z)
    		 System.out.println("11111");
    	 else
    		 System.out.println("22222");
    		    
    	//Respuesta no imprime nada 
    	
    	/*ejercicio 1c*/
    	
    	if ( x < z)
    	    System.out.println("*");
    	else if (x == z)
    	    System.out.println("&");
    	else
    	    System.out.println("$");
    	    
    	//Respuesta : *
    	
    	/*ejercicio 1d*/
    	
    	if ( x<y)
    	    System.out.println("####");
    	else {
    	    System.out.println("&&&&");
    	    System.out.println("****");
    	}
    	//Respuesta : ####
    	
    	/*ejercicio 1e*/
    	
    	if ( x>y)
    	    System.out.println("####");
    	else {
    	    System.out.println("&&&&");
    	    System.out.println("****");
    	}
    	//Respuesta : &&&&
    	//****
    	
    	/*ejercicio 1f*/
    	
    	int a1=100; int a2=200;
    	
    	if(a1>100 && a2<=200)
    	    System.out.println(a1+" "+a2+" "+(a1+a2));
    	else 
    	    System.out.println(a1+" "+a2+" "+(2*a1+a2));
    	
    	//Respuesta : 100 200 400
    	
    	/*ejercicio 1g*/
    	
    	if(++x > y++ || x-- > 0 )
    	    z++;
    	else 
    	    z--;
    	System.out.println(x+" "+y+" "+z);
    	
    	//Respuesta : 1 3 4 
    	
    	/*ejercicio 1h*/
    	
    	if(x<y){
    	    System.out.println("####");
    	    System.out.println("****");
    	}
    	else 
    	    System.out.println("&&&&");
    	    
    	//Respuesta : ####
    	// ****
    	
    	/*ejercicio 1i*/
    	
        if ('x' > 'y' || 66 > (int)('A'))
            System.out.println("#*#");
            
        //Respuesta : #*#
        
        /*ejercicio 1j*/
        
        if (x < z)
            System.out.println("*");
        else if (x==z)
            System.out.println("&");
        else 
            System.out.println("$");
            
        //Respuesta : *
    }

}