package Monitorar;
public class Velocimetro {
    
    Integer id = 0;
    Integer velocidade = 0;

    public Velocimetro(Integer id, Integer velocidade){
        this.id = id;
        this.velocidade = velocidade;
    }

    public Velocimetro(Integer velocidade){
        this.velocidade = velocidade;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Integer getVelocidade(){
        return velocidade;
    }

    public void setVelocidade(Integer velocidade){
        this.velocidade = velocidade;
    }

    @Override
    public String toString(){
        return "Velocidade no velocimetro: " + velocidade;
    }
}
