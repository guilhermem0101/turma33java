programa
{
	
	funcao inicio()
	{
		real n=0.0, soma=0.0, media, total=0.0		
		enquanto(n>=0){
			
			escreva("Entre com um numero positivo, caso o numero seja negativo, programa irá interromper ")
			leia(n)
			se(n>=0){
			soma= soma+n
			total++
			}	
		}
		media=soma/total
		escreva("Você entrou com um numero negativo, a somatória total é ",soma,"\n A média é ", media,"\n e o número de entradas foi ", total)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 35; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */