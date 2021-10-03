package model;

public class Mesa extends Produto {
	
	private String medidas;
	private float pesoSuportavel;
	private String tipo;
	private String material;
	private float peso;

	
	public Mesa(String medidas, float pesoSuportavel, String tipo, String material, float peso) {
		super();
		this.medidas = medidas;
		this.pesoSuportavel = pesoSuportavel;
		this.tipo = tipo;
		this.material = material;
		this.peso = peso;
	}
	

	public Mesa(String nome, int quantidadeemEstoque, String garantia, String descriacao,
			String Marca, float preco, String id, String medidas, float pesoSuportavel, String tipo, String material, float peso) {
		super();
		this.medidas = medidas;
		this.pesoSuportavel = pesoSuportavel;
		this.tipo = tipo;
		this.material = material;
		this.peso = peso;
	}

	
	public String toString() {
		return "Nome do pruduto: " + getNome() + ", descricao: " + getDescricao() + ", preco: " + getPreco();
	}
	
	
	public String getMedidas() {
		return medidas;
	}

	public void setMedidas(String medidas) {
		this.medidas = medidas;
	}

	public float getPesoSuportavel() {
		return pesoSuportavel;
	}

	public void setPesoSuportavel(float pesoSuportavel) {
		this.pesoSuportavel = pesoSuportavel;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

}
