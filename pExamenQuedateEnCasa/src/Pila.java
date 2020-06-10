//Nombres: Jose Eduardo Rodriguez Cruz y Mauricio Alejandro Salcedo Cordova
public class Pila {
	 private ListaEnlazada Esquina;
	    public Pila(){
	        Esquina = new ListaEnlazada();
	    }
	    public void apilar(int x) throws DesbordamientoPila{
	        Esquina.AgInicio(new Nodo(null,x));
	    }
	    public Nodo sacar() throws SubDesbordamientoPila{
	        Nodo esacar = Esquina.DeleteEnInicio();
	        return esacar;
	    }
}
