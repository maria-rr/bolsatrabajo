package beans.model;

import java.io.Serializable;

/**
 *
 * @author mouns
 */

public class TipoMonedaVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Short idTipoMoneda;
    private String nbDescripcion;
    private boolean desactivar;
    public TipoMonedaVO(){}
    
    

    public Short getIdTipoMoneda() {
        return idTipoMoneda;
    }

    public TipoMonedaVO(Short idTipoMoneda, String nbDescripcion, boolean desactivar) {
        this.idTipoMoneda = idTipoMoneda;
        this.nbDescripcion = nbDescripcion;
        this.desactivar = desactivar;
    }

    public void setIdTipoMoneda(Short idTipoMoneda) {
        this.idTipoMoneda = idTipoMoneda;
    }

    public String getNbDescripcion() {
        return nbDescripcion;
    }

    public void setNbDescripcion(String nbDescripcion) {
        this.nbDescripcion = nbDescripcion;
    }

    public boolean isDesactivar() {
        return desactivar;
    }

    public void setDesactivar(boolean desactivar) {
        this.desactivar = desactivar;
    }
}