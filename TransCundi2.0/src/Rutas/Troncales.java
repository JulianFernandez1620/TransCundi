package Rutas;
import EstructurasDatos.*;
public class Troncales {
	int k=0;
	public static String [][] TroncalesM;
	String[] municipios;
	public Troncales(String[] municipios) {
		TroncalesM = new String[16][25];
		this.municipios = municipios;
	}
	/*
	public void insertarMunicipios(String[] a) {
		for(int i = 0; i < a.length; i++) {
			lista.insertarFinal(a[i]);
		}
	}
	public void mostrarLista() {
		while(!lista.isEmpty()) {
			System.out.print(lista.elimiarInicio()+" -> ");
		}
	}
	public void nodoencontrado(String a) {
		lista.buscar(a);	
	}*/
	public void insertarMatriz() {
	for(int i=0;i<TroncalesM.length;i++){
		for(int j=0;j<TroncalesM[i].length;j++) {
			if(k<municipios.length){
				if(!municipios[k].equals("_")){
					TroncalesM[i][j]=municipios[k];
					k++;
				}else {
					break;
				}
			}
			
		}
		k++;
	}
	}
	public String[][] getmatriz(){
		return TroncalesM;
	}
	public int max() {
		return TroncalesM.length;
	}
	public void mostrarMatriz() {
	for(int q=0; q<TroncalesM.length; q++){
		for (int p=0; p<TroncalesM[q].length;p++){
			//if(TroncalesM[q][p]!=null)
				System.out.print(TroncalesM[q][p]+" ");
		}
		System.out.println();
	}
	}
}
