package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		String s = "Foco e determinação";
		s = s.replace("determinação", "Perseverança");
		s = s.toUpperCase();
		s = s.concat("!");
		
		System.out.println(s);
		
		String r = "Rafael".toUpperCase();
		System.out.println(r);
		
		String y = "Bom dia X".replace("X", "Rafael").concat("!");
		System.out.println(y);
		
		// Tipos primitivos nao tem o operador "." (Notação ponto)
//		int a = 3;
//		a.replace(3, 5)
//		System.out.println(a);
		
	}

}

// "String" não é um tipo primitivo, nem palavra reservada.
// ".toUpperCase" na linha 9, usamos para transformar o que está armazenado na variável "s" ser impresso em letras maiúsculas.
// ".replace" na linha 8 usamos para alterarmos um caractere, primeiro colocamos o que queremos alterar, e depois o nome da alteração.
// ".concat" como usamos na linha 10, vai concatenar o que atribuirmos dentro dos () do método.
// ".replace, .toUperCase, e etc" podemos usar dentro da mesma chamada, contando que sejam do mesmo tipo, seja uma string ou inteiro.
