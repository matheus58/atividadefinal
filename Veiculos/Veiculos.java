package veiculos;

public class Veiculos {
	private String modelo;
	private double preco;
	
	public Veiculos(String modelo, double preco) {
		this.modelo=modelo;
		this.preco=preco;
	}

		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		public double getPreco() {
			return preco;
		}
		public void setPreco(double preco) {
			this.preco = preco;
		}
		
	public void printDados() {
		System.out.println("---------- Veiculos ------------");
		System.out.println("Modelo: "+getModelo());
		System.out.println("Preco: "+getPreco());
		System.out.println("--------------------------------");
	}
}