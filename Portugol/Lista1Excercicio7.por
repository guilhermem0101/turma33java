programa
{
	
	funcao inicio()
	{//Ecercicio7 Resolução do sistema de equações lineares
	real a, b, c, d, E, f, x, y
	escreva("Para resolver o sistema de equações lineare,\n entre com os valores dos coeficientes. Diga a ")
	leia(a)
	escreva("Diga b ")
	leia(b)
	escreva("Diga c ")	
	leia(c)
	escreva("Diga d ")	
	leia(d)
	escreva("Diga e ")
	leia(E)
	escreva("Diga f ")
	leia(f)
	
	x = (c*E-b*f)/(a*E-b*d)
	y = (a*f-c*d)/(a*E-b*d)  
	
	//Observação: Para a operação ser realizada, (aE-bd) deve ser != 0
	
	escreva("O resultado de x é ", x ," e de y é ", y)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 506; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */