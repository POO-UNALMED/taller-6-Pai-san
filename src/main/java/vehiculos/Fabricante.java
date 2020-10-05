package vehiculos;
import java.util.*;

public class Fabricante {
String nombre;
Pais pais;
Fabricante(String nom,Pais pais){
	this.nombre=nom;
	this.pais=pais;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public Pais getPais() {
	return pais;
}
public void setPais(Pais pais) {
	this.pais = pais;
}

}
