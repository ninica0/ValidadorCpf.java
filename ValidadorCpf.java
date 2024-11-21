import java.util.*;
public class ValidadorCpf {

	public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
	
		
	int[] digitos = new int[11];
	int i, soma = 0, peso;
	long cpf;  
System.out.println("Digite seu CPF(apenas números):");
cpf=sc.nextLong();


	for (i = 10; i >= 0; i--) {
    digitos[i] = (int) (cpf % 10);
    cpf /= 10;
	}


	for (i = 0; i < 11; i++) {
    System.out.print(digitos[i] + " ");
	}


	soma = 0;
	peso = 10;
	for (i = 0; i < 9; i++) {
    soma += digitos[i] * peso;
    peso--;
	}

	int digito1 = 11 - (soma % 11);
	if (digito1 >= 10) {
    digito1 = 0;  
	}


	soma = 0;
	peso = 11;
	for (i = 0; i < 10; i++) {
    soma += digitos[i] * peso;
    peso--;
	}

	int digito2 = 11 - (soma % 11);
	if (digito2 >= 10) {
    digito2 = 0; 
	}


	System.out.println("Valor dos dígitos verificadores: " + digito1 + " " + digito2);


	if (digito1 == digitos[9] && digito2 == digitos[10]) {
    System.out.println("CPF válido");
	} else {
    System.out.println("CPF inválido");
	}
	}
	}

