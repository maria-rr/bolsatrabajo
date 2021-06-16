package beans.model;

import java.util.Date;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Named
@RequestScoped
public class Candidato {
    
    private String nombre;
    private String apellido;

    private int salarioDeseado;
    private Date fechaNacimiento;

    private String codigoPostal;
    private int coloniaId;

    
    private String ciudad;
    
    private String comentario;

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    
    public Candidato(){
        System.out.println("Creando objeto Candidato");
        this.setNombre("introduce tu nombre");
    }
    
    
    Logger log = LogManager.getRootLogger();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        System.out.println("Modificando la propiedad de nombre: " + this.nombre);
    }
     public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        
        this.apellido = apellido;
        System.out.println("modificando la propiedad de apellido: "+ this.apellido);
    }

    public int getSalarioDeseado() {
        
        return salarioDeseado;
    }

    public void setSalarioDeseado(int salarioDeseado) {
        System.out.println("modificando la propiedad de apellido: "+ this.salarioDeseado);
        this.salarioDeseado = salarioDeseado;
    }
   
      public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

 public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

   
    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
  
       public int getColoniaId() {
        return coloniaId;
    }

    public void setColoniaId(int coloniaId) {
        this.coloniaId = coloniaId;
    }
    
}
