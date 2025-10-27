public class Main {
   public static void main(String[] args) {
       try {
           Produto p1 = new Produto("Teclado", 150.00);
           Produto p2 = new Produto("Mouse", 75.50, 20);


           System.out.println("Produto: " + p1.nome + ", Preço: " + p1.preco + ", Estoque: " + p1.quantidadeEmEstoque);
           System.out.println("Produto: " + p2.nome + ", Preço: " + p2.preco + ", Estoque: " + p2.quantidadeEmEstoque);


           Produto p3 = new Produto("Monitor", 0); // Vai lançar exceção
       } catch (IllegalArgumentException e) {
           System.out.println("Erro na criação do produto: " + e.getMessage());
       }
   }
}
