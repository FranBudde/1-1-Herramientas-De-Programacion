package edu.ort.t1.tp1;

public class PersonasAporte {
    private String nombre;
    private Float aporte;
    
    public PersonasAporte(String nombre, Float aporte) {
        this.nombre = nombre;
        this.aporte = aporte;
    }
    
    public Float getAporte() {
        return aporte;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setAporte(Float aporte) {
        this.aporte = aporte;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
