//Nombres: Jose Eduardo Rodriguez Cruz y Mauricio Alejandro Salcedo Cordova
import java.io.*;
public class NodoPrueb {
	public static void main(String[] args) throws IOException{

        Nodo n1 = new Nodo(null,0);
        Nodo n2 = new Nodo(null,1);
        Nodo n3 = new Nodo(null,2);
        
        
        /////////////////////////////////////////////////////

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        
        
        ////////////////////////////////////////////////////
        System.out.println("============================================");
        n1.Siguiente=n2;
        System.out.println(n1.Siguiente);
        n2.Siguiente=n3;
        System.out.println(n2.Siguiente);
        
        
        
        ////////////////////////////////
        System.out.println("============================================");

        System.out.println(n1);
        System.out.println(n1.Siguiente);
        System.out.println(n1.Siguiente.Siguiente);
        
        
        ////////////////////////////////////
        n2=null;
        n3=null;
        System.out.println("=====================================");

        System.out.println(n1);
        System.out.println(n1.Siguiente);
        System.out.println(n1.Siguiente.Siguiente);
        
        
        
        //////////////////////////////////////////
        Nodo ref=n1;

        while(ref != null){
            System.out.println("Valor: "+ref);
            ref=ref.Siguiente;
        }
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader Teclado = new BufferedReader(r);
        Nodo Inicial= null;
        Nodo SiguienteNodo=null;
        Nodo Actual=null;
        int num;
        String resp;
        System.out.println("Bienvenido vamos a guardar numeros enteros ");
        do{
            System.out.println("Dame un numero ");
            num=Integer.parseInt(Teclado.readLine());
            if(Inicial==null){
                Inicial=new Nodo(null,num);
                Actual=Inicial;
            }else{
                SiguienteNodo=new Nodo(null,num);
                Actual.Siguiente=SiguienteNodo;
                Actual=SiguienteNodo;
            }
            System.out.println("Desea agregar otro numero S/N");
            resp=Teclado.readLine();
        }while(resp.compareToIgnoreCase("S")==0);

        ref=Inicial;
        while(ref != null){
            System.out.println("Valor "+ref);
            ref=ref.Siguiente;
        }

    }

}
