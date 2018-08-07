package vehiculos.motorsoft.motorsoft.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vehiculos.motorsoft.motorsoft.infraestructura.Publicador;
import vehiculos.motorsoft.motorsoft.modelo.Vehiculo;

@RestController
public class VehiculoController {

    Publicador publicador = new Publicador();

    @RequestMapping(method = RequestMethod.POST, value="/vehiculo")
    public @ResponseBody ResponseEntity<Vehiculo> crearVehiculo(@RequestBody Vehiculo vehiculo){

        publicador.publicarMensaje("vehiculo.registrado", vehiculo.getMarca(), "Vehiculo recibido " + vehiculo.getIdVehiculo() + " modelo: " + vehiculo.getModelo());
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
