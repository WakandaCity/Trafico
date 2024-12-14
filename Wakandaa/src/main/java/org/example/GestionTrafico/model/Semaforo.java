package GestionTrafico.model;


import jakarta.persistence.*;

@Entity
public class Semaforo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String ubicacion;

    @Column(nullable = false)
    private int tiempoVerde; // En segundos

    @Column(nullable = false)
    private int tiempoRojo; // En segundos

    @Column(nullable = false)
    private int tiempoAmarillo; // En segundos

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getTiempoVerde() {
        return tiempoVerde;
    }

    public void setTiempoVerde(int tiempoVerde) {
        this.tiempoVerde = tiempoVerde;
    }

    public int getTiempoRojo() {
        return tiempoRojo;
    }

    public void setTiempoRojo(int tiempoRojo) {
        this.tiempoRojo = tiempoRojo;
    }

    public int getTiempoAmarillo() {
        return tiempoAmarillo;
    }

    public void setTiempoAmarillo(int tiempoAmarillo) {
        this.tiempoAmarillo = tiempoAmarillo;
    }
}
