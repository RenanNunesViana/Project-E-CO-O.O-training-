package eco;

import easyaccept.EasyAccept;

public class ClasseMain {
	
	public static void main(String[] args) {
		args = new String[] {"eco.Facade", "TesteAceitacao/testeProjetoECO1.txt", "TesteAceitacao/testeProjetoECO2.txt",
				"TesteAceitacao/testeProjetoECO3.txt", "TesteAceitacao/testeProjetoECO4.txt"};
		EasyAccept.main(args);
	}
}