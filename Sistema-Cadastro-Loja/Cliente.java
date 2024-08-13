

public class Cliente extends Pessoa {
  private String nome;
  private String apelido;
  private String sexo;
  private String cpf;
  private String rg;
  private String datasnacimento;

  public String getNome(){
    return nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getApelido (){
  return apelido;
  }
  public void setApelido (String apelido){
  this.apelido = apelido;
  }
  public String getSexo (){
  return sexo;
  }
 public  void setSexo (String sexo){
  this.sexo = sexo;
  }
  public String getCpf (){
  return cpf;
  }
  public void setCpf (String cpf){
  this.cpf = cpf;
  }
  public String getRg (){
  return rg;
  }
  public void setRg (String rg){
  this.rg = rg;
  }
  
  public String getDatasNascimento (){
  return datasnacimento;
  }
  public void setDatasNascimento (String datasnascimento){
  this.datasnacimento = datasnascimento;
  }


}





