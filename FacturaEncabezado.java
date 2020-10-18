/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu;

/**
 *
 * @author Mercedes Mendoza
 */
class FacturaEncabezado {
    int serie;
    String nombre;
    String fecha;
    int numero;
    String direccion;
    int nit;
    

    public FacturaEncabezado(int serie, String nombre, String fecha,int numero, String direccion, int nit){
      this.serie = serie; 
      this.nombre = nombre;
      this.fecha = fecha;
      this.numero = numero;
      this.direccion = direccion;
      this.nit = nit;
      
      
      
    }

    FacturaEncabezado(int serie, int numero, String fecha, String nombre, String direccion, int nit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }
            
}


