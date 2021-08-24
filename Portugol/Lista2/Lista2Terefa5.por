programa
{
	
	funcao inicio()
	{
		real indice
		escreva("entre com o indice de poluição ")
		leia(indice)
		se (indice<=0.25){
			escreva("Esta tudo bem")
		}
		senao se (indice>0.25 e indice <0.30){
			escreva("Não especificado")		
		}
		senao se (indice >=0.3 e indice <0.4){
			escreva("1° grupo pare as atividades")
		}
		senao se (indice >=0.4 e indice <0.5){
			escreva("1° e 2° grupo parem as atividades")
		}
		senao {
			escreva("Todos os grupos parem as atividades")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 460; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */