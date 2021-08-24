programa
{
	
	funcao inicio()
	{
		inteiro idade
		escreva("Qual é a idade do nadador? ")
		leia(idade)

		se (idade >=5 e idade <=7){
			escreva("O nadador faz parte da categoria Infantil A")		
		}
		senao se (idade >7 e idade <=11){
			escreva("O nadador faz parte da categoria Infantil B")
		}
		senao se (idade >11 e idade <=13){
			escreva("O nadador faz parte da categoria Juvenil A")
		}
		senao se (idade >13 e idade <=17){
			escreva("O nadador faz parte da categoria Juvenil B")			
		}
		senao
		escreva("O nadador é maior de 18")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 543; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */