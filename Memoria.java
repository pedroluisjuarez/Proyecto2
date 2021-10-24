
package Simulador;

import static java.lang.Math.round;
import java.util.Arrays;
import javax.swing.JTextArea;


public class Memoria {
    private int memoriaPrincipalTotal;
    private int memoriaPrincipal;
    private int tamañoPagina;
    private int cantidadMarcos;
    private int marcosDisponibles[];
    private int contadorDisponibles;
    private int cantidadMarcosAlmacenamiento;
    private int maximasPaginas;
    private Pagmemoria memoria[];
    private Pagmemoria almacenamiento[];
    private int marcosDisponiblesAlmacenamiento[];
    private int contadorDisponiblesAlmacenamiento;
    private JTextArea textArea;
    
    public Memoria(int memoriaPrincipalTotal, int memoriaSecundariaTotal, int tamañoPagina, JTextArea textArea) {
        this.textArea = textArea;
        this.memoriaPrincipalTotal = memoriaPrincipalTotal;
                this.tamañoPagina = tamañoPagina;
        this.cantidadMarcos = cantidadMarcos(memoriaPrincipalTotal, tamañoPagina);
        this.cantidadMarcosAlmacenamiento = cantidadMarcosAlmacenamiento(memoriaSecundariaTotal, tamañoPagina);
        this.almacenamiento = new Pagmemoria[cantidadMarcosAlmacenamiento];
        this.memoria = new Pagmemoria[cantidadMarcos];
        this.marcosDisponibles = new int[cantidadMarcos];
        this.marcosDisponiblesAlmacenamiento = new int[cantidadMarcosAlmacenamiento];
        this.memoriaPrincipal = memoriaPrincipalTotal;
        this.maximasPaginas = maximaCapacidadPaginas();
        llenarMarcosDisponibles(cantidadMarcos);
        llenarMDisponiblesAlmacenamiento(cantidadMarcosAlmacenamiento);
        llenarMemoriaVacia();
        llenarAlmacenamientoVacio();
    }
    
    private void llenarMarcosDisponibles(int cantidadMarcos) { //coninuacion de proyecto
        for(int i = 0; i < cantidadMarcos;i++) {
            this.marcosDisponibles[i] = i;
        }
        contadorDisponibles = cantidadMarcos;    }
    
    private void llenarMDisponiblesAlmacenamiento(int cantidadMarcosAlmacenamiento) {
        for(int i = 0; i < cantidadMarcosAlmacenamiento;i++) {
            this.marcosDisponiblesAlmacenamiento[i] = i;
        }
        contadorDisponiblesAlmacenamiento = cantidadMarcosAlmacenamiento;    }
    
    private void llenarMemoriaVacia() {
        for(int i = 0; i < cantidadMarcos;i++) {
            this.memoria[i] = new Pagmemoria(i);
        }    }
    
    private void llenarAlmacenamientoVacio() {
        for(int i = 0; i < cantidadMarcosAlmacenamiento;i++) {
            this.almacenamiento[i] = new Pagmemoria(i);
        }    }    
    private void agregarProcesoMemoria(Proceso proceso, int i) {
        int espacio = obtenerEspacioDisponible();
        contadorDisponibles--;
        proceso.getTablaPagina()[i].setIdMarco(espacio);
        proceso.getTablaPagina()[i].setPrincipal(true);
        this.memoria[espacio] = proceso.getTablaPagina()[i];    }
    
    
    private void agregarProcesoAlmacenamiento(Proceso proceso, int i) {
        int espacio = obtenerEspacioDisponibleAlmacenamiento();
        proceso.getTablaPagina()[i].setIdMarco(espacio);
        proceso.getTablaPagina()[i].setPrincipal(false);
        this.almacenamiento[espacio] = proceso.getTablaPagina()[i];    }
  
    public void agregarProceso(Proceso proceso) {
        int espacio;
        if (contadorDisponibles >= proceso.getCantidadPaginas()) {
            if (proceso.getCantidadPaginas() <= cantidadMarcos) {
                for(int i = 0; i < proceso.getCantidadPaginas(); i++) {
                    agregarProcesoMemoria(proceso, i);
                }
                proceso.setEstado("Activo");
                proceso.setPaginasMemoriaPrincipal(proceso.getCantidadPaginas());
                this.memoriaPrincipal -= proceso.getTamañoTotal(); 
            }
        } else if (contadorDisponibles == 0){
            textArea.append("* ALERTA: Ha ocurrido un error!");
        } else {
            textArea.append("> No hay suficiente espacio en memoria principal.\n");
            proceso.setPaginasMemoriaPrincipal(contadorDisponibles);
            for(int i = 0; i < contadorDisponibles; i++) {
                espacio = obtenerEspacioDisponible();
                proceso.getTablaPagina()[i].setIdMarco(espacio);
                proceso.getTablaPagina()[i].setPrincipal(true);
                memoriaPrincipal -= tamañoPagina;
                this.memoria[espacio] = proceso.getTablaPagina()[i];
            }          
            for(int i = contadorDisponibles;i < proceso.getCantidadPaginas();i++) {
                agregarProcesoAlmacenamiento(proceso, i);
            }
            contadorDisponibles = 0;
            procesoActivoListo(proceso);
            mostrarEspaciosDisponibles();
            mostrarEspaciosDisponiblesAlmacenamiento();
        }    }
    
    private int obtenerEspacioDisponible() {
        int disponible = marcosDisponibles[0];
        for (int i = 0; i < contadorDisponibles-1; i++) {
            marcosDisponibles[i] = marcosDisponibles[i+1];
        }
        return disponible;    }
    
    private void procesoActivoListo(Proceso proceso) {
        if((proceso.getCantidadPaginas() / 2) <= proceso.getPaginasMemoriaPrincipal()) {
            proceso.setEstado("Activo");
        } else {
            proceso.setEstado("Listo");
        }    }
    
    private int obtenerEspacioDisponibleAlmacenamiento() {
        int disponible = marcosDisponiblesAlmacenamiento[0];
        for (int i = 0; i < contadorDisponiblesAlmacenamiento-1; i++) {
            marcosDisponiblesAlmacenamiento[i] = marcosDisponiblesAlmacenamiento[i+1];
        }
        contadorDisponiblesAlmacenamiento--;
        return disponible;    }    
    
    private void mostrarEspaciosDisponibles() {
        System.out.println("______________________/n");
        System.out.println("Memoria:/n");
        System.out.println("Disponibles: "+contadorDisponibles+"/n");
        for (int i = 0; i < marcosDisponibles.length; i++) {
            System.out.println(i+" -> "+marcosDisponibles[i]);
        }    }
    
    private void mostrarEspaciosDisponiblesAlmacenamiento() {
        System.out.println("Almacenamientos:/n");
        System.out.println("Disponibles: "+contadorDisponiblesAlmacenamiento+"/n");
        for (int i = 0; i < marcosDisponiblesAlmacenamiento.length; i++) {
            System.out.println(i+" -> "+marcosDisponiblesAlmacenamiento[i]);
        }    }
    
    private int maximaCapacidadPaginas() {
        return cantidadMarcos + (tamañoPagina);    }
        
    private int cantidadMarcos(int memoriaPrincipalTotal, int tamañoPagina) {
        return round(memoriaPrincipalTotal / tamañoPagina);    }
    
    private int cantidadMarcosAlmacenamiento(int memoriaSecundariaTotal, int tamañoPagina) {
        return round(memoriaSecundariaTotal/tamañoPagina);    }

    public int getTamañoPagina() {
        return tamañoPagina;    }

    public void setTamañoPagina(int tamañoPagina) {
        this.tamañoPagina = tamañoPagina; }

    public int getCantidadMarcos() {
        return cantidadMarcos;  }

    public void setCantidadMarcos(int cantidadMarcos) {
        this.cantidadMarcos = cantidadMarcos; }

    public int[] getMarcosDisponibles() {
        return marcosDisponibles;}

    public void setMarcosDisponibles(int[] marcosDisponibles) {
        this.marcosDisponibles = marcosDisponibles; }

    public Pagmemoria[] getMemoria() {
        return memoria; }

    public void setMemoria(Pagmemoria[] memoria) {
        this.memoria = memoria; }

    public int getContadorDisponibles() {
        return contadorDisponibles; }

    public void setContadorDisponibles(int contadorDisponibles) {
        this.contadorDisponibles = contadorDisponibles;  }

    public int getMaximasPaginas() {
        return maximasPaginas; }

    public void setMaximasPaginas(int maximasPaginas) {
        this.maximasPaginas = maximasPaginas;  }

    public int getMemoriaPrincipalTotal() {
        return memoriaPrincipalTotal;    }

    public void setMemoriaPrincipalTotal(int memoriaPrincipalTotal) {
        this.memoriaPrincipalTotal = memoriaPrincipalTotal;  }

    public int getMemoriaPrincipal() {
        return memoriaPrincipal;   }

    public void setMemoriaPrincipal(int memoriaPrincipal) {
        this.memoriaPrincipal = memoriaPrincipal;    }

    public int getCantidadMarcosAlmacenamiento() {
        return cantidadMarcosAlmacenamiento;    }

    public void setCantidadMarcosAlmacenamiento(int cantidadMarcosAlmacenamiento) {
        this.cantidadMarcosAlmacenamiento = cantidadMarcosAlmacenamiento;    }

    public Pagmemoria[] getAlmacenamiento() {
        return almacenamiento;    }

    public void setAlmacenamiento(Pagmemoria[] almacenamiento) {
        this.almacenamiento = almacenamiento;    }

    public int[] getMarcosDisponiblesAlmacenamiento() {
        return marcosDisponiblesAlmacenamiento;    }

    public void setMarcosDisponiblesAlmacenamiento(int[] marcosDisponiblesAlmacenamiento) {
        this.marcosDisponiblesAlmacenamiento = marcosDisponiblesAlmacenamiento;    }

    public int getContadorDisponiblesAlmacenamiento() {
        return contadorDisponiblesAlmacenamiento;    }

    public void setContadorDisponiblesAlmacenamiento(int contadorDisponiblesAlmacenamiento) {
        this.contadorDisponiblesAlmacenamiento = contadorDisponiblesAlmacenamiento;    }
    
}
