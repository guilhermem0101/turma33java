programa
{
	
	funcao inicio()
	{
		inteiro P, M, E
		escreva("João, qual o peso do seu saco de tomates? ")
		leia(P)

		se (P>50){
			E=P-50
			M=E*4
			escreva("Como o peso é ",P ," kg, o excedente é de ", E," kg e sua multa será de R$ ",M)
		}
		senao {
			E =0
			M =0
			escreva("Como o peso é ", P," Kg, então o excedente é igual a ", E, " kg e multa igual a R$ ",M)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 371; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */