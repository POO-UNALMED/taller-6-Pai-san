package vehiculos;
import java.util.*;

public class Pais {
private String nombre;
Pais(String nom){
	this.nombre=nom;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public static Pais paisMasVendedor() {
	Pais mayorpais = null;
	int mayorveces = 0;
	for(int i = 0; i < Vehiculo.Paises.size(); i++) {
		Pais pais = Vehiculo.Paises.get(i);
		int veces=Collections.frequency(Vehiculo.Paises, Vehiculo.Paises.get(i));
		if(veces > mayorveces) {
			mayorveces = veces;
			mayorpais = pais;
		}

	}
	return mayorpais;
}
	
}

