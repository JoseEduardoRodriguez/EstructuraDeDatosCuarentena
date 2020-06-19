import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class PruebaNodos {
	public static void main (String args [])throws IOException {
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader Teclado = new BufferedReader(r);
		String Tex="";
		String resp = "";
		Nodo Inicial = null;
		Nodo SigNod = null;
		Nodo Actual = null;
		System.out.println("Bienvenido vamos a guardar 10 palabras");
		do{
			System.out.println("Dame una palabra");
			Tex=Teclado.readLine();
			if(Inicial == null) {
				Inicial = new Nodo(null,Tex);
				Actual = Inicial;
			}else {
				SigNod = new Nodo(null, Tex);
				Actual.Siguiente = SigNod;
				Actual = SigNod;
			}
			System.out.println("Deseas continuar? S/N");
			resp = Teclado.readLine();
		}while(resp.compareToIgnoreCase("S")==0);
		Nodo ref = new Nodo(null, Tex);
		ref = Inicial;
		while(ref != null) {
			System.out.println("Valor " + ref);
			ref = ref.Siguiente;
		}
	}
}
