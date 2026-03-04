public class celular{
    //atributos
    String marca;
    String modelo;
    int bateria = 100;

    //metodo
    /*
    *firma del metodo
    *publico
    *void --> no retoma 
    *el metodo tiene como nombre "llamar"
    *tiene un parametro y es tipo entero 
    */

    public void llamar (String numero){
        System.out.println("llamando al + " numero + ". . . .")
        this.bateria -= 5;
    }
}