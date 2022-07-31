
package com.portfolio.AP.Controller;


import com.portfolio.AP.Entity.Persona;
import com.portfolio.AP,interface.IpersonaService
import java.util.List;

import org.springframework.web.beane.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PersonaController {
   @Autowired IPersonaService ipersonaService;
   
   @getMapping("personas/traer")
   public List<Persona> getPersona() {
       return ipersonaService.getPersona();
   }
   
   
   @PostMapping("/personas/crear")
   public String createPersona(@RequestBody Persona persona){
        ipersonaService.savePersona(persona);
        return "El usuario se creo correctamente";
   
   }
   
   @DeleteMapping("/personas/borrar/(id)")
   public String deletePersona(@PathVariable Long id) {
       ipersonaService.deletePersona(id);
       return "El usuario se elimino correctamente";
   }
   
   @PutMapping("/personas/editar/(id)")
   public Persona editPersona(@PathVariable Long id,
                              @RequestParam("nombre") String nuevoNombre,
                              @RequestParam("apellido") String nuevoApellido,
                              @RequestParam("img") String nuevoimg) {
          Persona persona = ipersonaService.findPersona(id);
          
          persona.setNombre(nuevoNombre);
          persona.setApellido(nuevoApellido);
          persona.setImg(nuevoImg);
          
          ipersonaService.savePersona(persona);
          return persona;
                              }
}