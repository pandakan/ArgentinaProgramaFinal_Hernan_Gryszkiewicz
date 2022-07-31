
package com.portfolio.AP.Interface;

import com.portfolio.AP.Entity.Persona;
import java.util.List;

public interface IPersonaService {

    public List<Persona> getPersona();
    
    public void save persona(Persona persona);
    
    public void deletePersona(Long id);
    
    public Persona findPersona(Long id);
}
