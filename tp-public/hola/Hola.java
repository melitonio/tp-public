/* Programa hola mundo en Java, con argumentos pasados al programa */
public class Hola{
	public static void main(String[] args){
		System.out.println("Hola mundo. Este es mi primer programa de Java");
		if(args.length > 0){
			System.out.println("El primer argumento es: " + args[0]);
		}
	}
}
