package CodCadastro;

public class Carrinho {
	
	private Produto compras[];
	private float pre�oTotal;

	
	public Carrinho(Produto[] compras, float pre�oTotal) {
		super();
		this.compras = compras;
		this.pre�oTotal = pre�oTotal;
	}
	

	public Produto[] getCompras() {
		return compras;
	}

	public void setCompras(Produto[] compras) {
		this.compras = compras;
	}

	public float getPre�oTotal() {
		return pre�oTotal;
	}

	public void setPre�oTotal(float pre�oTotal) {
		this.pre�oTotal = pre�oTotal;
	}


}
