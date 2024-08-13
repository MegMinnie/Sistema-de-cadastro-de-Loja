import java.util.ArrayList;
import java.util.Scanner;

public class Venda {
  private String idVenda;
  private int dataVenda;
  private float precoVenda;
  private float desconto;
  private float precoTotal;

  public String getIdVenda() {
    return idVenda;
  }

  public void setIdVenda(String idVenda) {
    this.idVenda = idVenda;
  }

  public int getDataVenda() {
    return dataVenda;
  }

  public void setDataVenda(int dataVenda) {
    this.dataVenda = dataVenda;
  }

  public float getPrecoVenda() {
    return precoVenda;
  }

  public void setPrecoVenda(float precoVenda) {
    this.precoVenda = precoVenda;
  }

  public float getDesconto() {
    return desconto;
  }

  public void setDesconto(float desconto) {
    this.desconto = desconto;
  }

  public float getPrecoTotal() {
    return precoTotal;
  }

  public void setPrecoTotal(float precoTotal) {
    this.precoTotal = precoTotal;
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    ArrayList<Usuario> funcionarios = new ArrayList<>();
    ArrayList<Cliente> pessoas = new ArrayList<>();
    ArrayList<ItensVendidos> itensLojas = new ArrayList<>();
    ArrayList<Cotem> informacoes = new ArrayList<>();
    ArrayList<Peca> produtos = new ArrayList<>();
    ArrayList<Estoque> quantidades = new ArrayList<>();
    ArrayList<Venda> Compras = new ArrayList<>();
    int opcao;
    Scanner entrada = new Scanner(System.in);

    do {
      System.out.println("1 - Cadastrar Usuário");
      System.out.println("2 - Cadastrar cliente");
      System.out.println("3 - Cadastrar itens vendidos");
      System.out.println("4 - Cadastrar cotem");
      System.out.println("5 - Cadastrar Peças");
      System.out.println("6 - Cadastrar itens no estoque");
      System.out.println("7 - Cadastrar Vendas");
      System.out.println("8 - Sair");
      System.out.print("Opção: ");
      
      opcao = entrada.nextInt();
      
      switch(opcao){
        case 1:
          Usuario funcionario = new Usuario();
          System.out.println("Cadastrar Usuários");
          System.out.print("Digite o login: ");
          funcionario.setLogin(entrada.next());
          System.out.print("Informe sua senha de funcionario: ");
          funcionario.setSenha(entrada.next());
          System.out.print("Informe seu cargo: ");
          funcionario.setCargo(entrada.next());
          System.out.print("Informe seu nível de acesso: ");
          funcionario.setNivelAcesso(entrada.nextInt());
          funcionarios.add(funcionario);

          System.out.println("Login: " + funcionario.getLogin());
          System.out.println("Senha: " + funcionario.getSenha());
          System.out.println("Cargo: " + funcionario.getCargo());
          System.out.println("Nível de acesso: " + funcionario.getNivelAcesso());

          break;
        case 2:
          Cliente cliente = new Cliente();
          System.out.println("Cadastrar os clientes");
          System.out.print("Informe o nome do cliente: ");
          cliente.setNome(entrada.next());
          System.out.print("Informe o apelido: ");
          cliente.setApelido(entrada.next());
          System.out.print("Informe o sexo do cliente: ");
          cliente.setSexo(entrada.next());
          System.out.print("Informe o CPF do cliente: ");
          cliente.setCpf(entrada.next());
          System.out.print("Informe o RG do cliente: ");
          cliente.setRg(entrada.next());
          System.out.print("Informe a data de nascimento: ");
          cliente.setDatasNascimento(entrada.next());
          pessoas.add(cliente);

          System.out.println("Nome: " + cliente.getNome());
          System.out.println("Apelido: " + cliente.getApelido());
          System.out.println("Sexo: " + cliente.getSexo());
          System.out.println("CPF: " + cliente.getCpf());
          System.out.println("RG: " + cliente.getRg());
          System.out.println("Data de nascimento" + cliente.getDatasNascimento());

          break;
        case 3:
          ItensVendidos ItensLoja = new ItensVendidos();
          System.out.println("Cadastrar os itens vendidos");
          System.out.print("Informe ID do item: ");
          ItensLoja.setIdItemVendido(entrada.nextInt());
          itensLojas.add(ItensLoja);

          System.out.println("ID: " + ItensLoja.getIdItemVendido());

          break;
        case 4:
          Cotem Informacoes = new Cotem();
          System.out.println("Cadastrar os itens de cotém no estoque");
          System.out.print("Informe a quantidade do produto no estoque: ");
          Informacoes.setQtd(entrada.nextInt());
          System.out.print("Informe o preço do produto: ");
          Informacoes.setPrecoVenda(entrada.nextFloat());
          System.out.print("Informe o preço total: ");
          Informacoes.setPrecoTotal(entrada.nextFloat());
          informacoes.add(Informacoes);
          
          System.out.println("Qtd: " + Informacoes.getQtd());
          System.out.println("Preço venda: " + Informacoes.getPrecoVenda());
          System.out.println("Preço total: " + Informacoes.getPrecoTotal());

          break;
        case 5:
          Peca Produto = new Peca();
          System.out.println("Cadastrar as peças");
          System.out.print("Informe a descrição da peça: ");
          Produto.setIdPeca(entrada.next());
          System.out.print("Informe a quantidade do produto no estoque: ");
          Produto.setDescricao(entrada.next());
          System.out.print("Informe a unidade de medida: ");
          Produto.setUnidadeMedida(entrada.nextFloat());
          System.out.print("Informe o grupo da peça: ");
          Produto.setGrupo(entrada.next());
          System.out.print("Informe o subgrupo da peça: ");
          Produto.setSubGrupo(entrada.next());
          System.out.print("Informe o custo da peça: ");
          Produto.setPrecoCusto(entrada.nextFloat());
          System.out.print("Informe o preço da venda: ");
          Produto.setPrecoVenda(entrada.nextFloat());
          produtos.add(Produto);

          System.out.println("ID: " + Produto.getIdPeca());
          System.out.println("Descrição: " + Produto.getDescricao());
          System.out.println("Unidade de medida: " + Produto.getUnidadeMedida());
          System.out.println("Grupo: " + Produto.getGrupo());
          System.out.println("Subgrupo: " + Produto.getSubGrupo());
          System.out.println("Preço de custo: " + Produto.getPrecoCusto());
          System.out.println("Preço de venda: " + Produto.getPrecoVenda());

          break;
        case 6:
          Estoque Quantidade = new Estoque();
          System.out.println("Cadastrar Itens do estoque");
          System.out.print("Informe o id do produto no estoque: ");
          Quantidade.setIdEstoque(entrada.nextInt());
          System.out.print("Informe a quantidade do produto no estoque: ");
          Quantidade.setQtd(entrada.nextInt());
          quantidades.add(Quantidade);

          System.out.println("ID: " + Quantidade.getIdEstoque());
          System.out.println("Qtd: " + Quantidade.getQtd());

          break;
        case 7:
          Venda Compra = new Venda();
          System.out.println("Cadastrar venda");
          System.out.print("Digite o id da venda: ");
          Compra.setIdVenda(entrada.next());
          System.out.print("Digite a data da venda: ");
          Compra.setDataVenda(entrada.nextInt());
          System.out.print("Digite o preço da venda: ");
          Compra.setPrecoVenda(entrada.nextFloat());
          System.out.print("Digite o desconto para o cliente: ");
          Compra.setDesconto(entrada.nextFloat());
          Compras.add(Compra);

          System.out.println("ID: " + Compra.getIdVenda());
          System.out.println("Data de venda: " + Compra.getDataVenda());
          System.out.println("Preço de venda: " + Compra.getPrecoVenda());
          System.out.println("Desconto: " + Compra.getDesconto());
          System.out.println("Preço total: " + Compra.getPrecoTotal());

          break;
        case 8:
          // sair
          break;
        default:
          System.out.println("Opção inválida!");
      }
    } while(opcao != 8);

    entrada.close();
  }
}