package exercicios;
import java.util.Scanner;
public class CensoDemográfico {

		 public static void main( String[] args){
				Scanner entrada = new Scanner(System.in);
				int  IdadeHomem=0, IdadeGeral=0, IdadeMulher=0, sexo, idadegeral=0, Idades=0,  outros =0, idadeH=0, Idadeoutros=0, x=0; //criei as respectivas variaveis, atribuindo o valor 0 para a maioria
				
				double AlturaMulher=0, MediaGeral= 0;
				
				
				 for(int i=0; i<1000; i++) { // laço de repetição, até que se repita 1000x
					 System.out.println("Insira o numero correspondente ao seu genero (0-feminino, 1-masculino, 2-outros )"); 
					 sexo = entrada.nextInt(); // entrada manual do usuario
					 
					 
					 if (sexo ==2) { // se sexo for igual a 2, perguntar somente a idade
						 System.out.println("Digite sua idade:");
						 Idadeoutros = entrada.nextInt();
						 x++; // variavel para adicionar quantidade de vezes que escolheram a opção 2
						 	 
					 }
					 
					 else if (sexo == 0){ // se sexo for igual a 0, perguntar idade e altura
						 System.out.println("Digite sua idade: ");
						 IdadeMulher = entrada.nextInt();

						 System.out.println("Digite sua altura em metros:");
						 AlturaMulher = entrada.nextDouble();	 
						 
					 }else if (sexo == 1) { // se sexo for igual a 1, pergunte somente a idade
						 System.out.println("Digite sua idade: ");
						 IdadeHomem = entrada.nextInt();
					 }
					 	
					 idadegeral = IdadeMulher + IdadeHomem; //idade geral recebe as idades das mulheres e homens
					 
					 
					 if(idadegeral >= 18 && idadegeral <= 35){ // se a idade geral for igual ou maior que 18, ou, igual ou menor que 35
					 		 Idades = Idades + 1;	//para adicionar o numero de vezes que idade foi maior que 18 e menor que 35
	 				 	 }
					 	
				
					 MediaGeral += IdadeMulher + IdadeHomem +  Idadeoutros; // mediageral recebe todas idades captadas
					 
				 }
				
				System.out.println("média da idade do grupo: " + MediaGeral /1000); // mostra a media geral do grupo
				System.out.println("média da altura das mulheres: " + AlturaMulher/1000); // mostra a media da altura das mulheres
				System.out.println("média da idade dos homens: " + IdadeHomem/1000); // mostra media da idade dos homens
				System.out.println("quantidade de pessoas que identificaram como outros: " + x ); // mostra a quantidade de pessoas que escolheram a opção 2
				System.out.println("percentual de pessoas com idade entre 18 e 35 anos: "+ Idades); // mostra o percentual de pessoas entre 18 e 35 anos
				
				entrada.close(); // fecha scanner
	    }
	}
