package eco;

import java.util.Comparator;

public class OrdenaPelaAprovacao implements Comparator<Projeto>{
	
	public int compare(Projeto projeto1, Projeto projeto2) {
		if(projeto1.getAprovacoes() - projeto2.getAprovacoes() != 0)
			return projeto1.getAprovacoes() - projeto2.getAprovacoes();
		
		else {
		
			if(projeto1.getAno() < projeto2.getAno()) {
				return -1;
			}
			
			else if(projeto1.getAno() > projeto2.getAno()) {
				return 1;
			}
			
			else {
				 String[] array = projeto1.getCodigo().split(" ");
				 String[] array2 = projeto2.getCodigo().split(" ");
				 char numero = array[1].charAt(0);
				 char numero2 = array2[1].charAt(0);
				 
				 if(numero < numero2) {
					 return -1;
				 }
				 
				 else if(numero > numero2) {
					 return 1;
				 }
				 
				 else
					 throw new IllegalArgumentException("Nao era para estar lancando esse erro, fale com o tecnico a respeito desse bug");
		
			}
		}
	}
}
