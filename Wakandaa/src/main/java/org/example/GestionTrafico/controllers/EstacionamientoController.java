package GestionTrafico.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estacionamiento")
public class EstacionamientoController {

    @GetMapping("/disponibles")
    public ResponseEntity<List<Estacionamiento>> obtenerDisponibles() {
        List<Estacionamiento> disponibles = estacionamientoService.obtenerEspaciosDisponibles();
        return ResponseEntity.ok(disponibles);
    }
}
