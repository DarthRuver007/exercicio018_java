

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Informe o nome do cliente: ");
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do produto: "));
        String categoria = JOptionPane.showInputDialog("""
                                                                     Informe a categora do desconto:
                                                                     A - 10%
                                                                     B - 15%
                                                                     C - 20%
                                                                     D - 25%
                                                                     E - 50%
                                                                     F - 51.25%
                                                       
                                                                     """);
        double desconto;
        char categoriaCHAR = categoria.charAt(0);
        switch (categoriaCHAR) {
            case 'A':
                desconto = 10;
                break;
            case 'B':
                desconto = 15;
                break;
            case 'C':
                desconto = 20;
                break;
            case 'D':
                desconto = 25;
                break;
            case 'E':
                desconto = 50;
                break;
            case 'F':
                desconto = 51.25;
                break;
            default:
                desconto = 0;
                break;
        }
        double vf = preco-(preco*(desconto/100));
        JOptionPane.showMessageDialog(null, "O cliente " + nome + " pagará no produto o valor de R$" + vf);
    }
}
