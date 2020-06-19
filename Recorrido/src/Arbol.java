public class Arbol {
	private Nodo raiz;
	private String Recorrido;
	public Arbol() {
		raiz=null;
		Recorrido="";
	} 
	private void insertDesde(Nodo nod, Nodo Desde) {
		if(Desde.obtenerData()==nod.obtenerData()) {
			return;
		}
		if(nod.obtenerData()> Desde.obtenerData()) {
			if(Desde.Der==null) {
				Desde.Der=nod;
				return;
			}else {
				insertDesde(nod, Desde.Der);
				return;
			}
		}else {
			if(Desde.Izq==null){
				Desde.Izq=nod;
				return;
			}else {
				insertDesde(nod,Desde.Izq);
				return;
			}
		}
	}
	public void insert(Nodo nod) {
		if(raiz==null){
			raiz=nod;
			return;
		}
		insertDesde(nod,raiz);
	}
	public boolean buscar(Nodo noba) {
		return buscarDesde(noba, raiz);
	}
	private boolean buscarDesde(Nodo node, Nodo Desde) {
		if(Desde==null) {
			return false;
		}
		if(Desde.obtenerData()==node.obtenerData()) {
			return true;
		}
		if(node.obtenerData()>Desde.obtenerData()) {
			return buscarDesde(node, Desde.Der);
		}else {
			return buscarDesde(node, Desde.Izq);
		}
	}
	
	public String toStringPreOrder() {
		Recorrido= "";
		PreOrderDesde(raiz);
		return Recorrido;
	}
	private void PreOrderDesde(Nodo Desde) {
		if(Desde==null) {
			return;
		}
		Recorrido=Recorrido+" "+Desde;
		PreOrderDesde(Desde.Izq);
		PreOrderDesde(Desde.Der);	
		}
	public String toStringInOrder() {
		Recorrido= "";
		InOrderDesde(raiz);
		return Recorrido;
	}
	private void InOrderDesde(Nodo Desde) {
		if(Desde==null) {
			return;
		}
		InOrderDesde(Desde.Izq);
		Recorrido=Recorrido+" "+Desde;
		InOrderDesde(Desde.Der);	
		}
	public String toStringPostOrder() {
		Recorrido= "";
		PostOrderDesde(raiz);
		return Recorrido;
	}
	private void PostOrderDesde(Nodo Desde) {
		if(Desde==null) {
			return;
		}
		PostOrderDesde(Desde.Izq);
		PostOrderDesde(Desde.Der);
		Recorrido=Recorrido+" "+Desde;
		}
}
