package Model;

import java.util.ArrayList;

import View.TelaPrincipal;

public class ConstrucaoCaixa extends Thread{

	private ArrayList<Drone> listaDrone;
	private ArrayList<Caixa> listaCaixa;

	public ConstrucaoCaixa(ArrayList<Drone> listaDrone) {
		this.listaDrone = listaDrone;
		listaCaixa = new ArrayList<Caixa>();
		this.start();
	}
	
	public void run() {
		while(true) 
		{
			try 
			{
				Thread.sleep(500);
			} 

			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			
			while(listaDrone.size() >= 8) 
			{
				for(int i=0 ; i<8 ; i++)
				{
					listaDrone.remove(0);
				}
				
				TelaPrincipal.getTelaPrincipal().getTextField("Drone").setText(""+listaDrone.size());
				listaCaixa.add(new Caixa());
				
				TelaPrincipal.getTelaPrincipal().getTextField("Caixa").setText(""+listaCaixa.size());
			}
		}
	}
}