
public class Vehiculo {

    private String marca;
    private double precio;
    private String motor;

    public Vehiculo(String marca, double precio, String motor) {
        this.marca = marca;
        this.precio = precio;
        this.motor = motor;
    }

    //marca
    public void setmarca(String marca) {
        this.marca = marca;
    }

    public String getmarca() {
        return this.marca;
    }

    //Precio
    public void setprecio(double precio) {
        this.precio = precio;
    }

    public double getprecio() {
        return this.precio;
    }

    //Motor
    public void setmotor(String motor) {
        this.motor = motor;
    }

    public String getmotor() {
        return this.motor;
    }

    @Override
    public String toString() {
        return "Marca: " + this.marca + "\n"
                + "Precio: " + this.precio + "\n"
                + "Motor: " + this.motor + "\n";
    }
}
