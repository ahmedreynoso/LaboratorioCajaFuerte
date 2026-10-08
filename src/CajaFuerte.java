public class CajaFuerte {
    private long numeroSerie;
    private String modelo;
    private int claveAcceso;
    private boolean estado;
    private byte intentosFallidos;
    private double capacidadMaxima;
    private double saldoActual;


    public CajaFuerte(long numeroSerie, String modelo,
                      int claveAcceso, double capacidadMaxima) {
        this.numeroSerie = numeroSerie;
        this.modelo = modelo;
        this.claveAcceso = claveAcceso;
        this.capacidadMaxima = capacidadMaxima;
        estado = false; // la caja se encuentra cerrada
        intentosFallidos = 0;
        saldoActual = 0.0;
    }
}
