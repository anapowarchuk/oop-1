package dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import modelo.Paciente;

public class PacienteDAO {

	private void PacienteDAO() {
		

	}

	public boolean cadastrarPaciente(Paciente p) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("cadastro.txt", true);
			bw = new BufferedWriter(fw);

			bw.write(p.getCpf() + "#" + p.getNome() + "#" + p.getEndereco() + "#" + p.getProfissao());
			bw.newLine();
			bw.flush();

		} catch (IOException e) {
			e.printStackTrace();
			return false;
		} finally {
			try {
				fw.close();
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return true;
	}
}