public class Fornecedor {

	private Endereco enderecoFornecedor;
	private Contato contatoFornecedor;
	private String codFornercedor;
	private String razao;
	private String nomeFant;
	private String inscEstadual;
	private String cnpj;
	
	public Endereco getEnderecoFornecedor() {
		return enderecoFornecedor;
	}
	
	public void setEnderecoFornecedor(Endereco enderecoFornecedor) {
		this.enderecoFornecedor = enderecoFornecedor;
	}
	
	public Contato getContatoFornecedor() {
		return contatoFornecedor;
	}
	
	public void setContatoFornecedor(Contato contatoFornecedor) {
		this.contatoFornecedor = contatoFornecedor;
	}
	
	public String getCodFornercedor() {
		return codFornercedor;
	}
	
	public void setCodFornercedor(String codFornercedor) {
		this.codFornercedor = codFornercedor;
	}
	
	public String getRazao() {
		return razao;
	}
	
	public void setRazao(String razao) {
		this.razao = razao;
	}
	
	public String getNomeFant() {
		return nomeFant;
	}
	
	public void setNomeFant(String nomeFant) {
		this.nomeFant = nomeFant;
	}
	
	public String getInscEstadual() {
		return inscEstadual;
	}
	
	public void setInscEstadual(String inscEstadual) {
		this.inscEstadual = inscEstadual;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
