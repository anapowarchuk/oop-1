package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import modelo.Paciente;

public class PacienteDAO {

	public PacienteDAO() {
	
	}
	
	public boolean cadastrarPaciente (Paciente pac) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter ("castro.txt",true);
			bw = new BufferedWriter(fw);
			bw.write(pac.getNome() + "#" + pac.getCpf() + "#" + pac.getEndereco());
			bw.newLine();
			bw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		finally {
			try {
				fw.close();
				bw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return true;
	}
	
	@SuppressWarnings("resource")
	public boolean consultarPaciente(Paciente pa)
	{
		FileReader fr=null;
		BufferedReader br=null;
		try {
			fr = new FileReader("cadastro.txt");
			br= new BufferedReader(fr);
			String linha;
			String[] alinha= new String[3];
			
			while((linha=br.readLine())!=null)
			{
				
				alinha=linha.split("#");
				
				if(alinha[0].equals(pa.getCpf()))
				{
					pa.setCpf(alinha[0]);
					pa.setNome(alinha[1]);
					pa.setEndereco(alinha[2]);
					break;
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		return true;
		
	}
	
}


