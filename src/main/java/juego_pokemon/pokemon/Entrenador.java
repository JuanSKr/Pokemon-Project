package juego_pokemon.pokemon;


import java.util.LinkedList;

//Hay que implementar la funciones a las clases 
//moverACaja/moverAEquipo/entrenar/capturar/combatir/criar


public class Entrenador {
	// Atributos privados de la clase Entrenador
	protected String nombre;
	protected int dinero;
	protected LinkedList<Pokemon>equipo1;
	protected LinkedList<Pokemon>equipo2;
	protected LinkedList<Pokemon>caja;
	protected LinkedList<Pokemon>mochila;
	
	
	// Constructor de la clase Entrenador
	public Entrenador(String nombre, int dinero) {
		super();
		this.nombre = nombre;
		this.dinero = dinero;
		this.equipo1 = new LinkedList<>();
        this.equipo2 = new LinkedList<>();
        this.caja = new LinkedList<>();
        this.mochila = new LinkedList<>();
	}
	// MÉTODO PARA MOVER UN OBJETO DE LA MOCHILA A LA CAJA
	 public void moverACaja() {}
	 
	// MÉTODO PARA MOVER UN POKEMON DEL EQUIPO1 O EQUIPO2 A LA MOCHILA
	 public void moverAEquipo() {}
	 
	 // MÉTODO PARA ENTRENAR A UN POKEMON DE LA MOCHILA
	 public void entrenar() {}
	 
	 // MÉTODO PARA CAPTURAR UN NUEVO POKEMON Y AÑADIRLO A LA CAJA
	 public void capturar() {}
	 
	 // MÉTODO PARA COMBATIR CON UN POKEMON DEL EQUIPO1 O EQUIPO2
	 public void combatir() {}
	 
	// MÉTODO PARA CRIAR UN HUEVO POKEMON
	 public void criar() {}
	
}
	
	
	
	
	 
	

	

