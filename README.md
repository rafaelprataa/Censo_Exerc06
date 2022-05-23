# Aqui temos uma pesquisa entre 1000 habitantes de uma região, e foi coletado as seguintes informações:
- GENERO
- IDADE
- ALTURA

# E MOSTRA OS SEGUINTES DADOS:
- média da idade do grupo;
- média da altura das mulheres;
- média da idade dos homens;
- quantidade de pessoas que identificaram como outros;
- percentual de pessoas com idade entre 18 e 35 anos (inclusive).

## Algoritmo do Exercicio

    INICIO

    PARA i=0;  i<1000 FAÇA
				IMPRIMA "(insira o numero correspondente ao seu genero (0-feminino, 1-masculino, 2-outros )"	
				
				          SE SEXO ==2
					IMPRIMA " Digite sua Idade:"
					LER IDADEOUTROS
					int x++	

					SE NÃO SE SEXO == 0	
				 	      IMPRIMA"Digite sua Idade:"	
					      IMPRIMA"Digite sua altura em metros:"	
						LER IDADEMULHER
						LER ALTURAMULHER
					
					SE NÃO SE == 1	
					      IMPRIMA "Digite sua idade:"
					      LERIDADEHOMEM
					
					FIM SE
						 IDADES >= QUE 18 OU IDADE <=35
							IDADES = IDADES + 1
					
				MEDIA GERAL = IDADEOUTROS + IDADEMULHER + IDADEHOMEM

	         FIM PARA
				IMPRIMA  "média da idade do grupo" + MEDIAGERAL/1000
				IMPRIMA  "média da altura das mulheres" + ALTURAMULHER/1000
				IMPRIMA  "média da idade dos homens"	+ IDADEHOMEM/1000
				IMPRIMA  "quantidade de pessoas que identificaram como outros" + x
				IMPRIMA  "percentual de pessoas com idade entre 18 e 35 anos" + IDADES	

    FIM
    
![fluxograma](https://user-images.githubusercontent.com/104045633/169899613-4b8aeb79-f242-4356-8da7-f30bce5f9545.png)

