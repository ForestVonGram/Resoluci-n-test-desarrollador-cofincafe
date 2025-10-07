public class Cliente {
    private String id;
    private String nombre;
    private Double balance;

    public Cliente(String id, String nombre, Double balance) {
        this.id = id;
        this.nombre = nombre;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", balance=" + balance + '}';
    }
}
