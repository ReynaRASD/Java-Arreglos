package arreglos;

public class Arreglos {
	public static void main(String[] args) {
		//Solo un tipo de dato
		//Especifica el tamaño o la cantidad de elementos que va a contener
		
		// Primer manera
		int numeros[];// creas variable
		numeros = new int [4]; // creando el arreglo
		
		// Segunda manera
		String [] nombres = new String [4];
		
		// Tercer manera
		//array literal
		String []nombresFrutas = new String[] {"Manzana", "Pera", "Platano", "Uva", "Mango"};
		
		// Introduciendo datos
		numeros[0]=10;
		numeros[1]=20;
		numeros[2]=30;
		numeros[3]=40;
		
		//System.out.println(numeros[2]);
		//System.out.println(numeros); //Solo imprime direccion en memoria = [I@6504e3b2
		 

		nombres[0]="Reyna";
		nombres[1]="RASD";
		nombres[2]="Solis";
		nombres[3]="Duran";
		
		//System.out.println(nombres[1]);
		
		//length es una propiedad no un metodo, por eso no se usa los parentesis
				//Esto es en los arreglos. 
				//En String si es un metodo.
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Elemento numerico: " + numeros[i]);
			System.out.println("Nombre: " + nombres[i]);
			System.out.println("Fruta: " + nombresFrutas[i]);
			System.out.println("*********************");
		}
		
		
		
		
	}
}
