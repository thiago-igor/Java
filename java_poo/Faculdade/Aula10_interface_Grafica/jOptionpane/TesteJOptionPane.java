package java_poo.Faculdade.Aula10_interface_Grafica.jOptionpane;

import javax.swing.JOptionPane;

public class TesteJOptionPane {
	
	public static void main(String[] args) {
		
		boolean continua = true;
		
		while (continua) {
			
		String xStr = JOptionPane.showInputDialog(null, "Informe um valor inteiro", "Calculadora MDC", JOptionPane.QUESTION_MESSAGE); // aqui estamos fazendo uma interfaciel com parametro = null, mensagem = informe um valor inteiro , titulo = Calculadora mdc e o tipo da interface = QUESTION_MESSAGE

		String yStr = JOptionPane.showInputDialog(null, "Informe outro valor inteiro", "Calculadora MDC", JOptionPane.QUESTION_MESSAGE);
		

		int x = Integer.parseInt(xStr); // transformando uma string em um inteiro, pois JOpitionpane retorna uma string
		int y = Integer.parseInt(yStr);

		Calculadora calc = new Calculadora();
		int resultado = calc.mdc(x, y);

			JOptionPane.showMessageDialog(null, "MDC de "+ xStr + " e " +yStr +" = "+ resultado, " Resposta(MDC)", JOptionPane.INFORMATION_MESSAGE);

			int opcao = JOptionPane.showConfirmDialog(null, "Deseja calcular outro MDC?", "Calculadora MDC", JOptionPane.YES_NO_OPTION); //JOptionPane.YES_NO_OPTION = opçao de sim ou nao

			if(opcao != JOptionPane.YES_OPTION ){
				continua = false;
			}
		}
		
	}

}
