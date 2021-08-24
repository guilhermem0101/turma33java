programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		real n1, n2, n3, n4,p1,p2 ,p3, p4
		escreva("entre com um numero n1 ")
		leia(n1)
		escreva("entre com outro numero n2 ")
		leia(n2)
		escreva("entre com outro numero n3 ")
		leia(n3)
		escreva("entre com outro numero n4 ")
		leia(n4)
		
		p1=mat.potencia(n1, 2.0)
		p2=mat.potencia(n2, 2.0)
		p3=mat.potencia(n3, 2.0)
		p4=mat.potencia(n4, 2.0)

		se (p3>=1000){
			escreva("O quadrado de ", n3 ," é ",p3, " \n")
			
		}
		senao {
			escreva("O quadrado de ", n1 ," é ",p1, " \n")
			escreva("O quadrado de ", n2 ," é ",p2, " \n")
			escreva("O quadrado de ", n3 ," é ",p3, " \n")
			escreva("O quadrado de ", n4 ," é ",p4, " \n")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 680; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */