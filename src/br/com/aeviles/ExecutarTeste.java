package br.com.aeviles;

import java.math.BigDecimal;

public class ExecutarTeste {

	public static void main(String[] args) {

		/*O main é usado apenas para teste ou para desktop*/
		
		
		Produto produto1=new Produto();
		produto1.setId(1L);
		produto1.setNome("Módulo Orientação a Objetos");
		produto1.setValor(BigDecimal.valueOf(100));
		
		Produto produto2=new Produto();
		produto2.setId(2L);
		produto2.setNome("Módulo Spring boot API REST");
		produto2.setValor(BigDecimal.valueOf(300));
		
		//esse objeto eu usarei o método addProduto
		Produto produto3=new Produto();
		produto3.setId(3L);
		produto3.setNome("Módulo Angular");
		produto3.setValor(BigDecimal.valueOf(300));
		
		Produto produto4=new Produto();
		produto4.setId(4L);
		produto4.setNome("Módulo  de Hibernate");
		produto4.setValor(BigDecimal.valueOf(300));
		
		Venda venda = new Venda();
		venda.setDescricaoVenda("Venda Curso Formação Java");/*o set está setando , ou seja jogando os dados para dentro do objeto*/
		venda.setEnderecoEntrega("Entrega pelo e-mail");
		venda.setId(10L);
		venda.setNomeCliente("Flavio Tavares");
		venda.setValorTotal(BigDecimal.valueOf(197.00));
		
		
		//colocar o produto dentro da lista
		venda.getListaProdutos().add(produto1);
		venda.getListaProdutos().add(produto2);/*nessa linha eu não consigo fazer validações*/
		venda.addProduto(produto3);/*eu consigo fazer várias validações no método*/
		venda.addProduto(produto4);
		
		
		System.out.println("");
		
		System.out.println("Lista de produtos");
		for (Produto produto : venda.getListaProdutos()) {
			System.out.println("Descrição do produto: "+produto);
		}
		
		System.out.println("");
		
		
		System.out.println("Descrição da Venda: "
				+ venda.getDescricaoVenda()+" e o total "+venda.getValorTotal());
		
		
		System.out.println("");
		
		System.out.println("Descrição Venda: "+venda.getDescricaoVenda());/*o get está recuperando*/
		System.out.println("Descrição entrega: "+venda.getEnderecoEntrega());
		
		System.out.println("Valor da variavel total: "+ venda.getValorTotal());

	}

}
