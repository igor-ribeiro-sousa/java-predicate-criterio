package estudoJavaFuncionalArgumentoPredicate.servico;

import java.util.List;
import java.util.function.Predicate;

import estudoJavaFuncionalArgumentoPredicate.entidade.Produto;

public class ProdutoService {

	public double filtrarSoma(List<Produto> lista, Predicate<Produto> criterio) {
		double soma = 0.0;
		for (Produto p : lista) {
			if (criterio.test(p)) {
				soma += p.getPreco();
			}
		}
		return soma;
	}
}
