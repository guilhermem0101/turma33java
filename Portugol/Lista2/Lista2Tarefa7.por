programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		real altura, base, area
		escreva("Para calcular a area do triangulo, entre com a altura do triangulo ")
		leia(altura)
		escreva("Entre com a base do triangulo ")
		leia(base)

		area = (base*altura)/2
		se (altura <= 0 ou base<=0){
			escreva("Entrada invalida. Entre com numeros positivos.")
		}
		senao
			
			escreva("A area do triangulo é ",mat.arredondar(area, 2), " m²")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 306; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */