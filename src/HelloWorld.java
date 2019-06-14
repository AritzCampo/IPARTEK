import com.ipartek.formacion.Perro;
//import com.ipartek.formacion.Person;
import com.ipartek.formacion.PerroPresa;

public class HelloWorld {

	public static void main(String[] args) throws Exception /*Se lanza la excepcion para q no casque*/{
	
		/*String nombre = "Aritz";
		System.out.println(nombre);
		System.out.println("    Hola Mundo    ");
		System.out.println(nombre + " eres el puto amo");*/
		
		/*Person p1 = new Person();
		int edad = 25;
		p1.setEdad(edad);
		System.out.println(p1.getEdad());*/
		
		Perro perro1 = new Perro();
		Perro perro2 = new Perro();
		Perro perro3 = new Perro("Zain", "boxer", 8, true);
		Perro perro4 = new Perro();
		PerroPresa perro5= new PerroPresa();
		
	    perro1.setNombre("Arin");
	    perro1.setRaza("husky");		
	    perro1.setEdad(4);
	    perro1.setVacunado(true);
	    
	    perro2.setNombre("Beltza");
	    perro2.setRaza("Pastor aleman");		
	    perro2.setEdad(-5);
	    perro2.setVacunado(false);
	    
	    System.out.println(perro1.toString());
	    System.out.println(perro2.toString());
	    System.out.println(perro3.toString());
	    System.out.println(perro4.toString());
	    perro5.atacar(); 
	
	}

}
