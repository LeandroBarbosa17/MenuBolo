package menubolo;

public class Conta {
    
    private float valor;
    public float desconto(float percentual, float valor){
        
        float valorfinal = valor - (percentual * valor / 100);
        return valorfinal;
    }

    
    public float getValor() {
        return valor;
    }

    
    public void setValor(float valor) {
        this.valor = valor;
    }
    
}
