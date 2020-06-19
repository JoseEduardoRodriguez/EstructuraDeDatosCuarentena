public class ListaDoblementeEnlazada {
	private Nodo Inicio;
    private Nodo Fin;
    private int SinElementos;
    
    public ListaDoblementeEnlazada(){
        Inicio=null;
        Fin=null;
        SinElementos=0;
    }
    
    public int obNoElementos(){
        return SinElementos;
    }
    
    public void AgInical(Nodo Agregacion){
        if(Inicio == null){
            Inicio=Agregacion;
            Fin=Agregacion;
            SinElementos++;
        } else {
            Agregacion.Siguiente=Inicio;
            Inicio.Anterior=Agregacion;
            Inicio=Agregacion;
            SinElementos++;
        }    
    }
    
    public void AgFinal(Nodo Agregacion){
        if(Fin == null){
            Fin = Agregacion;
            Inicio = Agregacion;
            SinElementos++;
        } else {
            Fin.Siguiente=Agregacion;
            Agregacion.Anterior = Fin;
            Fin=Agregacion;
            SinElementos++;
        }
    }
    
    public boolean Buscar(Nodo Busqueda){
        if(Busqueda != null){
            if(Inicio !=null){
                if(Inicio.obtenerData() == Busqueda.obtenerData()){
                    return true;
                }
            }
            if(Fin !=null){
                if(Inicio.obtenerData() == Busqueda.obtenerData()){
                    return true;
                }
            }
            Nodo Refer = Inicio;
            boolean Encontrado = false;
            while((Refer != null) && !Encontrado){
                if(Refer.obtenerData() == Busqueda.obtenerData()){
                    Encontrado = true;
                }
                Refer = Refer.Siguiente; 
            }
            return Encontrado;
        }
        return false;
    }
    
    public Nodo DeleteInicial(){
        if(Inicio == null){
            return null;
        }else{
            Nodo Ret = Inicio;
            Inicio = Inicio.Siguiente;
            Inicio.Anterior = null;      
            Ret.Siguiente = null;
            Ret.Anterior = null;
            SinElementos--;
            return Ret;
        }        
    }
    
     public Nodo DeleteFinal(){
        if(Fin == null){
            return null;
        }else{       
            Nodo Eliminar = Fin;
            Fin = Fin.Anterior;
            Fin.Siguiente = null;
            Eliminar.Siguiente = null;
            Eliminar.Anterior = null;         
            SinElementos--;
            return Eliminar;
        }
     }
     
     public Nodo DeleteXNodo(Nodo a){
        if(a == null){
           return null; 
        } 
        if(Fin == null){
            return null;
        }else{
            ///////////////////////////
            if(Inicio.obtenerData()== a.obtenerData()){
                return this.DeleteInicial();
            }
            ///////////////////////////
            if(Fin.obtenerData()== a.obtenerData()){
                return this.DeleteFinal();
            }
            ///////////////////////////
            Nodo refRojo = Inicio;
            Nodo refAzul = null;
            Nodo refElim = null;
            boolean Encontrado = false;
            while((refRojo != null)&& !Encontrado){
                if(refRojo.obtenerData() == a.obtenerData()){
                    Encontrado = true; 
                    refElim = refRojo;
                    SinElementos--;
                }
                refRojo = refRojo.Siguiente;
            }
            if(Encontrado){
                refRojo = refElim.Anterior;
                refAzul = refElim.Siguiente;
                refRojo.Siguiente = refAzul;
                refAzul.Anterior = refRojo;
                refElim.Siguiente = null;
                refElim.Anterior = null;  
            }
            return refElim;
        }        
    }
     
    public Nodo XIndice(int p){
        if(Inicio == null){
            return null;
        }
        if(p>= SinElementos){
            return null;
        }
        if(p<0){
            return null;
        }
        int i=0;
        Nodo Refer = Inicio;
        for(;i<p; i++){
            Refer = Refer.Siguiente; 
        }
        switch(Refer.obtenerTipo()){
            case 1:
                Refer = new Nodo<Integer>((int)Refer.obtenerData(),1);
                break;
            case 2:
                Refer = new Nodo<Double>((double)Refer.obtenerData(),2);
                break;
            case 3:
                Refer = new Nodo<String>((String)Refer.obtenerData(),3);
                break;
            case 4:
                Refer = new Nodo<Float>((float)Refer.obtenerData(),4);
                break;
            case 5:
                Refer = new Nodo<Boolean>((boolean)Refer.obtenerData(),5);
                break;
            case 6:
                Refer = new Nodo<Character>((char)Refer.obtenerData(),6);
                break;
            case 7:
                Refer = new Nodo<Short>((short)Refer.obtenerData(),7);
                break;
            case 8:
                Refer = new Nodo<Long>((long)Refer.obtenerData(),8);
                break;
            default:
                break;
        }
        return Refer;
    }
    
    public String toString(){
        String toS = "";
        if(Inicio == null){
            return "";
        }
        Nodo Refer = Inicio;
        while(Refer != null){
            toS = toS + " " +Refer.toString();
            Refer = Refer.Siguiente;
        }
        return toS;
    }
    
    public String toStringReverse(){
        String toSR = "";
        if(Fin == null){
            return "";
        }
        Nodo Refer = Fin;
        while(Refer != null){
            toSR = toSR + " " +Refer.toString();
            Refer = Refer.Anterior;
        }
        return toSR;
    }
}
