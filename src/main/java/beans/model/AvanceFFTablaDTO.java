package beans.model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

public class AvanceFFTablaDTO implements Serializable{

    private static final long serialVersionUID = 1L;

    private String valoresAcumulados;
    private Map<String, String> montos;
    private String total;

    public AvanceFFTablaDTO() {
        montos = new LinkedHashMap<>();
    }

    public AvanceFFTablaDTO(String valoresAcumulados, Map<String, String> montos, String total) {
        this.valoresAcumulados = valoresAcumulados;
        this.montos = montos;
        this.total = total;
    }

    public Map<String, String> getMontos() {
        return montos;
    }

    public void setMontos(Map<String, String> montos) {
        this.montos = montos;
    }

    public AvanceFFTablaDTO(String valoresAcumulados, Map<String, String> montos) {
        this.valoresAcumulados = valoresAcumulados;
        this.montos = montos;
    }

    public String getValoresAcumulados() {
        return valoresAcumulados;
    }

    public void setValoresAcumulados(String valoresAcumulados) {
        this.valoresAcumulados = valoresAcumulados;
    }

    public String getMontos(String descripcionOMes) {
        return montos.get(descripcionOMes);
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}
