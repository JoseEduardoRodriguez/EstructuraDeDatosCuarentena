//Nombres: Jose Eduardo Rodriguez Cruz y Mauricio Alejandro Salcedo Cordova
public class Nodo {
	public Nodo Siguiente;
    private int D;

    public Nodo(Nodo Next, int D){
        this.Siguiente = Next;
        this.D = D;
    }

    public int gD() {
        return D;
    }

    public void sD(int Data) {
        this.D = Data;
    }

    public String toString(){
        return "Data: " + D;
    }
}
