package curso_nelio_java.pdfsjavanlioalves.ExResolvidos;



public class exemplo {

	public static void main(String[] args) {

			String original = "Cícero Régis Oliveira da Cruz";
			
			System.out.println("Meu nome " + original);
			
			String modificada = original.substring(0, 12);
			String m2 = original.replace(" ", "_");
			
			System.out.println("Modificada " + modificada);
			System.out.println("Modificada " + m2);
 
	}
}
