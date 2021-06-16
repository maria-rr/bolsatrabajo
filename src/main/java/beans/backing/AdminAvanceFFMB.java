package beans.backing;

import beans.model.AvanceFFTablaDTO;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import beans.model.*;
import java.util.HashMap;

/**
 *
 * @author mouns
 */
@ManagedBean
@ViewScoped
public class AdminAvanceFFMB {
    
    private Short moneda=0;
    private List<TipoMonedaVO> tiposMoneda;
    private AvanceFisicoDTO avanceFisicoDTO;

    public AvanceFisicoDTO getAvanceFisicoDTO() {
        return avanceFisicoDTO;
    }

    public void setAvanceFisicoDTO(AvanceFisicoDTO avanceFisicoDTO) {
        this.avanceFisicoDTO = avanceFisicoDTO;
    }
    
    
    public Short getMoneda() {
        return moneda;
    }

    public void setMoneda(Short moneda) {
        this.moneda = moneda;
    }
    public AdminAvanceFFMB(){
        tiposMoneda = new ArrayList<>();
        //public TipoMonedaVO(Short idTipoMoneda, String nbDescripcion, boolean desactivar) {
        tiposMoneda.add( new TipoMonedaVO((short)0,"Peso",false));
        avanceFisicoDTO = new AvanceFisicoDTO();
    }

    public List<TipoMonedaVO> getTiposMoneda() {
        return tiposMoneda;
    }

    public void setTiposMoneda(List<TipoMonedaVO> tiposMoneda) {
        this.tiposMoneda = tiposMoneda;
    }
    
    //AvanceFFTablaDTO(String valoresAcumulados, Map<String, String> montos, String total)
     public List<AvanceFFTablaDTO> obtenerRegistroAvanceMes(Short idTipoMoneda){
        String[]valores={"Avance físico acumulado","Importe de avance financiero","Porcentaje de avance financiero","Importe acumulado","Porcentaje de avance financiero acumulado"};
        
        List<AvanceFFTablaDTO> list = new ArrayList<>();
        
        for(String val : valores ){
            //val = ka XD
            //mapa montos =  ki
            HashMap<String, String>map = new HashMap<>();
            String meses[] = {"Enero 2021" , "Febrero 2021", "Marzo 2021", "Abril 2021", "Mayo 2021", "Junio 2021", 
            "Julio 2021" , "Agosto 2021" , "Septiembre 2021", "Octubre 2021",  "Noviembre 2021", "Diciembre 2021"};
            for(String mes: meses){
                map.put(mes, "0.0");
            
            }
        
            list.add(new AvanceFFTablaDTO(val, map, "20.0") );
        }
        
         return list;
     }
     
     public boolean visualizaPorTipoMoneda(short tipo){
         return true;
     }
}
