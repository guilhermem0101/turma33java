programa
{
	
	funcao inicio()
	{
	inteiro n
	escreva("Entre com um numero: ")
	leia(n)
		se (n>0){
			se(n%2==0){
				escreva("numero é par e positivo")
			}
			senao {
				escreva("numero é impar e positivo")
			}
		
		}
		senao {
			se(n%2==0 e n!=0){
				escreva("numero é par e nagativo")
			}senao se (n==0){
				escreva("numero é neutro")
			}
			senao {
				escreva("numero é e negativo")
			}	
		}
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 414; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */