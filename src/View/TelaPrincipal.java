package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Cronometro;
import Model.Principal;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField text_helice;
	private JTextField text_bateria;
	private JTextField text_frame;
	private JTextField text_motor;
	private JTextField text_placa;
	private JTextField text_drone;
	private JTextField text_caixa;
	private JTextField text_drones_hora;
	private JTextField text_tempo;
	private static TelaPrincipal telaPrincipal = new TelaPrincipal();
	private JLabel on_off_helice;
	private JLabel on_off_bateria;
	private JLabel on_off_frame;
	private JLabel on_off_motor;
	private JLabel on_off_placa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal tela = TelaPrincipal.getTelaPrincipal();
					tela.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaPrincipal() {
		
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 890, 688);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		text_helice = new JTextField();
		text_helice.setText("0");
		text_helice.setBackground(Color.WHITE);
		text_helice.setEditable(false);
		text_helice.setHorizontalAlignment(SwingConstants.CENTER);
		text_helice.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));
		text_helice.setBounds(31, 258, 78, 41);
		contentPane.add(text_helice);
		text_helice.setColumns(10);
		
		text_bateria = new JTextField();
		text_bateria.setText("0");
		text_bateria.setHorizontalAlignment(SwingConstants.CENTER);
		text_bateria.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));
		text_bateria.setEditable(false);
		text_bateria.setColumns(10);
		text_bateria.setBackground(Color.WHITE);
		text_bateria.setBounds(177, 258, 78, 41);
		contentPane.add(text_bateria);
		
		text_frame = new JTextField();
		text_frame.setText("0");
		text_frame.setHorizontalAlignment(SwingConstants.CENTER);
		text_frame.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));
		text_frame.setEditable(false);
		text_frame.setColumns(10);
		text_frame.setBackground(Color.WHITE);
		text_frame.setBounds(330, 258, 78, 41);
		contentPane.add(text_frame);
		
		text_motor = new JTextField();
		text_motor.setText("0");
		text_motor.setHorizontalAlignment(SwingConstants.CENTER);
		text_motor.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));
		text_motor.setEditable(false);
		text_motor.setColumns(10);
		text_motor.setBackground(Color.WHITE);
		text_motor.setBounds(478, 258, 78, 41);
		contentPane.add(text_motor);
		
		text_placa = new JTextField();
		text_placa.setText("0");
		text_placa.setHorizontalAlignment(SwingConstants.CENTER);
		text_placa.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));
		text_placa.setEditable(false);
		text_placa.setColumns(10);
		text_placa.setBackground(Color.WHITE);
		text_placa.setBounds(633, 258, 78, 41);
		contentPane.add(text_placa);
		
		text_drone = new JTextField();
		text_drone.setText("0");
		text_drone.setHorizontalAlignment(SwingConstants.CENTER);
		text_drone.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));
		text_drone.setEditable(false);
		text_drone.setColumns(10);
		text_drone.setBackground(Color.WHITE);
		text_drone.setBounds(776, 258, 78, 41);
		contentPane.add(text_drone);
		
		text_caixa = new JTextField();
		text_caixa.setText("0");
		text_caixa.setHorizontalAlignment(SwingConstants.CENTER);
		text_caixa.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));
		text_caixa.setEditable(false);
		text_caixa.setColumns(10);
		text_caixa.setBackground(Color.WHITE);
		text_caixa.setBounds(721, 599, 78, 41);
		contentPane.add(text_caixa);
		
		text_drones_hora = new JTextField();
		text_drones_hora.setText("0");
		text_drones_hora.setHorizontalAlignment(SwingConstants.CENTER);
		text_drones_hora.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));
		text_drones_hora.setEditable(false);
		text_drones_hora.setColumns(10);
		text_drones_hora.setBackground(Color.WHITE);
		text_drones_hora.setBounds(285, 512, 130, 40);
		contentPane.add(text_drones_hora);
		
		text_tempo = new JTextField();
		text_tempo.setHorizontalAlignment(SwingConstants.CENTER);
		text_tempo.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));
		text_tempo.setEditable(false);
		text_tempo.setColumns(10);
		text_tempo.setBackground(Color.WHITE);
		text_tempo.setBounds(158, 560, 130, 40);
		contentPane.add(text_tempo);
		
		on_off_helice = new JLabel("");
		on_off_helice.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/Imagens/Off.png")));
		on_off_helice.setBounds(31, 315, 83, 43);
		contentPane.add(on_off_helice);
		
		on_off_bateria = new JLabel("");
		on_off_bateria.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/Imagens/Off.png")));
		on_off_bateria.setBounds(177, 315, 83, 43);
		contentPane.add(on_off_bateria);
		
		on_off_frame = new JLabel("");
		on_off_frame.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/Imagens/Off.png")));
		on_off_frame.setBounds(330, 315, 83, 43);
		contentPane.add(on_off_frame);
		
		on_off_motor = new JLabel("");
		on_off_motor.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/Imagens/Off.png")));
		on_off_motor.setBounds(478, 315, 83, 43);
		contentPane.add(on_off_motor);
		
		on_off_placa = new JLabel("");
		on_off_placa.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/Imagens/Off.png")));
		on_off_placa.setBounds(633, 315, 83, 43);
		contentPane.add(on_off_placa);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/Imagens/Start.png")));
		btnNewButton.setBounds(731, 24, 126, 55);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Principal p = new Principal();
				
			}
		});
		
		JLabel fundo = new JLabel("");
		fundo.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/Imagens/Fundo.png")));
		fundo.setBounds(0, 0, 880, 655);
		contentPane.add(fundo);		
	}

	public JTextField getText_helice() {
		return text_helice;
	}

	public JTextField getText_bateria() {
		return text_bateria;
	}

	public JTextField getText_frame() {
		return text_frame;
	}

	public JTextField getText_motor() {
		return text_motor;
	}

	public JTextField getText_placa() {
		return text_placa;
	}

	public JTextField getText_drone() {
		return text_drone;
	}

	public JTextField getText_caixa() {
		return text_caixa;
	}

	public JTextField getText_drones_hora() {
		return text_drones_hora;
	}

	public JTextField getText_tempo() {
		return text_tempo;
	}
	
	public void startCronometro() {
		Cronometro cronometro = new Cronometro();
	}
	
	public JLabel getLabelOnOff(String nome) {
		JLabel label = new JLabel();
		
		if(nome == "Helice") label = on_off_helice;
		else if(nome == "Bateria") label = on_off_bateria;
		else if(nome == "Frame") label = on_off_frame;
		else if(nome == "Motor") label = on_off_motor;
		else if(nome == "Placa") label = on_off_placa;
				
		return label;			
	}
	
	public JTextField getTextField(String nome) {
		JTextField textField = new JTextField();
		
		if(nome == "Helice") textField = text_helice;
		else if(nome == "Bateria") textField = text_bateria;
		else if(nome == "Frame") textField = text_frame;
		else if(nome == "Motor") textField = text_motor;
		else if(nome == "Placa") textField = text_placa;
		else if(nome == "Drone") textField = text_drone;
		else if(nome == "Caixa") textField = text_caixa;
		else if(nome == "DroneHora") textField = text_drones_hora;
				
		return textField;			
	}
	
	public static TelaPrincipal getTelaPrincipal() {
		if(telaPrincipal == null)
			telaPrincipal = new TelaPrincipal();
			
		return telaPrincipal;
	}
}