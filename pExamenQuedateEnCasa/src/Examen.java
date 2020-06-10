//Nombres: Jose Eduardo Rodriguez Cruz y Mauricio Alejandro Salcedo Cordova
import java.util.Random;
public class Examen {
	public static void main(String[] args) {
        ////////////////////ACUMULADORES////////////////////
        int M=0;
        int H=0;
        int R=0; 
        ///////////////////MatCraf///////////////////////////
        int madera = 0; 
        int hilo = 0;
        int resina = 0; 
        int bast = 0;
        int cuerd = 0; 
        int can = 0; 

        int Mesa=0;
        int Baston=0;
        int Cuerda=0;
        int Canas=0;
        int Barco=0;
        /////////////////////////////////////
        Random Mat = new Random();
        ////////////////////////////////////
        Pila Madera= new Pila();
        Pila Hilo =new Pila();
        Pila Resina = new Pila();
        ///////////////////////////////////
        for(int i=1;i<=30;i++){
            System.out.println("Dia: "+ i +"");
            try{
                int n = Mat.nextInt(3);
                if(n == 0){
                    System.out.println("Has adquirido 1 unidad de madera");
                    Madera.apilar(n);
                    madera++;
                    M++;
                }else if(n == 1){
                    System.out.println("Has adquirido 1 unidad de hilo");
                    Hilo.apilar(n);
                    hilo++;
                    H++;
                }else if(n == 2){
                    System.out.println("Has adquirido 1 unidad de resina");
                    Resina.apilar(n);
                    resina++;
                    R++;
                }
                
                //////////////////Mesa///////////////////////
                if(madera == 4){
                    Madera.sacar();
                    Madera.sacar();
                    Madera.sacar();
                    Madera.sacar();
                    madera = madera - 4;
                    Mesa++;
                    System.out.println("Construiste: Mesa");
                }
                
                ////////////////Baston//////////////////////
                if(Mesa == 1 && madera == 2){
                    Madera.sacar();
                    Madera.sacar();
                    madera = madera - 2;
                    bast++;
                    Baston++;
                    System.out.println("Construiste: Baston");
                }
                
                //////////////Cuerda////////////////////////
                if(Mesa == 1){
                    if(hilo >= 4 && resina >= 1){
                        Hilo.sacar();
                        Hilo.sacar();
                        Hilo.sacar();
                        Hilo.sacar();

                        hilo = hilo - 4;
                        resina = resina - 1;
                        cuerd++;
                        Cuerda++;
                        System.out.println("Costruiste: Cuerda");
                    }
                }

                //////////////////////Cana/////////////////////////////
                if(Mesa == 1){
                    if(cuerd >=1 && bast >= 1){
                        cuerd = cuerd - 1;
                        bast = bast - 1;
                        can++;
                        Canas++;
                        System.out.println("Construiste: Cana");
                    }
                }
                
                /////////////Barco//////////////////////////////////////
                if (Mesa == 1 && can >= 1)
                {
                    can = can - 1;
                    Barco++;
                    System.out.println("Construiste: Barco");
                }
                
                
            }catch(DesbordamientoPila err){
                System.out.println(err.getMessage());
            } catch (SubDesbordamientoPila er){
                System.out.println(er.getMessage());
            }
        } 
//////////////////////////////////IMPRESIONES//////////////////////////////////////////
        
        System.out.println("============CANTIDAD DE MATERIALES=========================");
        System.out.println("Madera: " + M);
        System.out.println("Resina: " + R);
        System.out.println("Hilo: " + H);
        System.out.println();
        System.out.println("=============CONSTRUISTE====================================");
        System.out.println("Cana: "+Canas);
        System.out.println("Mesa: "+Mesa);
        System.out.println("Baston: "+Baston);
        System.out.println("Cuerda: "+Cuerda);
        System.out.println("Barco: "+Barco);

    }
}
