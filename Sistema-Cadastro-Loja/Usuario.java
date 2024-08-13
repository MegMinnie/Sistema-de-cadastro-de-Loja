public class Usuario extends Pessoa{

 
  private String login;
  private String senha;
  private String cargo;
  private int nivelAcesso;


  public String getLogin() {
  return login;
  }
  public void setLogin(String login) {
  this.login = login;
  }


  public  String getSenha() {
  return senha;
  }
  public void setSenha( String senha ) {
  this.senha = senha ;
  }


  public String getCargo() {
  return cargo;
  }
  public void setCargo(String cargo) {
  this.cargo = cargo;
  }


  public int getNivelAcesso() {
  return nivelAcesso;
  }
  public void setNivelAcesso(int nivelAcesso) {
  this.nivelAcesso = nivelAcesso;
  }
  
	


}


