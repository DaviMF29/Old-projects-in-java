package clinica;

import java.util.Scanner;

public class Sistema {
	
	public void marcarConsulta(Medico medico, Paciente paciente) {
		if (medico.getAgenda().size() >= 5) {
			System.out.println("\nA agenda do doutor " + medico.getNome() + " está cheia");
		}
		else {
			medico.getAgenda().add(paciente);
		}
	}
	
	public void cancelarConsulta(Medico medico) {
		Scanner sc = new Scanner(System.in);
		int numeroPaciente = 0;
		if (medico.getAgenda().size() > 0) {
			for (int i = 0; i < medico.getAgenda().size(); i++) {
				System.out.println(i+1 + " - " + medico.getAgenda().get(i));
			}
			while (true) {
				System.out.println("\nDigite o número do paciente que terá a consulta cancelada");
				numeroPaciente = sc.nextInt();
				if (numeroPaciente > 0 && numeroPaciente <= medico.getAgenda().size()) {
					break;
				}
			}
			medico.getAgenda().remove(numeroPaciente-1);
		}
	}
	
	public void consultarAgenda(Medico medico) {
		if (medico.getAgenda().size() == 0) {
			System.out.println("A agenda do médico está vazia!");
		}
		else {
			System.out.println("\nMedico: " + medico.getNome());
			System.out.println("Pacientes:");
			for (int i = 0; i < medico.getAgenda().size(); i++) {
				System.out.println(medico.getAgenda().get(i));
			}
			System.out.println();
		}
	}
}
