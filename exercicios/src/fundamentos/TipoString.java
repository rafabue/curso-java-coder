package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!"));
		System.out.println(s + "!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.length());
		System.out.println(s.endsWith("tarde!"));
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("Boa tarde"));
		
		var nome = "Rafael";
		var sobrenome = "Bueno";
		var idade = 24;
		var salario = 1300.50;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nidade: " + idade + "\nsalario: " + salario + "\n\n");
		
		// Uma maneira de identar melhor nossa linha de código acima, é usarmos o exemplo abaixo.
		
		System.out.printf("%s %s tem %d e ganha %.2f.", nome, sobrenome, idade, salario);
		
		// Outro exemplo usando a criação de uma variável com uso do .format que traz o mesmo resultado da linha de código acima.
		
		String frase = String.format("\n%s %s tem %d e ganha %.2f.", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
	}

}
// Como definimos na linhas 6, usamos o .chartAt(x) o qual usamos para pegar determinada parta da "String" onde dentro do () colocamos o indice ex (0) pega a primeira letra.
// Para entendermos o indice do chartAt, como na linha 6 começamos a contar a partir do 0, a partir do primeiro caractere após as aspas, indice 0 sendo letra O, 1 sendo letra l e assim por diante.
// String é algo imutável, não podemos alterar o valor que atribuirmos a variável que criamos por outro valor.
// s.startsWith("Boa"); usamos para consultar se o valor que armazenamos na variável s corresponde ao que inserimos no (), se sim, retorna true, se não, false.
// s.lenght() usamos para saber quantos caracteres possui a string que armazenamos na variável s, que corresponde a 9 caracteres.
// s.endWith() usamos para inserir uma string, e consultar se ela corresponde ao final da que atribuímos a variável s, se sim true, se não, false.
// s.equals() usamos para consultar se o valor que atribuimos a variável s é igual ao valor que atribuímos dentro do (), se sim, true, se não, false.
// s.equalsIgnoreCase() usamos para não considerar se as letras são maiúsculas ou minusculas, se forem todas iguais ele retorna true, se forem diferentes, false. 
// %s usamos para String, %d usamos para inteiros, %f usamos para float/double.
// .2 no entre o % e f da linha 32, usamos para definir que o número do tipo float imprima até DUAS casas decimais, podemos colocarmos quantas quisermos, ou estiver dentro do possível.

