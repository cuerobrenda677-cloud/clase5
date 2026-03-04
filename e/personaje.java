public class personaje {
    //atributos
    String nombre;
    int nivel;

    //construtor que obliga a dar un nombre al crear el pesonaje 
    public personaje(String nombre){
        this.nombre = nombre;
        this.nivel = 1; // todo empieza en el nivel 1 por defecto

        public void mostrarInfo(){
            System.out.print(" Heroe : " + nombre + "| Nivel : " + nivel);
        }
    }
    
}
