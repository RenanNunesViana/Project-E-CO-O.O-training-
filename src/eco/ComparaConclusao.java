package eco;

import java.util.Comparator;

public class ComparaConclusao implements Comparator<Projeto>{
	public int compare(Projeto projeto1, Projeto projeto2) {
		if(projeto1.getConclusoes() - projeto2.getConclusoes() != 0)
			return projeto1.getConclusoes() - projeto2.getConclusoes();
		else {
			if(projeto1.getAno() - projeto2.getAno() != 0)
				return projeto1.getAno() - projeto2.getAno();
			
			else {
				String[] array = projeto1.getCodigo().split(" ");
				 String[] array2 = projeto2.getCodigo().split(" ");
				 char numero = array[1].charAt(0);
				 char numero2 = array2[1].charAt(0);
				 
				 return numero - numero2;
			}
				
		}
	}
}