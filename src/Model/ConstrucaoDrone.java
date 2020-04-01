package Model;

import java.text.DecimalFormat;
import java.util.ArrayList;

import View.TelaPrincipal;

public class ConstrucaoDrone extends Thread{

	private ArrayList<Componente> listaComponenteHelices;
	private ArrayList<Componente> listaComponenteBaterias;
	private ArrayList<Componente> listaComponenteFrames;
	private ArrayList<Componente> listaComponenteMotores;
	private ArrayList<Componente> listaComponentePlacas;
	private ArrayList<Drone> listaDrone;	
	private ConstrucaoCaixa construcaoCaixa;
	private long dronesPorHora;

	public ConstrucaoDrone(ArrayList<Componente> listaComponenteHelices, ArrayList<Componente> listaComponenteBaterias,
			ArrayList<Componente> listaComponenteFrames, ArrayList<Componente> listaComponenteMotores,
			ArrayList<Componente> listaComponentePlacas) {
		this.listaComponenteHelices = listaComponenteHelices;
		this.listaComponenteBaterias = listaComponenteBaterias;
		this.listaComponenteFrames = listaComponenteFrames;
		this.listaComponenteMotores = listaComponenteMotores;
		this.listaComponentePlacas = listaComponentePlacas;
		listaDrone = new ArrayList<Drone>();
		construcaoCaixa = new ConstrucaoCaixa(listaDrone);
	}

	public void run() {
		
		long tempoInicial = System.currentTimeMillis();

		while(true) {

			try 
			{
				Thread.sleep(2000);
			} 

			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}


			while(listaComponenteHelices.size() >= 4 && listaComponenteBaterias.size() >= 2 && 
					listaComponenteFrames.size() >= 1 && listaComponenteMotores.size() >= 4 &&
					listaComponentePlacas.size() >= 1) 
			{

				listaComponenteHelices.remove(0);
				listaComponenteHelices.remove(0);
				listaComponenteHelices.remove(0);
				listaComponenteHelices.remove(0);

				listaComponenteBaterias.remove(0);
				listaComponenteBaterias.remove(0);

				listaComponenteFrames.remove(0);

				listaComponenteMotores.remove(0);
				listaComponenteMotores.remove(0);
				listaComponenteMotores.remove(0);
				listaComponenteMotores.remove(0);

				listaComponentePlacas.remove(0);

				listaDrone.add(new Drone());
				TelaPrincipal.getTelaPrincipal().getTextField("Drone").setText(""+listaDrone.size());
				
				long tempoFinal = System.currentTimeMillis();
				long tempoPorDrone = (tempoFinal - tempoInicial)/1000;
				if(tempoPorDrone > 0) {
					this.dronesPorHora = (3600/tempoPorDrone);
				}
				
				DecimalFormat df = new DecimalFormat("0");
				String dronesPorHoraFormatado = df.format(dronesPorHora);
				
				TelaPrincipal.getTelaPrincipal().getTextField("DroneHora").setText(dronesPorHoraFormatado);
				
				tempoInicial = System.currentTimeMillis();
			}
		}
	}
}