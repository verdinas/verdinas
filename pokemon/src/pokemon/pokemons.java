package pokemon;



public class pokemons {

	String nombre;
	int numero;
	String tipo1;
	String tipo2;
	boolean legendario;
	int fuerza;
	int defensa;
	int vitalidad;
	int rapidez;
	ataques [] ataque;
	boolean evoluciona;
	
	pokemons(){
		
		this.nombre="";
		this.numero=0;
		this.tipo1="";
		this.tipo2="";
		this.legendario=true;
		this.fuerza=0;
		this.defensa=0;
		this.vitalidad=0;
		this.rapidez=0;
		this.ataque= new ataques[0];
		this.evoluciona=true;
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
