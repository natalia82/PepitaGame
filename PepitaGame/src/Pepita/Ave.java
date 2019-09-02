package Pepita;

public class Ave {
	String nombre = " "; 
	int energia;
	
	public Ave (String nombre, int energia) {
		this.nombre = nombre;
		this.energia = energia;
		this.energia = energia;
		
	}
	
	public void come(Comida comida) {
		this.energia += comida.getEnergia(); 
		
	}

	@Override
	public String toString() {
		return "Ave [nombre=" + nombre + ", energia=" + energia + "]";
	}
	
	
}	
	


