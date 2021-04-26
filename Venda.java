public class Venda {

	private Produto produtoVenda;
	private String codVenda;
	private String codClienteVenda;
	private String dataVenda;
	private String qtdVenda;
	private double precoVenda;
	private double subtotalVenda;
	private String formaPagamento;
	
	public Produto getProdutoVenda() {
		return produtoVenda;
	}
	
	public void setProdutoVenda(Produto produtoVenda) {
		this.produtoVenda = produtoVenda;
	}
	
	public String getCodVenda() {
		return codVenda;
	}
	
	public void setCodVenda(String codVenda) {
		this.codVenda = codVenda;
	}
	
	public String getCodClienteVenda() {
		return codClienteVenda;
	}
	
	public void setCodClienteVenda(String codClienteVenda) {
		this.codClienteVenda = codClienteVenda;
	}
	
	public String getDataVenda() {
		return dataVenda;
	}
	
	public void setDataVenda(String dataVenda) {
		this.dataVenda = dataVenda;
	}
	
	public String getQtdVenda() {
		return qtdVenda;
	}
	
	public void setQtdVenda(String qtdVenda) {
		this.qtdVenda = qtdVenda;
	}
	
	public double getPrecoVenda() {
		return precoVenda;
	}
	
	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}
	
	public double getSubtotalVenda() {
		return subtotalVenda;
	}
	
	public void setSubtotalVenda(double subtotalVenda) {
		this.subtotalVenda = subtotalVenda;
	}
	
	public String getFormaPagamento() {
		return formaPagamento;
	}
	
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
}
