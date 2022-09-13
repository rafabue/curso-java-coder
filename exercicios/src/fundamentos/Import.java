package fundamentos;

import java.util.Date;
import javax.swing.JButton;

public class Import {
	
	public static void main(String[] args) {
		java.lang.String b = "Boa tarde!";
		java.lang.System.out.println(b);
		
		String s = "Bom dia!";
		System.out.println(s);
		
		Date d = new Date();
		System.out.println(d);
		
//		JButton botao = new JButton();
	}

}

// import da linguagem Java tem como objetivo disponibilizar em uma classe, de um determinado pacote, o acesso a demais classes que estejam em pacotes diferentes.
// Ao digitarmos "Date" e dar CTRL + ESPAÇO a própria IDE importa para ser usado
// O que temos dentro de java.lang temos acesso, se estiver fora, precisamos fazer o uso do import e importar.
