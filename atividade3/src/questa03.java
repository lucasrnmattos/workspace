import javax.swing.JOptionPane;

public class questa03 {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite nota 01"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite nota 02"));
		int soma;
		int media;
		
		soma = num1+num2;
		media = soma/2;
		
		JOptionPane.showMessageDialog(null, "A m�dia �: "+media);
		
	}

}
