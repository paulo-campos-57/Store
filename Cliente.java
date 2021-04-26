public class Cliente {

	private Pessoa pessoaCliente;
	private Compra compraCliente;
	private String dataCadastro;
	private String valorAberto;
	
	public Pessoa getPessoaCliente() {
		return pessoaCliente;
	}
	
	public void setPessoaCliente(Pessoa pessoaCliente) {
		this.pessoaCliente = pessoaCliente;
	}
	
	public Compra getCompraCliente() {
		return compraCliente;
	}
	
	public void setCompraCliente(Compra compraCliente) {
		this.compraCliente = compraCliente;
	}
	
	public String getDataCadastro() {
		return dataCadastro;
	}
	
	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	public String getValorAberto() {
		return valorAberto;
	}
	
	public void setValorAberto(String valorAberto) {
		this.valorAberto = valorAberto;
	}
	
	public String TiraExtrato() {
		return "Extrato tirado com sucesso.";
	}
	
	public String EfetuarPagamento() {
		return "Pagamento efetuado com sucesso.";
	}
}
