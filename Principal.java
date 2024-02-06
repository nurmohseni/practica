import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Principal{
    public static void main(String[] args){
        System.out.println("Hola Mundo");
        System.out.println("Fecha y hora Actual:"+obtenerFecha());
    }
     public static String obtenerFecha() {
            LocalDateTime actual = LocalDateTime.now();
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            return actual.format(formato);
        }
}
