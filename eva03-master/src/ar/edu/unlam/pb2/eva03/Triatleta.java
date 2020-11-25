package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;


public class Triatleta extends Deportista  {
	
	private TipoDeBicicleta tipoDeBicleta;
	String TipoDeBicicleta;
	String distanciaPreferida;
	public Triatleta(Integer numeroDeSocio,String nombre,String distanciaPreferida, TipoDeBicicleta tipoDeBicleta) {
		super(numeroDeSocio,nombre);
		this.distanciaPreferida=distanciaPreferida;
		this.tipoDeBicleta = tipoDeBicleta.TRIA;
	}
	public TipoDeBicicleta getTipoDeBicleta() {
		return tipoDeBicleta;
	}
	public void setTipoDeBicleta(TipoDeBicicleta tipoDeBicleta) {
		this.tipoDeBicleta = tipoDeBicleta;
	}
	public String getTipoDeBicicleta() {
		return TipoDeBicicleta;
	}
	public void setTipoDeBicicleta(String tipoDeBicicleta) {
		TipoDeBicicleta = tipoDeBicicleta;
	}
	public String getDistanciaPreferida() {
		return distanciaPreferida;
	}
	public void setDistanciaPreferida(String distanciaPreferida) {
		this.distanciaPreferida = distanciaPreferida;
	}


}
