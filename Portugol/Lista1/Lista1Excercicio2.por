programa {
	funcao inicio (){
		inteiro dias,diasRestantenes,meses,anos
		escreva("Entre com sua idade em dias: ")
		leia(dias)
				
		anos = dias/365
		meses = (dias%365)/30
		diasRestantenes = ((meses%365)%30)
		
		escreva("Os anos decorridos são " +anos+ ", "  + meses+ " meses e " +diasRestantenes+ " dias")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 317; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */