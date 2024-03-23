package clinica;

import java.util.ArrayList;
import java.util.Scanner;

public class Medico extends Pessoa {
	Scanner sc = new Scanner(System.in);
	ArrayList<Paciente> agenda = new ArrayList<Paciente>();
	
	public Medico(String nome, String CPF, String dataNascimento, String telefone) {
		super(nome, CPF, dataNascimento, telefone);
	}
	
	public ArrayList<Paciente> getAgenda() {
		return agenda;
	}
	public void setAgenda(ArrayList<Paciente> agenda) {
		this.agenda = agenda;
	}

	public void realizarConsulta() {
		if (agenda.size() > 0) {
			System.out.println("\nRealizando consulta do paciente: " + agenda.get(0).getNome());
			System.out.println("\nPaciente: " + agenda.get(0).getNome() + "\nExames solicitados: " + solicitarRealizacaoExames() + "\nMedicamentos Preescrevidos: " + preescreverMedicamentos());
			System.out.println("Paciente Liberado!");
			agenda.remove(0);
		}
		else {
			System.out.println("\nNão há mais pacientes!");
		}
		
	}
	
	private String solicitarRealizacaoExames() {
		String text = "0";
		while (true) {
			System.out.println("(1: Sim | 2: Não)\nHá necessidade de solicitar exames?: ");
			text = sc.next();
			switch (text) {
				case "1": {
					System.out.println("Digite os exames solicitados: ");
					text = sc.next();
					return text;
				}
				case "2": {
					return "não";
				}
			}
		}
	}
	
	private String preescreverMedicamentos() {
		String text = "0";
		while (true) {
			System.out.println("\n(1: Sim | 2: Não)\nHá necessidade de preescrever medicamentos?: ");
			text = sc.next();
			switch (text) {
				case "1": {
					System.out.println("Digite os medicamentos: ");
					text = sc.next();
					return text;
				}
				case "2": {
					return "não";
				}
			}
		}
	}
}
