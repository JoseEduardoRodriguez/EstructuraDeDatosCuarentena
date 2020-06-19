public class Nodo {
	public Nodo Siguiente;
	private String Data;
	public Nodo(Nodo Sig, String Data) {
		this.Siguiente=Sig;
		this.Data=Data;
	}
	public String ObtenerData() {
		return Data;
	}
	public void ColocarData(String Data) {
		this.Data = Data;
	}
	public String toString() {
		return "Data: "+ Data;
	}
}
