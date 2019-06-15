package eco;

abstract class Projeto{
	private String autor;
	private int ano;
	private String codigo;
	private String ementa;
	private String interesses;
	private String situacaoAtual;
	private String url;
	protected String turno;
	protected String tipo;
	
	public Projeto(String autor, int ano, String codigo, String ementa, String interesses, String url) {
		this.autor = autor;
		this.ano = ano;
		this.codigo = codigo;
		this.ementa = ementa;
		this.interesses = interesses;
		this.situacaoAtual = "EM VOTACAO (CCJC)";
		this.url = url;
	}
	
	public String getAutor() {
		return autor;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getEmenta() {
		return ementa;
	}

	public String getSituacaoAtual() {
		return situacaoAtual;
	}
	
	public String getInteresses() {
		return interesses;
	}
	
	public String getTurno() {
		return this.turno;
	}
	
	public void setTurno(String novoTurno) {
		this.turno = novoTurno;
	}
	
	public String getTipo() {
		return this.tipo;
	}
}
