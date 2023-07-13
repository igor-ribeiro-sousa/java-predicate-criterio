package estudoJavaFuncionalArgumentoPredicate.programa;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import estudoJavaFuncionalArgumentoPredicate.entidade.Produto;
import estudoJavaFuncionalArgumentoPredicate.servico.ProdutoService;

public class Programa {

	public static void main(String[] args) {
		List<Produto> lista = new ArrayList<>();

		lista.add(new Produto(1, "TV", 900.00));
		lista.add(new Produto(2, "PC", 50.00));
		lista.add(new Produto(3, "CELULAR", 350.00));
		lista.add(new Produto(4, "NOTBOOK", 3000.00));
		lista.add(new Produto(5, "CARREGADOR", 80.00));

		ProdutoService ps = new ProdutoService();
		
		Predicate<Produto> criterio = p -> p.getPreco() < 350.00;
		
		double soma = ps.filtrarSoma(lista, criterio);
		
		System.out.print("Soma : " + String.format("%.2f", soma));
	}

}
