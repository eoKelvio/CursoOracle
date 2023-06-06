 package estoque;

public class Produto {
	//Atributos
	private int idProduto;
	private String nome;
	private double preco;
	private int quantidade;
	private boolean ativo;
	
	public Produto() {
		
	}
	public Produto(int idProduto, String nome, double preco, int quantidade){
		this.idProduto = idProduto;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.ativo = true;
	}
	
	//Métodos getters and setters
	public int getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	public double  inventario() {
		return (this.preco*this.quantidade);	//Cálculo Inventário
	}
	
	//To string
	@Override
	public String toString() {
		return "Número do Item \t\t: " + idProduto + "\n" +
				"Nome \t\t\t: " + nome + "\n"+ 
				"Preço \t\t\t: " + preco + "\n" + 
				"Quantidade em estoque \t: " + quantidade + "\n" +
				"Valor do Estoque \t: " + inventario() + "\n" + 
				"Status do Produto \t: " + (ativo==true? "Ativo": "Descontinuado") + "\n";
	}
    
	
}

