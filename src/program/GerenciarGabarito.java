package program;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GerenciarGabarito {

	public static void main(String[] args) {
		String path = "C:\\Users\\adria\\eclipse-workspace\\Projeto-final\\gabarito.txt";
		String output = "C:\\Users\\adria\\eclipse-workspace\\Projeto-final\\resultado.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
			ArrayList<Candidato> candidatos = new ArrayList<>();
			candidatos.add(new Candidato("12134", "bcdadceeaabdeaeaabcdadceeadeaeaabcdaceeeababceabceda"));
			candidatos.add(new Candidato("12131", "cbabcadeacbaeabdeaeaabcdaeeaabdaabdeaeaabcedaaabdeae"));
			candidatos.add(new Candidato("12233", "abdeaeaabcdaeeaabdaabdeaeadeaeaabcdaeeaabdaabdeaeaaa"));
			candidatos.add(new Candidato("13311", "cbabcadeacbaeabdeaeaabcdaeeaabdaabdeaeaabcedaaabdeae"));
			candidatos.add(new Candidato("14411", "eabdeaeaabcdaeeaabdaaeaabcdaeeaaeaeaabcdaeeaabdaabde"));
			
			for(Candidato candidato : candidatos) {
				int cont = 0;
				String resposta = candidato.getGabarito();
				for(int i=0; i < line.length(); i++) {
					if(resposta.charAt(i) == line.charAt(i)) {
						cont++;
					}
				}
				candidato.setCont(cont);
			}
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(output))){
				for (Candidato candidato : candidatos) {
					bw.write(candidato.toString());
					bw.newLine();
				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}	
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
