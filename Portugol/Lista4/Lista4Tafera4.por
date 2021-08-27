programa
{
	
	funcao inicio()
	{
		inteiro c, l, n1[3][3], soma=0, somaD=0
		para (l=0;l<3;l++){
			para(c=0;c<3;c++){
				escreva("entre com valores para compor a matrizx 3x3. Entre com entrada [",l+1,"][",c+1,"] ")
				leia(n1[l][c])
				soma = soma + n1[l][c]
				se (l==c){
					somaD = somaD + n1[l][c]	
				}
			}
		}escreva("\nA soma de todas as entradas é ",soma,", e a soma das entradas da diagonal principal é ",somaD)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 54; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {n1, 6, 16, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */