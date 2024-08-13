public class Peca{

  private String idPeca;
  private String descricao;
  private float unidadeMedida;
  private String grupo;
  private String subGrupo;
  private float precoCusto;
  private float precoVenda;


  public String getIdPeca (){
    return idPeca;
    }
   public void setIdPeca (String idPeca){
    this.idPeca = idPeca;
    }


 public String getDescricao (){
    return descricao;
    }
   public void setDescricao (String descricao){
    this.descricao = descricao;
    }


  public float getUnidadeMedida (){
    return unidadeMedida;
    }
   public  void setUnidadeMedida(float unidadeMedida){
    this.unidadeMedida = unidadeMedida;
    }



 public String getGrupo (){
    return grupo;
    }
   public void setGrupo(String grupo){
    this.grupo = grupo;
    }


  public String getSubGrupo (){
    return subGrupo;
    }
   public void setSubGrupo (String subGrupo){
    this.subGrupo = subGrupo;
    }


 public float getPrecoCusto(){
    return precoCusto;
    }
   public void setPrecoCusto (float precoCusto){
    this.precoCusto = precoCusto;
    }


  public float  getPrecoVenda (){
    return precoVenda;
    }
   public void setPrecoVenda (float precoVenda){
    this.precoVenda = precoVenda;
    }



}