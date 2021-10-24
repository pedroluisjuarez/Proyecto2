
package Simulador;


class Pagmemoria {
    private Integer idProceso;
    private String nombreProceso;
    private Integer idMarco;
    private Integer idPagina;
    private Boolean principal;
    
    public Pagmemoria(int idProceso, String nombreProceso, int idPagina, Boolean principal) {
        this.idProceso = idProceso;
        this.nombreProceso = nombreProceso;
        this.idPagina = idPagina;
        this.principal = principal;    }
    
    public Pagmemoria(int idMarco) {//continuacion proyecto
        this.idMarco = idMarco;
        this.principal = true;
        this.idProceso = null;
        this.nombreProceso = "";
        this.idPagina = null;    }

    public Integer getIdProceso() {
        return idProceso;    }

    public void setIdProceso(Integer idProceso) {
        this.idProceso = idProceso;    }

    public String getNombreProceso() {
        return nombreProceso;    }

    public void setNombreProceso(String nombreProceso) {
        this.nombreProceso = nombreProceso;    }

    public Integer getIdMarco() {
        return idMarco;
    }

    public void setIdMarco(Integer idMarco) {
        this.idMarco = idMarco;    }

    public Integer getIdPagina() {
        return idPagina;    }

    public void setIdPagina(Integer idPagina) {
        this.idPagina = idPagina;    }

    public Boolean getPrincipal() {
        return principal;    }

    public void setPrincipal(Boolean principal) {
        this.principal = principal;    }
    
}
