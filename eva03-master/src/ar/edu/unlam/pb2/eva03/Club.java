package ar.edu.unlam.pb2.eva03;


import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;

import java.util.HashMap;
import java.util.HashSet;
public class Club {


	
		private TipoDeEvento tipoDeEvento;
		private String nombre;
		private Set<Deportista> socios;
		private Map<String, Evento> competencias;
		
		
		public Club(String nombre) {
			this.socios=new HashSet <Deportista>();
			this.competencias = new HashMap <String,Evento>();
			this.nombre=nombre;
			this.tipoDeEvento = tipoDeEvento.CARRERA_5K;
		}

		public Integer getCantidadSocios() {
			return socios.size();
		}
		
		
		public void crearEvento(TipoDeEvento tipo,String nombre) {
			competencias.put(nombre,new Evento());
		}

		
		public void agregarDeportista(Deportista deportista) {
			this.socios.add(deportista);
		}
		
		public Integer inscribirEnEvento(String nombreDelEvento,Deportista depInscribir) throws NoEstaPreparado{
			
			Integer numeroDeInscripcion=0;
			Evento deseado = competencias.get(nombreDelEvento);
			
			
			switch(deseado.getTipo()) {
			case CARRERA_5K:
			case CARRERA_10K:
			case CARRERA_21K:
			case CARRERA_42K:
			numeroDeInscripcion = deseado.agregarParticipante(depInscribir);
			break;
			case DUATLON:
				if(depInscribir instanceof ICiclista) {
					numeroDeInscripcion = deseado.agregarParticipante(depInscribir);
				}else {
					throw new NoEstaPreparado("Error, debe ser ciclista");
				}break;
				
			case CARRERA_NATACION_EN_PICINA:
			case CARRERA_NATACION_EN_AGUAS_ABIERTAS:
				if(depInscribir instanceof INadador) {
					numeroDeInscripcion=deseado.agregarParticipante(depInscribir);
				}else {
					throw new NoEstaPreparado("Error");
				}
			default:
				return 0;
				
			}
			return numeroDeInscripcion;	
		}
		
		
		
		public TipoDeEvento getTipoDeEvento() {
			return tipoDeEvento;
		}

		public void setTipoDeEvento(TipoDeEvento tipoDeEvento) {
			this.tipoDeEvento = tipoDeEvento;
		}

		public String getNombre() {
			return nombre;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		public Set<Deportista> getSocios() {
			return socios;
		}


		public void setSocios(Set<Deportista> socios) {
			this.socios = socios;
		}


		public Map<String, Evento> getCompetencias() {
			return competencias;
		}


		public void setCompetencias(Map<String, Evento> competencias) {
			this.competencias = competencias;
		}

		
		
		
		
		
	}



