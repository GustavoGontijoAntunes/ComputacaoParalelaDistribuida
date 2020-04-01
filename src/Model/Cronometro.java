package Model;

import java.text.DecimalFormat;

import View.TelaPrincipal;

public class Cronometro extends Thread {

	int segundos;
	int minutos;
	String time;
	TelaPrincipal tela;
	DecimalFormat decimalFormat;
	String segundosFormatado;
	String minutosFormatado;
	
	public Cronometro() {
		segundos = 0;
		decimalFormat = new DecimalFormat("00");
		tela = TelaPrincipal.getTelaPrincipal();
		this.start();
	}
	
	public void run() {
		while(true)
		{
			if(segundos == 60)
			{
				segundos = 0;
				minutos++;
			}
			
			segundosFormatado = decimalFormat.format(segundos);
			minutosFormatado = decimalFormat.format(minutos);			
			time = minutosFormatado + ":" + segundosFormatado;
			tela.getText_tempo().setText(time);
			
			try 
			{
				this.sleep(1000);
				segundos++;
			} 
			
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}