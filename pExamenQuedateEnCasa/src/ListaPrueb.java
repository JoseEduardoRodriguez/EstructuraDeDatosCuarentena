//Nombres: Jose Eduardo Rodriguez Cruz y Mauricio Alejandro Salcedo Cordova
public class ListaPrueb {
	 public static void main(String[] args) {

	        ListaEnlazada lista= new ListaEnlazada();
	        System.out.println("Lista: ");
	        System.out.println(lista);

	        lista.AgInicio(new Nodo(null,1));
	        System.out.println("Lista: ");
	        System.out.println(lista);

	        lista.AgInicio(new Nodo(null,2));
	        System.out.println("Lista: ");
	        System.out.println(lista);

	        lista.AgFin(new Nodo(null,10));
	        System.out.println("Lista: ");
	        System.out.println(lista);

	        lista.AgFin(new Nodo(null,20));
	        System.out.println("Lista: ");
	        System.out.println(lista);
	        
	        
	        
	        /////////////////////////////////////////
	        Nodo Busca=new Nodo(null,10);
	        boolean Resp;
	        Resp =lista.buscar(Busca);
	        System.out.println(Resp);

	        lista.DeleteXNodo(Busca);
	        System.out.println(lista);

	        Nodo eliminado =lista.DeleteEnFin();
	        System.out.println(eliminado.Siguiente);
	        
	        
	        
	        
	        /////////////////////////////////////////
	        System.out.println(lista);
	        System.out.println(lista.XIndice(0));
	        for(int j=0; j<lista.SinElementos(); j++){
	            System.out.println(lista.XIndice(j));
	        }
	    }
}
