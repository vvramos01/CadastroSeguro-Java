public class Produto {
   String nome;
   double preco;
   int quantidadeEmEstoque;


   public Produto(String nome, double preco) {
       if (preco <= 0) {
           throw new IllegalArgumentException("Preço deve ser maior que zero.");
       }
       this.nome = nome;
       this.preco = preco;
       this.quantidadeEmEstoque = 0;
   }


   public Produto(String nome, double preco, int qtd) {
       if (preco <= 0) {
           throw new IllegalArgumentException("Preço deve ser maior que zero.");
       }
       this.nome = nome;
       this.preco = preco;
       this.quantidadeEmEstoque = qtd;
   }
}
