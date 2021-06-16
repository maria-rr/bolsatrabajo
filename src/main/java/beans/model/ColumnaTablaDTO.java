package beans.model;


public class ColumnaTablaDTO {

    private String propiedad;
    private String encabezado;
    private boolean cambioColor;

    public ColumnaTablaDTO(){
        
    }
    
    public ColumnaTablaDTO(String propiedad, String encabezado, boolean cambioColor) {
        this.propiedad = propiedad;
        this.encabezado = encabezado;
        this.cambioColor = cambioColor;
    }
    
    

    public String getEncabezado() {
        return encabezado;
    }

    public void setEncabezado(String encabezado) {
        this.encabezado = encabezado;
    }

    public String getPropiedad() {
        return propiedad;
    }

    public boolean isCambioColor() {
        return cambioColor;
    }

    public void setCambioColor(boolean cambioColor) {
        this.cambioColor = cambioColor;
    }

    public void setPropiedad(String propiedad) {
        this.propiedad = propiedad;
    }

}
