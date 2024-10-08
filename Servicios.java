
import java.util.List;

import utils.CSVReader;

/**
 * NO modificar la interfaz de esta clase ni sus métodos públicos.
 * Sólo se podrá adaptar el nombre de la clase "Tarea" según sus decisiones
 * de implementación.
 */
public class Servicios {

	//private componentes donde se van a guardar las tareas y los servicios

	//Una estructura de guardado en memoria y otras de acceso.. (TODAS APUNTAN AL MISMO OBJETO)
	/*
     * Expresar la complejidad temporal del constructor.
     */
	public Servicios(String pathProcesadores, String pathTareas)
	{
		CSVReader reader = new CSVReader();
		reader.readProcessors(pathProcesadores);
		reader.readTasks(pathTareas);
		//reader.readTasks(pathTareas, listTareas, hashTareas, etc); puedo pasarle las 
		//estructuras por párametro donde quiero que vaya almacenando las tareas 
	}
	
	/*
     * Expresar la complejidad temporal del servicio 1.
     */
	public Tarea servicio1(String ID) {
		return null;
	}
    
    /*
     * Expresar la complejidad temporal del servicio 2.
     */
	public List<Tarea> servicio2(boolean esCritica) {
		return null;
	}

    /*
     * Expresar la complejidad temporal del servicio 3.
     */
	public List<Tarea> servicio3(int prioridadInferior, int prioridadSuperior) {
		return null;
	}

}
