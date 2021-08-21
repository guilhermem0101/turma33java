programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
	// Variaveis do problema
	real A,B,C,D,S,R
		escreva("Entre com numeros reais A, B, C, tal que satisfação a equação: D = ((A+B)^2 + (B+C)^2)/2\n")
		escreva("Entre com o numero A ")
		leia(A)
		escreva("Entre com o numero B ")
		leia(B)
		escreva("Entre com o numero C ")
		leia(C)
		D= 0.0
		//Resolução do problema
		S= mat.potencia((A+B),2.0)
		R= mat.potencia((B+C),2.0)
		D = ((S) + (R))/2
		escreva("o resulatado de D é: " + D)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 512; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */