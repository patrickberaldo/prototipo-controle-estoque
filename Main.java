public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        try {
            estoque.removerProduto(123);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
