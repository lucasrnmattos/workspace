import javax.swing.JOptionPane;

public class questa02 {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 n�mero"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 n�mero"));
		int soma;
		
		soma = num1+num2;
		
		JOptionPane.showMessageDialog(null, "A soma dos n�meros �: "+soma);
		
	}

}
