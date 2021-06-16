package beans.model;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class AvanceFisicoDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    
    private Long idContrato;
    private String dependencia;
    private String unidadEjec;
    private String numContrato;
    private String fechaInicContrac;
    private String fechaFinContrac;
    private String nombreContratista;
    private String primerApellido;
    private String segundoApellido;
    private String razonSoc;
    private boolean contratistaPersonaMoral;
    private String objetoContrato;
    private double montoContratadoMXN;
    private double montoContratadoUSD;
    private double montoContratadoEUR;
    private double anticipoMXN;
    private double anticipoUSD;
    private double anticipoEUR;
    private String numComvenio;
    private String tipoConvenio;
    private String fechaFinConvenio;
    
    private String fechaRegFiniquito;
    private String montoFiniquito;
    private List<AvanceFFTablaDTO> avanceFFPorMesListMXN;
    private List<AvanceFFTablaDTO> avanceFFPorMesListUSD;
    private List<AvanceFFTablaDTO> avanceFFPorMesListEUR;
    private transient List<ColumnaTablaDTO> columnaTablaDTOs;
    private Map<Short, Set<Short>> anioMeses;
    private boolean situacionEspecial;
    private short tipoSituacion;

    public AvanceFisicoDTO() {
        //public ColumnaTablaDTO(String propiedad, String encabezado, boolean cambioColor) {
        columnaTablaDTOs = new ArrayList<>();
        String meses[] = {"Enero 2021" , "Febrero 2021", "Marzo 2021", "Abril 2021", "Mayo 2021", "Junio 2021", 
            "Julio 2021" , "Agosto 2021" , "Septiembre 2021", "Octubre 2021",  "Noviembre 2021", "Diciembre 2021"};
        for(String mes: meses){
            //mes = ke
            columnaTablaDTOs.add (new ColumnaTablaDTO(null,mes,false));
            
        }
        
        
    }

    

    public Long getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(Long idContrato) {
        this.idContrato = idContrato;
    }

    public Map<Short, Set<Short>> getAnioMeses() {
        return anioMeses;
    }

    public void setAnioMeses(Map<Short, Set<Short>> anioMeses) {
        this.anioMeses = anioMeses;
    }

    public short getTipoSituacion() {
        return tipoSituacion;
    }

    public void setTipoSituacion(short tipoSituacion) {
        this.tipoSituacion = tipoSituacion;
    }

    public boolean isSituacionEspecial() {
        return situacionEspecial;
    }

    public void setSituacionEspecial(boolean situacionEspecial) {
        this.situacionEspecial = situacionEspecial;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public String getUnidadEjec() {
        return unidadEjec;
    }

    public void setUnidadEjec(String unidadEjec) {
        this.unidadEjec = unidadEjec;
    }

    public String getNumContrato() {
        return numContrato;
    }

    public void setNumContrato(String numContrato) {
        this.numContrato = numContrato;
    }

    public String getFechaInicContrac() {
        return fechaInicContrac;
    }

    public void setFechaInicContrac(String fechaInicContrac) {
        this.fechaInicContrac = fechaInicContrac;
    }

    public String getFechaFinContrac() {
        return fechaFinContrac;
    }

    public void setFechaFinContrac(String fechaFinContrac) {
        this.fechaFinContrac = fechaFinContrac;
    }

    public String getNombreContratista() {
        return nombreContratista;
    }

    public void setNombreContratista(String nombreContratista) {
        this.nombreContratista = nombreContratista;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getRazonSoc() {
        return razonSoc;
    }

    public void setRazonSoc(String razonSoc) {
        this.razonSoc = razonSoc;
    }

    public boolean isContratistaPersonaMoral() {
        return contratistaPersonaMoral;
    }

    public void setContratistaPersonaMoral(boolean contratistaPersonaMoral) {
        this.contratistaPersonaMoral = contratistaPersonaMoral;
    }

    public List<ColumnaTablaDTO> getColumnaTablaDTOs() {
        return columnaTablaDTOs;
    }


    public void setColumnaTablaDTOs(List<ColumnaTablaDTO> columnaTablaDTOs) {
        this.columnaTablaDTOs = columnaTablaDTOs;
    }

    public List<AvanceFFTablaDTO> getAvanceFFPorMesListMXN() {
        return avanceFFPorMesListMXN;
    }

    public void setAvanceFFPorMesListMXN(List<AvanceFFTablaDTO> avanceFFPorMesListMXN) {
        this.avanceFFPorMesListMXN = avanceFFPorMesListMXN;
    }

    public List<AvanceFFTablaDTO> getAvanceFFPorMesListUSD() {
        return avanceFFPorMesListUSD;
    }

    public void setAvanceFFPorMesListUSD(List<AvanceFFTablaDTO> avanceFFPorMesListUSD) {
        this.avanceFFPorMesListUSD = avanceFFPorMesListUSD;
    }

    public List<AvanceFFTablaDTO> getAvanceFFPorMesListEUR() {
        return avanceFFPorMesListEUR;
    }

    public void setAvanceFFPorMesListEUR(List<AvanceFFTablaDTO> avanceFFPorMesListEUR) {
        this.avanceFFPorMesListEUR = avanceFFPorMesListEUR;
    }

    public String getObjetoContrato() {
        return objetoContrato;
    }

    public void setObjetoContrato(String objetoContrato) {
        this.objetoContrato = objetoContrato;
    }

    public double getMontoContratadoMXN() {
        return montoContratadoMXN;
    }

    
    public void setMontoContratadoMXN(double montoContratadoMXN) {
        this.montoContratadoMXN = montoContratadoMXN;
    }

    public double getMontoContratadoUSD() {
        return montoContratadoUSD;
    }

   
    public void setMontoContratadoUSD(double montoContratadoUSD) {
        this.montoContratadoUSD = montoContratadoUSD;
    }

    public double getMontoContratadoEUR() {
        return montoContratadoEUR;
    }

   
    public void setMontoContratadoEUR(double montoContratadoEUR) {
        this.montoContratadoEUR = montoContratadoEUR;
    }

   
    public BigDecimal getAnticipoBigDecimalMXN() {
        return BigDecimal.valueOf(anticipoMXN);
    }

    public void setAnticipoMXN(double anticipoMXN) {
        this.anticipoMXN = anticipoMXN;
    }

    
    public BigDecimal getAnticipoBigDecimalUSD() {
        return BigDecimal.valueOf(anticipoUSD);
    }

    public void setAnticipoUSD(double anticipoUSD) {
        this.anticipoUSD = anticipoUSD;
    }

    
    public BigDecimal getAnticipoBigDecimalEUR() {
        return BigDecimal.valueOf(anticipoEUR);
    }

    public void setAnticipoEUR(double anticipoEUR) {
        this.anticipoEUR = anticipoEUR;
    }

    public String getNumComvenio() {
        return numComvenio;
    }

    public void setNumComvenio(String numComvenio) {
        this.numComvenio = numComvenio;
    }

    public String getTipoConvenio() {
        return tipoConvenio;
    }

    public void setTipoConvenio(String tipoConvenio) {
        this.tipoConvenio = tipoConvenio;
    }

    public String getFechaFinConvenio() {
        return fechaFinConvenio;
    }

    public void setFechaFinConvenio(String fechaFinConvenio) {
        this.fechaFinConvenio = fechaFinConvenio;
    }

  
    

    public String getFechaRegFiniquito() {
        return fechaRegFiniquito;
    }

    public void setFechaRegFiniquito(String fechaRegFiniquito) {
        this.fechaRegFiniquito = fechaRegFiniquito;
    }

    public String getMontoFiniquito() {
        return montoFiniquito;
    }

    public void setMontoFiniquito(String montoFiniquito) {
        this.montoFiniquito = montoFiniquito;
    }
}
