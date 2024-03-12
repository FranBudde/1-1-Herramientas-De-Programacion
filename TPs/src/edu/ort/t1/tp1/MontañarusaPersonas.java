package edu.ort.t1.tp1;

public class MontañarusaPersonas {
    private String nombre;
    private Float altura;
    private Integer edad;
    
    public MontañarusaPersonas(String nombre, Float altura, Integer edad) {
        this.nombre = nombre;
        this.altura = altura;
        this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }
    public Integer getEdad() {
		return edad;
	}
    
    public Float getAltura() {
    	return altura;
    }
        
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setEdad(Integer edad) {
		this.edad = edad;
	}
    
    public void setAltura(Float aporte) {
        this.altura = aporte;
    }
}
