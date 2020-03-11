package exo4;



public class NumeroTel {

	private final String descriptif;
	private final String numero;
	
	public NumeroTel(final String descriptif, final String numero) {
		this.descriptif=descriptif;
		this.numero=numero;
	}

	public String getDescriptif() {
		return descriptif;
	}

	public String getNumero() {
		return numero;
	}
}