//Nombres: Jose Eduardo Rodriguez Cruz y Mauricio Alejandro Salcedo Cordova

//Esta clase define la excepcion de cuando 
//la pila quiere agregar mas elementos
//de los que puede
public class DesbordamientoPila extends Exception {
    public DesbordamientoPila() {
        super("No puedo apilar mas elementos");
    }

}