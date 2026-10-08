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

    public void abrir(int claveIngresada){
        if (intentosFallidos >= 3){
            System.out.println("Caja fuerte bloqueada");
            return;
        }

        if (estado){ // si ya esta abierta manda un mensaje
            System.out.println("La caja fuerte ya esta abierta");
            return;
        }

        if (claveIngresada == claveAcceso){
            estado = true; // la caja ha sido abierta
            intentosFallidos = 0; // se reinician los intentos
            System.out.println("Acceso autorizado");
        } else {
            intentosFallidos++; // suma 1 a intentosFallidos

            // CORRECCIÓN: Se arregló el formato del cálculo matemático
            System.out.println("Clave incorrecta. Intentos restantes: " + (3 - intentosFallidos));

            if (intentosFallidos >= 3) {
                estado = false;
                System.out.println("Caja fuerte bloqueada");
            }
        }
    }

    public void cerrar(){
        if (estado){
            estado = false;
            System.out.println("Se ha cerrado la caja");
        } else {
            System.out.println("La caja ya esta cerrada");
        }
    }
}
