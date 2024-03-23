package clinica;

public class main {

	public static void main(String[] args) {
		Sistema sistema = new Sistema();
		Medico medico1 = new Medico("Dr. Orvalho", "111-111-111-11", "04/02/1987", "(88)8 8888-8888");
		Medico medico2 = new Medico("Dr. Mestre", "222-222-222-22", "27/07/2003", "(99)9 9999-9999");
		sistema.consultarAgenda(medico1);
		sistema.marcarConsulta(medico1, new Paciente("Doentinho da Silva", "333-333-333-33", "01/01/2001", "4002-8922"));
		sistema.marcarConsulta(medico1, new Paciente("Xanxi", "444-444-444-44", "02/02/2002", "4002-8922"));
		sistema.consultarAgenda(medico1);
		sistema.cancelarConsulta(medico1);
		medico1.realizarConsulta();
		sistema.consultarAgenda(medico1);
		medico1.realizarConsulta();
	}
}
