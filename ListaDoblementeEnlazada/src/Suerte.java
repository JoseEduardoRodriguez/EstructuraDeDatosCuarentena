import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.Random;
public class Suerte {
	 public static void main(String[] args) throws IOException{
	        BufferedReader Teclado = new BufferedReader(new InputStreamReader(System.in));
	        Random Generador = new Random();
	        ListaDoblementeEnlazada L = new ListaDoblementeEnlazada();
	        boolean Moneda=false;
	        boolean PrimerosNumeros=true;
	        int Num=0,NumEl=0;
	        int contador=4;
	        String Resp="";
	        do{
	            System.out.println("Agrega un numero:");
	            Num=Integer.parseInt(Teclado.readLine());
	            L.AgInical(new Nodo<Integer>(Num,1));
	            if(PrimerosNumeros){
	                for(int i=0;i<4;i++){
	                    System.out.println("Agrega un numero:");
	                    Num=Integer.parseInt(Teclado.readLine());
	                    L.AgInical(new Nodo<Integer>(Num,1));
	                
	                }
	                PrimerosNumeros=false;
	            }
	            contador++;
	            System.out.println("Deseas insertar otro numero S / N");
	            Resp=Teclado.readLine(); 
	        }while(Resp.compareToIgnoreCase("S")==0);
	        System.out.println("Numeros:");
	        System.out.println(L.toStringReverse());
	        System.out.println(L);      
	        System.out.println("Procesando......");
	        NumEl = (L.obNoElementos())-1;
	        for(int j=0;j<NumEl;j++){
	            Moneda = Generador.nextBoolean();
	            /*
	                cara = true
	                cruz = false
	            */  
	            if(Moneda==true){
	                Nodo Eliminado =L.DeleteInicial();
	            }
	            if(Moneda==false){
	                Nodo Eliminado =L.DeleteFinal();      
	            }
	        }
	        System.out.println("Se lanzo la moneda "+ contador +" Veces");
	        System.out.println("NUMERO DE LA SUERTE = "+ L);
	    }  
}
