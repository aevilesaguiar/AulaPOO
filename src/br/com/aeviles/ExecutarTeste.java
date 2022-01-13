package br.com.aeviles;

import java.math.BigDecimal;

public class ExecutarTeste {

	public static void main(String[] args) {

		/*O main � usado apenas para teste ou para desktop*/
		
		
		Produto produto1=new Produto();
		produto1.setId(1L);
		produto1.setNome("M�dulo Orienta��o a Objetos");
		produto1.setValor(BigDecimal.valueOf(100));
		
		Produto produto2=new Produto();
		produto2.setId(2L);
		produto2.setNome("M�dulo Spring boot API REST");
		produto2.setValor(BigDecimal.valueOf(300));
		
		//esse objeto eu usarei o m�todo addProduto
		Produto produto3=new Produto();
		produto3.setId(3L);
		produto3.setNome("M�dulo Angular");
		produto3.setValor(BigDecimal.valueOf(300));
		
		Produto produto4=new Produto();
		produto4.setId(4L);
		produto4.setNome("M�dulo  de Hibernate");
		produto4.setValor(BigDecimal.valueOf(300));
		
		Venda venda = new Venda();
		venda.setDescricaoVenda("Venda Curso Forma��o Java");/*o set est� setando , ou seja jogando os dados para dentro do objeto*/
		venda.setEnderecoEntrega("Entrega pelo e-mail");
		venda.setId(10L);
		venda.setNomeCliente("Flavio Tavares");
		venda.setValorTotal(BigDecimal.valueOf(197.00));
		
		
		//colocar o produto dentro da lista
		venda.getListaProdutos().add(produto1);
		venda.getListaProdutos().add(produto2);/*nessa linha eu n�o consigo fazer valida��es*/
		venda.addProduto(produto3);/*eu consigo fazer v�rias valida��es no m�todo*/
		venda.addProduto(produto4);
		
		
		System.out.println("");
		
		System.out.println("Lista de produtos");
		for (Produto produto : venda.getListaProdutos()) {
			System.out.println("Descri��o do produto: "+produto);
		}
		
		System.out.println("");
		
		
		System.out.println("Descri��o da Venda: "
				+ venda.getDescricaoVenda()+" e o total "+venda.getValorTotal());
		
		
		System.out.println("");
		
		System.out.println("Descri��o Venda: "+venda.getDescricaoVenda());/*o get est� recuperando*/
		System.out.println("Descri��o entrega: "+venda.getEnderecoEntrega());
		
		System.out.println("Valor da variavel total: "+ venda.getValorTotal());

	}

}
