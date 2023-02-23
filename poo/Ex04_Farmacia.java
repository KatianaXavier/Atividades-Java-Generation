package poo;

public abstract class Ex04_Farmacia {

	// primeiro declaramos os atributos, informações genéricas
	private long id;
	private String nome;
	private String nomeComercial;
	private String fabricante;
	private String foto;
	private float preco;
	private int tipo;

	// método construtor (gerado automaticamente pelo source, sem o super). sempre
	// tem o mesmo nome da classe!
	public Ex04_Farmacia(long id, String nome, String nomeComercial, String fabricante, String foto, float preco,
			int tipo) {
		this.id = id;
		this.nome = nome;
		this.nomeComercial = nomeComercial;
		this.fabricante = fabricante;
		this.foto = foto;
		this.preco = preco;
		this.tipo = tipo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	// getters e setters. o get sempre retorna um valor com o mesmo atributo. o set
	// não retorna, só altera
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeComercial() {
		return nomeComercial;
	}

	public void setNomeComercial(String nomeComercial) {
		this.nomeComercial = nomeComercial;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	//método abstrato só pode ser criado em classe abstrata
	public abstract void reajuste(float percentual);
	
	// método visualizar para ver todos os dados do objeto
	public void visualizar() {

		String tipo = "";

		switch (this.tipo) {
		case 1 -> tipo = "Medicamento";
		case 2 -> tipo = "Perfumaria";
		}

		System.out.println("************************");
		System.out.println("    Dados do produto    ");
		System.out.println("************************");
		System.out.println("\nId: " + this.id);
		System.out.println("\nNome: " + this.nome);
		System.out.println("\nNome Comercial: " + this.nomeComercial);
		System.out.println("\nFabricante: " + this.fabricante);
		System.out.println("\nFoto: " + this.foto);
		System.out.println("\nPreço: " + this.preco);
		System.out.println("\nTipo: " + tipo);
	}

}
