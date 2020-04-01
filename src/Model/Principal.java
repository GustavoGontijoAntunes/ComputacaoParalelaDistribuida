package Model;

import java.util.ArrayList;

import View.TelaPrincipal;

public class Principal{
	
	private LPHelices helices;
	private LPBaterias baterias;
	private LPFrames frames;
	private LPMotores motores;
	private LPPlacas placas;
	private ArrayList<Componente> listaComponenteHelices;
	private ArrayList<Componente> listaComponenteBaterias;
	private ArrayList<Componente> listaComponenteFrames;
	private ArrayList<Componente> listaComponenteMotores;
	private ArrayList<Componente> listaComponentePlacas;
	private ConstrucaoDrone construcaoDrone;
	
	public Principal() {
		helices = new LPHelices();
		baterias = new LPBaterias();
		frames = new LPFrames();
		motores = new LPMotores();
		placas = new LPPlacas();
		listaComponenteHelices = helices.getEstoque();
		listaComponenteBaterias = baterias.getEstoque();
		listaComponenteFrames = frames.getEstoque();
		listaComponenteMotores = motores.getEstoque();
		listaComponentePlacas = placas.getEstoque();
		construcaoDrone = new ConstrucaoDrone(listaComponenteHelices, listaComponenteBaterias, listaComponenteFrames,
											  listaComponenteMotores, listaComponentePlacas);
		construcaoDrone.start();
		TelaPrincipal.getTelaPrincipal().setVisible(true);
		TelaPrincipal.getTelaPrincipal().startCronometro();
	}
	
	public static void main(String[] args) {
		Principal p = new Principal();
	}
}