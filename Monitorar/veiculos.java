package Monitorar;

/*
 * Classe destinada a coisa monitorada 
 */

public class veiculos {

    private String placa;
    private int velocidade;

    public veiculos(String placa, int velocidade){
        this.placa = placa;
        this.velocidade = velocidade;
    }

    public String getPlaca(){
        return placa;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public int getVelocidade(){
        return velocidade;
    }

    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }

    @Override
    public String toString(){
        return "Placa do veículo: " + placa + ", velocidade: " + velocidade;
    }

    

    
}
