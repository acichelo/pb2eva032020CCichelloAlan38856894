package ar.edu.unlam.pb2.eva03;

public class Corredor extends Deportista {

	Integer CantidadDeKilometrosEntrenados;
	Integer DistanciaPreferida;
	public Corredor(Integer numeroDeSocio, String nombre,  Integer DistanciaPreferida) {
		super(numeroDeSocio,nombre);
		this.DistanciaPreferida=DistanciaPreferida;
	}
	
	public Integer getCantidadDeKilometrosEntrenados() {
		return CantidadDeKilometrosEntrenados;
	}
	public void setCantidadDeKilometrosEntrenados(Integer cantidadDeKilometrosEntrenados) {
		CantidadDeKilometrosEntrenados = cantidadDeKilometrosEntrenados;
	}

	public Integer getDistanciaPreferida() {
		return DistanciaPreferida;
	}

	public void setDistanciaPreferida(Integer distanciaPreferida) {
		DistanciaPreferida = distanciaPreferida;
	}
	
	

}
