package farmacia.model;

public abstract class Produto {
	
	
//Atributos de classe
	private int id;
	private int tipo;
	private String nome;
	private float preco;
	
//Método construtor
	
	public Produto(int id, int tipo, String nome, float preco) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.nome = nome;
		this.preco = preco;
	}
	

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public void visualizar() {
		System.out.println("O produto foi criado com sucesso!");
		
		System.out.println("Lista de produtos:\n");
		
		System.out.println("Id do produto:\n");
		
		System.out.println("O produto foi atualizado\n");
		
		System.out.println("O produto foi deletado.\n");
		
		System.out.println("Id do produto: " + this.id);
		System.out.println("Tipo de produto: " + this.tipo);
		System.out.println("Nome do produto: " + this.nome);
		System.out.println("O produto custa(R$): " +this.preco);
		
		
		
		
	}

}
