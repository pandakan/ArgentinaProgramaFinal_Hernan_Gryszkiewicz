

package com.portfolio.AP.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.persistence.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size( min = 1, max = 50, message = "no cumple con la longitud requerida")
    private String nombre;
    
    @NotNull
    @Size( min = 1, max = 50, message = "no cumple con la longitud requerida")
    private String apellido;
    
   
    @Size( min = 1, max = 50, message = "no cumple con la longitud requerida")
    private String img;
}
