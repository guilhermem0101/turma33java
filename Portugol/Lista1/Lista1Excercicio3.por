programa {
	funcao inicio (){
		inteiro tempoSegundo,horas,minutos,segundos
		escreva("Entre com o tempo do evento em segundos: ")
		leia(tempoSegundo)

		horas = tempoSegundo/3600
		minutos = (tempoSegundo%3600)/60
		segundos = ((tempoSegundo%3600)%60)
		
		escreva("O tempo decorrido é " +horas+ " horas, " +minutos+ " minutos e " +segundos+ " segundos.")
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 366; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */