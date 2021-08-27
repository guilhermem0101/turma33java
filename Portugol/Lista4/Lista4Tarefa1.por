programa
{
	
	funcao inicio()
	{
		inteiro notas[5], x, maiorNota=0
		para(x=0;x<5;x++){
			escreva("Entre com uma nota ")
			leia(notas[x])
			se (notas[x]>maiorNota){
				maiorNota = notas[x]
			}
		}
		para(x=0;x<5;x++){	
			escreva(notas[x]," ")
		}
		escreva("\nA maior nota é ",maiorNota)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 275; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */