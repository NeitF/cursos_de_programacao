package classe.desafios;

import javax.swing.JOptionPane;

public class DataTeste {
	public static void main(String[] args) {
			
		Data date = new Data();
		
		/*
		date.dia = Integer.parseInt(JOptionPane.showInputDialog("Insira uma dia"));
		date.mes = Integer.parseInt(JOptionPane.showInputDialog("Insira uma mês"));
		date.ano = Integer.parseInt(JOptionPane.showInputDialog("Insira um ano"));
		*/
		
		System.out.println(date.obterDataFormatada());
		
		Data date2 = new Data(7, 11, 2021);
		
		System.out.println(date2.obterDataFormatada());
		
		date.imprimirDataFormatada();
		date2.imprimirDataFormatada();
	}
}
