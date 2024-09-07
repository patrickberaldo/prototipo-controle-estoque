import java.util.ArrayList;
import java.util.List;

// Classe Estoque
public class Estoque {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(int codigo) throws Exception {
        Produto produto = encontrarProduto(codigo);
        if (produto != null) {
            produtos.remove(produto);
        } else {
            throw new Exception("Produto não encontrado");
        }
    }

    public Produto encontrarProduto(int codigo) {
        return produtos.stream().filter(p -> p.getCodigo() == codigo).findFirst().orElse(null);
    }

    public void listarProdutos() {
        produtos.forEach(produto -> System.out.println(produto.getNome() + " - " + produto.getQuantidade()));
    }
}