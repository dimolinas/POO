public class semaforo extends Thread{

    private String color;
    private String colorTemporal;

    private void esperar(){
        try {
            sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void mostrarColor(){
        System.out.println(getName() + ": " + getColor());
    }
    private void  cambioAmarillo(){
        colorTemporal = getColor();
        color = "Yellow";
    }
    private void cambioColor(){
        if (colorTemporal =="Green"){
            setColor("Red");
        }
        if (colorTemporal =="Red"){
            setColor("Green");
        }
    }

    public semaforo( String nombre, String color){
        super(nombre);
        setColor(color);
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void run() {
        System.out.println("running: " + getName());
        while (true){
            mostrarColor();
            esperar();
            cambioAmarillo();
            mostrarColor();
            esperar();
            cambioColor();
            mostrarColor();
            esperar();
            cambioAmarillo();
            mostrarColor();
            esperar();
            cambioColor();
        }
    }
}
