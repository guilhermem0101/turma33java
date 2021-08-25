programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{	
		const inteiro NUMERODEPESSOAS = 20
		real mediaS=0.0, mediaF=0.0, salario=0.0,somaSalarios=0.0,maiorSalario=0.0,somaFilhos=0.0,percentual=0.0,salariosMaiorCem = 0.0
		inteiro Nfilhos = 0
		para (inteiro p =1; p<=NUMERODEPESSOAS; p++){
			escreva("entre com seu salario: ")
			leia(salario)
			escreva("entre com seu numero de filhes: ")
			leia(Nfilhos)

			somaSalarios = somaSalarios + salario
			somaFilhos = somaFilhos + Nfilhos
			se (salario> maiorSalario){
				maiorSalario=salario
			}
			se (salario>100.00){
				salariosMaiorCem++
			}
		} 
		mediaS = somaSalarios/NUMERODEPESSOAS
		mediaF = somaFilhos/NUMERODEPESSOAS
		percentual= (salariosMaiorCem/NUMERODEPESSOAS)*100	

		escreva("A média salarial da população é: ",mat.arredondar(mediaS,2)," R$\n")
		escreva("A média do numero de filhos da população é: ", mat.arredondar(mediaF,2), "\n")
		escreva("O maior salário é: ", maiorSalario," R$\n")
		escreva("O percentual de pessoas com salário maior que R$ 100 é: ",mat.arredondar(percentual, 2),"%") 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 411; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */