programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro c, l, n1[4][6] ,n2[4][6], n3[4][6],n4[4][6], x=0
		para (l=0;l<4;l++){
			para(c=0;c<6;c++){
				n1[l][c] = sorteia(1,10)
				n2[l][c] = sorteia(1,10)
				n3[l][c] = n1[l][c] + n2[l][c]
				n4[l][c] = n1[l][c] - n2[l][c]							
			}				
		}escreva("\n\nA matriz N1 é \n")
		para (l=0;l<4;l++){					
			escreva("\n")
			para(c=0;c<6;c++){
				escreva(n1[l][c], "\t")					
			}
		}
		escreva("\n\nA matriz N2 é \n")
		para (l=0;l<4;l++){
			escreva("\n")
			para(c=0;c<6;c++){
				escreva(n2[l][c], "\t")
			}					
		}
		escreva("\n\nA matriz N3=N1+N2 é \n")
		para (l=0;l<4;l++){
			escreva("\n")
			para(c=0;c<6;c++){
				escreva(n3[l][c], "\t")
			}			
		}
		escreva("\n\nA matriz N4=N1-N2 é \n")
		para (l=0;l<4;l++){escreva("\n")
			para(c=0;c<6;c++){
				escreva(n4[l][c], "\t")
			}	
		}				
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 451; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */