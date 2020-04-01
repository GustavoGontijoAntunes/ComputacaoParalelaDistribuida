package Model;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import View.TelaPrincipal;

public class LinhaDeProducao implements Runnable{
	
	private String nome;
	private int tempoProducao;
	private int estoque;
	private ArrayList<Componente> listaComponentes;
	
	public LinhaDeProducao(String nome, int tempoProducao, int estoque) {
		this.nome = nome;
		this.tempoProducao = tempoProducao;
		this.estoque = estoque;
		listaComponentes = new ArrayList<Componente>();
		new Thread(this).start();
	}

	public void run() {
		
		while(true)
		{
			TelaPrincipal.getTelaPrincipal().getLabelOnOff(nome).
				setIcon(new ImageIcon(TelaPrincipal.class.getResource("/Imagens/Off.png")));
			
			while(listaComponentes.size() < estoque)
			{
				TelaPrincipal.getTelaPrincipal().getLabelOnOff(nome).
					setIcon(new ImageIcon(TelaPrincipal.class.getResource("/Imagens/On.png")));
				
				try 
				{
					Thread.sleep(tempoProducao*1000);
					listaComponentes.add(new Componente(nome));
					TelaPrincipal.getTelaPrincipal().getTextField(nome).setText(""+listaComponentes.size());				
				} 
				
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
		}
	}
	
	public ArrayList<Componente> getEstoque(){
		return this.listaComponentes;
	}
}