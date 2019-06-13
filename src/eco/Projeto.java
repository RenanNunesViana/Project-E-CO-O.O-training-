package eco;

abstract class Projeto{
	private String dni;
	private int ano;
	private String codigo;
	private String ementa;
	private String interessesRelacionados;
	private String situaçãoAtual;
	private String endereçoDoDocumento;
	
	public Projeto(String dni, int ano, String codigo, String ementa, String interessesRelacionados, String endereçoDoDocumento) {
		this.dni = dni;
		this.ano = ano;
		this.codigo = codigo;
		this.ementa = ementa;
		this.interessesRelacionados = interessesRelacionados;
		this.situaçãoAtual = "EM VOTACAO (CCJC)";
		this.endereçoDoDocumento = endereçoDoDocumento;
	}

	public String getAutor() {
		return dni;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getEmenta() {
		return ementa;
	}

	public String getSituaçãoAtual() {
		return situaçãoAtual;
	}
	
	
}
