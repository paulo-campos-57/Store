public class Loja {
	public static void main(String[] args) {
		//fornecedor
		Endereco endFornecedor = new Endereco();
		endFornecedor.setCep("5530622-15");
		endFornecedor.setEstado("Pernambuco");
		endFornecedor.setCidade("Floresta");
		endFornecedor.setRua("Rua João de Monicéia");
		endFornecedor.setNumero("36");
		endFornecedor.setComplemento("Próximo ao riacho claro");
		
		Contato contFornecedor = new Contato();
		contFornecedor.setTel1("3322-5544");
		contFornecedor.setTel2("3322-5569");
		contFornecedor.setCel1("99343-1967");
		contFornecedor.setCel2("98647-2670");
		contFornecedor.setEmail("entjato@gmail.com");
		
		Fornecedor forn = new Fornecedor();
		forn.setEnderecoFornecedor(endFornecedor);
		forn.setContatoFornecedor(contFornecedor);
		forn.setCodFornercedor("4408");
		forn.setRazao("Fornecer e servir");
		forn.setNomeFant("Entregas a jato LTDA");
		forn.setInscEstadual("34445");
		forn.setCnpj("5556789");
		
		//cliente
		Endereco endCliente = new Endereco();
		endCliente.setCep("5500412-16");
		endCliente.setEstado("Pernambuco");
		endCliente.setCidade("Cajueiro Seco");
		endCliente.setRua("Rua da solidão");
		endCliente.setNumero("104");
		endCliente.setComplemento("Próximo a fabrica de chapeu");
		
		Contato contCliente = new Contato();
		contCliente.setTel1("3356-4934");
		contCliente.setTel2("3356-9435");
		contCliente.setCel1("90013-4579");
		contCliente.setCel2("94588-3454");
		contCliente.setEmail("Abixal87@gmail.com");
		
		Pessoa cliente = new Pessoa();
		cliente.setEndereco(endCliente);
		cliente.setContato(contCliente);
		cliente.setCodigo("33456");
		cliente.setNome("Juracir Abixal");
		cliente.setDataNasc("05/04/1987");
		cliente.setIdentidade("554.235.709-34");
		
		Produto produtoCliente = new Produto();
		produtoCliente.setCodProduto("234.567.888");
		produtoCliente.setNome("Cerâmica");
		produtoCliente.setValor(100);
		
		Compra compra = new Compra();
		compra.setProdutoCompra(produtoCliente);
		compra.setCodCompra("245-665");
		compra.setNotaFiscal("2333455526701");
		compra.setCodProCompra("245-665-334");
		compra.setQtdCompra("20");
		compra.setCodForCompra("245-665-885");
		compra.setDataCompra("04/07/2021");
		
		Cliente comprador = new Cliente();
		comprador.setPessoaCliente(cliente);
		comprador.setCompraCliente(compra);
		comprador.setDataCadastro("03/05/2020");
		comprador.setValorAberto("R$ 115");
		
		//funcionário
		Endereco endFuncionario = new Endereco();
		endFuncionario.setCep("5500435-12");
		endFuncionario.setEstado("Pernambuco");
		endFuncionario.setCidade("Cajueiro Seco");
		endFuncionario.setRua("Rua das palmeiras");
		endFuncionario.setNumero("344");
		endFuncionario.setComplemento("Próximo a rodoviária");
		
		Contato contFuncionario = new Contato();
		contFuncionario.setTel1("3356-7782");
		contFuncionario.setTel2("3356-3354");
		contFuncionario.setCel1("94726-3471");
		contFuncionario.setCel2("83638-0363");
		contFuncionario.setEmail("rrocha1994@gmail.com");
		
		Pessoa funcionario = new Pessoa();
		funcionario.setEndereco(endFuncionario);
		funcionario.setContato(contFuncionario);
		funcionario.setCodigo("22448");
		funcionario.setNome("Rodolfo Rocha");
		funcionario.setDataNasc("23/07/1994");
		funcionario.setIdentidade("435.336.722-56");
		
		Produto produtoFuncionario = new Produto();
		produtoFuncionario.setCodProduto("234.567.888");
		produtoFuncionario.setNome("Cerâmica");
		produtoFuncionario.setValor(100);
		
		Venda venda = new Venda();
		venda.setProdutoVenda(produtoFuncionario);
		venda.setCodVenda("443.567.125");
		venda.setCodClienteVenda("33456-233");
		venda.setDataVenda("04/07/2021");
		venda.setQtdVenda("20");
		venda.setPrecoVenda(115);
		venda.setSubtotalVenda(115);
		venda.setFormaPagamento("Cartão de crédito");
		
		Funcionario vendedor = new Funcionario();
		vendedor.setPessoaFuncionario(funcionario);
		vendedor.setVendaFuncionario(venda);
		vendedor.setDataAdmissao("22/10/2019");
		vendedor.setDataRecisao("22/10/2022");
		
		//imprimindo valores
		System.out.println("Informações do Fornecedor:");
		System.out.println("------------------------Endereço------------------------");
		System.out.println("CEP da sede: " + forn.getEnderecoFornecedor().getCep());
		System.out.println("Estado da sede: " + forn.getEnderecoFornecedor().getEstado());
		System.out.println("Cidade da sede: " + forn.getEnderecoFornecedor().getEstado());
		System.out.println("Rua da sede: " + forn.getEnderecoFornecedor().getRua());
		System.out.println("Número da sede: " + forn.getEnderecoFornecedor().getNumero());
		System.out.println("Complemento: " + forn.getEnderecoFornecedor().getComplemento());
		System.out.println("------------------------Contato------------------------");
		System.out.println("Telefone 1 para contato: " + forn.getContatoFornecedor().getTel1());
		System.out.println("Telefone 2 para contato: " + forn.getContatoFornecedor().getTel2());
		System.out.println("Celular 1 para contato: " + forn.getContatoFornecedor().getCel1());
		System.out.println("Celular 2 para contato: " + forn.getContatoFornecedor().getCel2());
		System.out.println("E-mail para contato: " + forn.getContatoFornecedor().getEmail());
		System.out.println("------------------------Sobre------------------------");
		System.out.println("Código da empresa: " + forn.getCodFornercedor());
		System.out.println("Razão da empresa: " + forn.getRazao());
		System.out.println("Nome fantasia da empresa: " + forn.getNomeFant());
		System.out.println("Inscrição estadual da empresa: " + forn.getInscEstadual());
		System.out.println("CNPJ: " + forn.getCnpj());
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("Informações do Cliente:");
		System.out.println("------------------------Endereço------------------------");
		System.out.println("CEP da residência do cliente: " + comprador.getPessoaCliente().getEndereco().getCep());
		System.out.println("Estado da residência do cliente: " + comprador.getPessoaCliente().getEndereco().getEstado());
		System.out.println("Cidade da residência do cliente: " + comprador.getPessoaCliente().getEndereco().getCidade());
		System.out.println("Rua da residência do cliente: " + comprador.getPessoaCliente().getEndereco().getRua());
		System.out.println("Numéro da residência do cliente: " + comprador.getPessoaCliente().getEndereco().getNumero());
		System.out.println("Complemento da residência do cliente: " + comprador.getPessoaCliente().getEndereco().getComplemento());
		System.out.println("------------------------Contato------------------------");
		System.out.println("Telefone 1 para contato: " + comprador.getPessoaCliente().getContato().getTel1());
		System.out.println("Telefone 2 para contato: " + comprador.getPessoaCliente().getContato().getTel2());
		System.out.println("Celular 1 para contato: " + comprador.getPessoaCliente().getContato().getCel1());
		System.out.println("Celular 2 para contato: " + comprador.getPessoaCliente().getContato().getCel2());
		System.out.println("Email para contato: " + comprador.getPessoaCliente().getContato().getEmail());
		System.out.println("------------------------Compra------------------------");
		System.out.println("Código do produto: " + comprador.getCompraCliente().getProdutoCompra().getCodProduto());
		System.out.println("Nome do produto: " + comprador.getCompraCliente().getProdutoCompra().getNome());
		System.out.println("Valor bruto do produto: " + comprador.getCompraCliente().getProdutoCompra().getValor());
		System.out.println("Código da compra: " + comprador.getCompraCliente().getCodCompra());
		System.out.println("Nota fiscal da compra: " + comprador.getCompraCliente().getNotaFiscal());
		System.out.println("Código Pró compra: " + comprador.getCompraCliente().getCodProCompra());
		System.out.println("Quantidade da compra: " + comprador.getCompraCliente().getQtdCompra());
		System.out.println("Código For compra: " + comprador.getCompraCliente().getCodForCompra());
		System.out.println("Data da compra: " + comprador.getCompraCliente().getDataCompra());
		System.out.println("------------------------Sobre------------------------");
		System.out.println("Data de cadastro do cliente: " + comprador.getDataCadastro());
		System.out.println("Valor aberto pago pelo cliente no produto: " + comprador.getValorAberto());
		System.out.println("------------------------Operações------------------------");
		System.out.println("Tirar extrato:");
		System.out.println(comprador.TiraExtrato());
		System.out.println("Efetuar pagamento: ");
		System.out.println(comprador.EfetuarPagamento());
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("Informações do funcionário:");
		System.out.println("------------------------Endereço------------------------");
		System.out.println("CEP da residência do funcionário: " + vendedor.getPessoaFuncionario().getEndereco().getCep());
		System.out.println("Estado da residência do funcionário: " + vendedor.getPessoaFuncionario().getEndereco().getEstado());
		System.out.println("Cidade da residência do funcionário: " + vendedor.getPessoaFuncionario().getEndereco().getCidade());
		System.out.println("Rua da residência do funcionário: " + vendedor.getPessoaFuncionario().getEndereco().getRua());
		System.out.println("Número da residência do funcionário: " + vendedor.getPessoaFuncionario().getEndereco().getNumero());
		System.out.println("Complemento da residência do funcionário: " + vendedor.getPessoaFuncionario().getEndereco().getComplemento());
		System.out.println("------------------------Contato------------------------");
		System.out.println("Telefone 1 para contato: " + vendedor.getPessoaFuncionario().getContato().getTel1());
		System.out.println("Telefone 2 para contato: " + vendedor.getPessoaFuncionario().getContato().getTel2());
		System.out.println("Celular 1 para contato: " + vendedor.getPessoaFuncionario().getContato().getCel1());
		System.out.println("Celular 2 para contato: " + vendedor.getPessoaFuncionario().getContato().getCel2());
		System.out.println("------------------------Venda------------------------");
		System.out.println("Código do produto: " + vendedor.getVendaFuncionraio().getProdutoVenda().getCodProduto());
		System.out.println("Nome do produto: " + vendedor.getVendaFuncionraio().getProdutoVenda().getNome());
		System.out.println("Valor bruto do produto: " + vendedor.getVendaFuncionraio().getProdutoVenda().getValor());
		System.out.println("Código da venda: " + vendedor.getVendaFuncionraio().getCodVenda());
		System.out.println("Código do cliente da venda: " + vendedor.getVendaFuncionraio().getCodClienteVenda());
		System.out.println("Data da venda: " + vendedor.getVendaFuncionraio().getDataVenda());
		System.out.println("Quantidade da venda: " + vendedor.getVendaFuncionraio().getQtdVenda());
		System.out.println("Preço da venda: " + vendedor.getVendaFuncionraio().getPrecoVenda());
		System.out.println("Subtotal da venda: " + vendedor.getVendaFuncionraio().getSubtotalVenda());
		System.out.println("Forma de pagamento: " + vendedor.getVendaFuncionraio().getFormaPagamento());
		System.out.println("------------------------Sobre------------------------");
		System.out.println("Data de admissão do funcionário: " + vendedor.getDataAdmissao());
		System.out.println("Data de recisão do funcionário: " + vendedor.getDataRecisao());
		System.out.println("------------------------Operações------------------------");
		System.out.println("Cadastrar um novo cliente:");
		System.out.println(vendedor.CadastroCliente());
		System.out.println("Consultar o cadasdtro de um cliente:");
		System.out.println(vendedor.ConsultaCliente());
		System.out.println("Alterar o cadastro de um cliente:");
		System.out.println(vendedor.AlteraCliente());
		System.out.println("Cadastrar um novo fornecedor:");
		System.out.println(vendedor.CadastrarFornecedor());
		System.out.println("Consultar o cadasdtro de um fornecedor:");
		System.out.println(vendedor.ConsultarFornecedor());
		System.out.println("Alterar o cadastro de um fornecedor:");
		System.out.println(vendedor.AlterarFornecedor());
		System.out.println("--------------------------------------------------------------------------------");
	}
}
