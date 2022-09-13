package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		var a = 45; // declarando e inicializando variável 
		System.out.println(a);
		
		var b = 50;
		System.out.println(b);
		
		var c = "Texto";
		
		c = "Outro texto";
		System.out.println(c);
		
		double d; // declaração da variável
		d = 12345; // inicialização da variável
		System.out.println(d); // uso da variável 
		
		
	}

}
// No Java ao definirmos um tipo de variável, nós devemos usar a mesma tipagem ao chama-lá em outros trechos do código, não podemos alterá-la.
// Ao criarmos uma variável com "var" devemos criar e inicializar ela na mesma linha, diferente de quando tipamos (int, double, float) que podemos criar, e definir seu valor em outra linha.
// A "Inferencia" no Java, se da quando não definimos um tipo para nossa variável, mas um valor, e ele identifica esse tipo e consequentemente irá "inferir" a essa variável.
