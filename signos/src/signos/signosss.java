package signos;
//Importar paquete para trabajar con expresiones regulares
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**********
 * 
 * @author Neococo
 *
 */

public class signosss {
public static void main(String[] args){
	String patron = (" ([0-9]+) | ([-|+]) | ([/|*]) | ([A-Z]+) | ([a-z]+) | ([>|<]) | ([%]) | ([i|a]+)");
	
	//expresion a evaluar
	String Texto = "5662 + 256 * / UNO + arbol < % ii a"; 
	
	Pattern p = Pattern.compile(patron);
	Matcher matcher = p.matcher(Texto);
	
	System.out.println("Compiladores * prueba analsis lexico");
	
	while (matcher.find()) {
		String tokenTipo1 = matcher.group(1);
		if (tokenTipo1 !=null) {
			System.out.println("Numero:  \n"+ tokenTipo1);
		}
		String tokenTipo2 = matcher.group(2);
		if (tokenTipo2 !=null) {
			System.out.println("Suma o resta: \n"+ tokenTipo2);
		}
		String tokenTipo3 = matcher.group(3);
		if (tokenTipo3 !=null) {
			System.out.println("Multiplicacion o Divicion  \n"+ tokenTipo3);
		}
		String tokenTipo4 = matcher.group(4);
		if (tokenTipo4 !=null) {
			System.out.println("Mayusculas:  \n"+ tokenTipo4);
		}
		String tokenTipo5 = matcher.group(5);
		if (tokenTipo5 !=null) {
			System.out.println("Minusculas:  \n"+ tokenTipo5);
		}
		String tokenTipo6 = matcher.group(6);
		if (tokenTipo6 !=null) {
			System.out.println("Mayor o menor:  \n"+ tokenTipo6);
		}
		String tokenTipo7 = matcher.group(7);
		if (tokenTipo7 !=null) {
			System.out.println("Modulo o porcentaje:  \n"+ tokenTipo7);
		}
		String tokenTipo8 = matcher.group(8);
		if (tokenTipo8 !=null) {
			System.out.println("Palabras reservadas:  \n"+ tokenTipo8);
		}
		}
	}
}