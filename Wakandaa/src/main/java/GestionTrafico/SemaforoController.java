package GestionTrafico;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/semaforos")
public class SemaforoController {

    @GetMapping("/{id}")
    public ResponseEntity<Semaforo> obtenerSemaforo(@PathVariable String id) {
        Semaforo semaforo = semaforoService.obtenerSemaforoPorId(id);
        return ResponseEntity.ok(semaforo);
    }

    @PostMapping("/ajustar")
    public ResponseEntity<String> ajustarTiempo(@RequestBody AjusteTiempoRequest request) {
        semaforoService.ajustarTiempo(request);
        return ResponseEntity.ok("Ajuste realizado correctamente.");
    }
}
