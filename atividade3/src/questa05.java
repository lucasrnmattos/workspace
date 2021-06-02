import javax.swing.JOptionPane;

public class questa05 {

	public static void main(String[] args) {
		int horas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas"));
		int valorhora = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da hora"));
		int soma;
		
		soma = horas * valorhora;
		
		
		JOptionPane.showMessageDialog(null, "O salário do funcionário é: "+soma);
		
	}

}
