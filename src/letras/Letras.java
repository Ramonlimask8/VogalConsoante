
package letras;

import java.util.Scanner;


public class Letras {

    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Digite uma letra ");
            String N = leitor.next();
                
                
                switch(N){
	case"a":
	case"e":
	case"i":
	case"o":
	case"u":
           
		System.out.println("a letra "+N+ " é uma vogal");
		break;
                default:
                System.out.println("a letra "+N+ " é uma Consoante");
        
                  
    }
    
}
}
