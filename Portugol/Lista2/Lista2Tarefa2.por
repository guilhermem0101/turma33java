programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		real H, E, Se,St
		escreva("Operario, quntas horas você trabalhou? ")
		leia (H)
		se (H>50){
			E=H-50
			Se=E*20
			St= 500 + Se
			escreva("Operario, como você trabalhou ", E," hosras a mais,tera um salario total de R$", St, " com valor adicionado de R$ ", Se)
			
		}
		senao {
			St= H*10
			E=0.0
			Se=0.0
			escreva("Operario, como você trabalhou ", H, " seu salario sera de R$ ", St)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 202; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */