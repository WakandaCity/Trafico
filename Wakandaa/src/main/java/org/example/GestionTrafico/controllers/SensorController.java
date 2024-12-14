package GestionTrafico.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sensores")
public class SensorController {

    @PostMapping("/datos")
    public ResponseEntity<String> enviarDatos(@RequestBody SensorDataRequest datos) {
        sensorService.procesarDatos(datos);
        return ResponseEntity.ok("Datos recibidos.");
    }
}
