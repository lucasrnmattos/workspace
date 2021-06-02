import javax.swing.JOptionPane;

public class questa04 {

	public static void main(String[] args) {
		int conta = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da conta:"));
		int servico;
		int total;
		
		servico = (conta * 10) / 100;
		total = conta + servico;
		
		
		JOptionPane.showMessageDialog(null, "10% do garçom: "+servico+" Total:"+total);
		
	}

}
