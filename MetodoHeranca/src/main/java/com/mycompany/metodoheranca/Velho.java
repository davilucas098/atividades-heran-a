package com.mycompany.metodoheranca;

class Velho extends Imovel {
    public Velho(double valorBase) {
        super(valorBase);
    }

    @Override
    public void imprimirValorFinal() {
        double valorFinal = getValorBase() * 0.8; // 20% de desconto para imóveis velhos
        System.out.println("Imóvel Velho. Valor final: R$ " + valorFinal);
    }
}
