import java.util.ArrayList;
import java.util.List;

public class Produto {
    private int codigo;
    private String nome;
    private String descricao;
    private int quantidade;
    private double preco;

    // Construtor
    public Produto(int codigo, String nome, String descricao, int quantidade, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    // Getters e Setters
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // Adicione os outros getters e setters conforme necessário
}
