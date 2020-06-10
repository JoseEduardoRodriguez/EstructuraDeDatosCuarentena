//Nombres: Jose Eduardo Rodriguez Cruz y Mauricio Alejandro Salcedo Cordova
public class ListaEnlazada {
    private Nodo Inicio;
    private Nodo Fin;
    private int SinElementos;
/////////////////////////////////////////////////////
    
    public ListaEnlazada(){
        Inicio = null;
        Fin = null;
        SinElementos = 0;
    }

////////////////////////////////////////////////////
    public int SinElementos() {
        return SinElementos;
    }

//////////////////////////////////////////////////////
    public void AgInicio(Nodo Ag){
        if(Inicio == null){
            Inicio = Ag;
            Fin = Ag;
            SinElementos++;
        }else {
            Ag.Siguiente = Inicio;
            Inicio = Ag;
            SinElementos++;
        }
    }

///////////////////////////////////////////////////////////
    public void AgFin(Nodo Ag){
        if(Fin == null){
            Fin = Ag;
            Inicio = Ag;
            SinElementos++;
        }else {
            Fin.Siguiente = Ag;
            Fin = Ag;
            SinElementos++;
        }
    }

///////////////////////////////////////////////////////////
    public boolean buscar(Nodo Ab){
        if (Ab != null){
            Nodo ref = Inicio;
            boolean Encontrado = false;
            while ((ref != null) && !Encontrado){
                if(ref.gD() == Ab.gD()){
                    Encontrado = true;
                }
                ref = ref.Siguiente;
            }
            return Encontrado;
        }
        return false;
    }

////////////////////////////////////////////////////////////////
    public Nodo DeleteEnInicio(){
        if(Inicio == null){
            return null;
        }else {
            Nodo Ret = Inicio;
            Inicio = Inicio.Siguiente;
            Ret.Siguiente = null;
            SinElementos--;
            return Ret;
        }
    }

/////////////////////////////////////////////////////////////////////
    public Nodo DeleteEnFin(){
        if(Fin == null){
            return null;
        }else {
            Nodo ref = Inicio;
            boolean Encontrado = false;
            while ((ref != null) && !Encontrado){
                if(ref.Siguiente == Fin){
                    Encontrado = true;
                }
                if(!Encontrado){
                    ref = ref.Siguiente;
                }
            }
            SinElementos--;
            Nodo eliminar = Fin;
            Fin = ref;
            ref.Siguiente = null;
            return eliminar;
        }
    }

////////////////////////////////////////////////////////////////////
    public Nodo DeleteXNodo(Nodo AB){
        if(AB == null){
            return null;
        }
        if(Fin == null){
            return null;
        }else {
            Nodo refRojo = Inicio;
            Nodo refAzul = null;
            Nodo refElim = null;
            boolean Encontrado = false;
            while ((refRojo != null) && !Encontrado){
                if(refRojo.gD() == AB.gD()){
                    Encontrado = true;
                    refElim = refRojo;
                    SinElementos--;
                }
                if(!Encontrado){
                    refAzul = refRojo;
                    refRojo = refRojo.Siguiente;
                }else {
                    refAzul.Siguiente = refRojo.Siguiente;
                    refElim.Siguiente = null;
                }
            }
            return refElim;
        }
    }

//////////////////////////////////////////////////////
    public Nodo XIndice(int p){
        if(Inicio == null){
            return null;
        }
        if (p >= SinElementos){
            return null;
        }
        if (p < 0){
            return null;
        }
        int i = 0;
        Nodo ref = Inicio;
        for (; i< p; i++){
            ref = ref.Siguiente;
        }
        ref = new Nodo(null, ref.gD());
        return ref;
    }
}
