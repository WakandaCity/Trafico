package GestionTrafico;

@HystrixCommand(fallbackMethod = "fallbackAjustarTiempo")
public void ajustarTiempo(AjusteTiempoRequest request) {
    // Lógica de ajuste de semáforos
}

public String fallbackAjustarTiempo(AjusteTiempoRequest request) {
    return "No se pudo ajustar el tiempo debido a problemas en el sistema. Intentar más tarde.";
}
