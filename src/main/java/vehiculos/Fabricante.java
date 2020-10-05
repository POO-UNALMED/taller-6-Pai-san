package vehiculos;
import java.util.*;

public class Fabricante {
String nombre;
Pais pais;
public Fabricante(String nom,Pais pais){
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
public static Fabricante fabricaMayorVentas() {
	Fabricante mayorfabricante = null;
	int mayorveces = 0;
	for(int i = 0; i < Vehiculo.Fabricantes.size(); i++) {
		Fabricante fabricante = Vehiculo.Fabricantes.get(i);
		int veces=Collections.frequency(Vehiculo.Fabricantes, Vehiculo.Fabricantes.get(i));
		if(veces > mayorveces) {
			mayorveces = veces;
			mayorfabricante = fabricante;
		}

	}
	return mayorfabricante;
}
	
}

}
