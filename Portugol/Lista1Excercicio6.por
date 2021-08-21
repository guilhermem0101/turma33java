programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{//Ecercicio6. Distancia de dois pontos cartesianos.
	real x1, x2, y1, y2, x, y, d
	escreva("Entre com x1")
	leia(x1)
	escreva("Entre com x2")
	leia(x2)
	escreva("Entre com y1")
	leia(y1)
	escreva("Entre com y2")
	leia(y2)
	x = mat.potencia(x2-x1, 2.0) 
	y = mat.potencia(y2-y1, 2.0)
	d = mat.raiz((x + y), 2.0)
	
	escreva("A Distancia dos pontos cartesianos é ", d)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 446; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */