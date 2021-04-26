public class Funcionario {
	
	private Pessoa pessoaFuncionario;
	private Venda vendaFuncionario;
	private String dataAdmissao;
	private String dataRecisao;
	
	public Pessoa getPessoaFuncionario() {
		return pessoaFuncionario;
	}
	
	public void setPessoaFuncionario(Pessoa pessoaFuncionario) {
		this.pessoaFuncionario = pessoaFuncionario;
	}
	
	public Venda getVendaFuncionraio() {
		return vendaFuncionario;
	}
	
	public void setVendaFuncionario(Venda vendaFuncionario) {
		this.vendaFuncionario = vendaFuncionario;
	}
	
	public String getDataAdmissao() {
		return dataAdmissao;
	}
	
	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	
	public String getDataRecisao() {
		return dataRecisao;
	}
	
	public void setDataRecisao(String dataRecisao) {
		this.dataRecisao = dataRecisao;
	}
	
	public String CadastroCliente() {
		return "Cliente cadastrado com sucesso.";
	}
	
	public String ConsultaCliente() {
		return "Consultando cadastro de cliente.";
	}
	
	public String AlteraCliente() {
		return "Cadasdro de cliente alterado com sucesso.";
	}
	
	public String CadastrarFornecedor() {
		return "Fornecedor cadastrado com sucesso.";
	}
	
	public String ConsultarFornecedor() {
		return "Consultando cadastro de fornecedor.";
	}
	
	public String AlterarFornecedor() {
		return "Cadastro de fornecedor alterado com sucesso.";
	}
}
