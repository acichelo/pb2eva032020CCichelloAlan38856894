package ar.edu.unlam.pb2.eva03;

public class Ciclista extends Deportista{
	
	String TipoDeBicicleta;
	public Ciclista(Integer numeroDeSocio, String nombre,String TipoDeBicicleta) {
		super( numeroDeSocio,  nombre);
		this.TipoDeBicicleta=TipoDeBicicleta;
	}
	public String getTipoDeBicicleta() {
		return TipoDeBicicleta;
	}
	public void setTipoDeBicicleta(String tipoBicicleta) {
		TipoDeBicicleta = tipoBicicleta;
	}


}
