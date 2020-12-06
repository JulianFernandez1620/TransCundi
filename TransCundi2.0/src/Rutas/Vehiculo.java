package Rutas;

import EstructurasDatos.*;

public class Vehiculo{
	
	private String placa;
	private int asientos;
	private String empresa;
	private IntStack Pilap = new IntStack(100);

	
	public Vehiculo(int as, String pl, String emp) {
		this.placa=pl;
		this.asientos=as;	
		this.empresa=emp;	
		//IntStack Pilap = new IntStack(asientos);
	}
	
	public void Bajar(int b) {
		if(!Pilap.empty()) { 
			
			for(int i=0; i<=b; i++) {
				if(!Pilap.empty())  
					Pilap.pop();
				else
					System.out.println("El vehiculo está vacío");
			}
			System.out.println("El vehiculo con placas "+placa+" de la empresa "+empresa +" tiene: " +(asientos-1-Pilap.peek())+" asientos disponibles");	
		
		}
		else {
			System.out.println("El vehiculo está vacío");
		}
	}
	
	public void Subir(int s) {
		for(int i=0; i<s; i++) {
			if(Pilap.empty())
				Pilap.push(1);
			else
				Pilap.push(Pilap.peek()+1);
			}
		System.out.println("El vehiculo con placas "+placa+" de la empresa "+empresa +" tiene: " +(asientos-Pilap.peek())+" asientos disponibles");		
		}
	
}