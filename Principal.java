import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Principal{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Hola Mundo");
        System.out.println("Fecha Actual:"+obtenerFecha());
		System.out.println("Introduce la cantidad de alumnos:");
		int cantidad = teclado.nextInt();
		Usuario[] usuario = pedirUsuarios(cantidad);
		for(int i = 0;i<usuario.length ; i++) {
			System.out.println("Alumno "+(i+1)+"º : "+usuario[i].nombre+", "+usuario[i].apellidos+", "+usuario[i].email);
		}
		teclado.close();
	}
	public static Usuario[] pedirUsuarios(int cantidad) {
		Scanner teclado = new Scanner(System.in);
		Usuario[] usuario = new Usuario[cantidad];
		for(int i = 0; i < cantidad ; i++) {
			usuario[i] = new Usuario();
			System.out.print("Nombre del "+(i+1)+"º Alumno: ");
			String a = teclado.nextLine();
			System.out.print("Apellidos del "+(i+1)+"º Alumno: ");
			String b = teclado.nextLine();
			System.out.print("Correo del "+(i+1)+"º Alumno: ");
			String c = teclado.nextLine();
			usuario[i].setDatos(a, b, c);
		}
		teclado.close();
		return usuario;
    }
     public static String obtenerFecha() {
            LocalDateTime actual = LocalDateTime.now();
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            return actual.format(formato);
        }
}
