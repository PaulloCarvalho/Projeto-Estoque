package Aplicacao;

import java.util.Scanner;

public class Estoque {
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		

		Produtos produto =new Produtos ();
		

		System.out.println("Nome do produto: ");
		produto.produto = sc.next();
		
		System.out.println("Diga a quantidade");
		produto.quantidade = sc.nextDouble();
		
		
		System.out.println("Insira o preco do produto Individual");
		produto.preco = sc.nextDouble();
		
		
		System.out.println(" Confirmacao: " +produto.produto+",Estoque atual: " +produto.quantidade+ ", Preco: "+produto.preco+" Valor atual do estoque: R$ "+produto.quantidade*produto.preco);
		
		
		System.out.println("Deseja acrescentar produtos ao estoque?");
		
		 int estoque = sc.nextInt();
		 produto.addProdutos (estoque); 
		 
		 
		 System.out.println("Atualizacao: " +produto.produto+ " , Estoque atual: " +produto.quantidade+ ",Preco: " +produto.preco);
		 
		 System.out.println("Foi realizada alguma venda no periodo ? ");
		 estoque= sc.nextInt();
		 produto.subProdutos (estoque);
		 
		System.out.println( "Atualizacao após vendas: " +produto.produto+ " , Estoque atual: " +produto.quantidade+ ",Preco: " +produto.preco+ "Valor atual do estoque: R$ "+produto.quantidade*produto.preco);
				
		 
		 sc.close();

}
