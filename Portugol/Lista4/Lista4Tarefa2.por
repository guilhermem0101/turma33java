programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro valores[10],x,maiorValor=0, contador=0
		real soma =0.0, media=0.0
		
		para (x=0;x<10;x++){
			valores[x] =  sorteia(1,6)
			escreva(valores[x]," ")
			soma = soma + valores[x]
			se (valores[x]>=maiorValor){
				se (valores[x]>maiorValor){
					contador = 0
					contador++
					maiorValor=valores[x]
				}senao {
					contador++
				}		
			}
		}
		media= (soma)/10
		escreva("\nA media aritimética dos valores no vetor é: ",media, "\nE o maior valor foi, ",maiorValor," que apareceu ",contador," vez(es)")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 386; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {contador, 7, 38, 8};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */