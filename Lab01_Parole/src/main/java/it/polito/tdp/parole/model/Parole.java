package it.polito.tdp.parole.model;


import java.util.*;

public class Parole {
	//Ci sta meno tempo la LinkedList
	private String parola;
	//private LinkedList<String> listaParole;
	ArrayList<String> listaParole;
	private LinkedList<Double> listaTempi;
	
	public Parole(String parola) {
		this.parola=parola;
		//listaParole=new LinkedList<String>();
		listaTempi=new LinkedList<>();
		listaParole=new ArrayList<String>();
		
		
	}

	public void addParola(String p) {
		listaParole.add(p);
		
		//TODO
	}
	
	public List<String> getElenco() {
		//TODO
		return listaParole;
	}
	
	public void reset() {
		listaParole.clear();
	}
	public void cancella(String s) {
		listaParole.remove(s);
	}
	public void addTempo(double s) {
		listaTempi.add(s);
	}
	@Override
	public String toString() {
		String s="";
		for(String ss:listaParole)
			s=s+ss+"\n";
		return s;
	}
	public String stampaTempi() {
		String s="";
		for (double dd:listaTempi)
			s=s+dd+"\n";
		return s;
	}
	
	
}
