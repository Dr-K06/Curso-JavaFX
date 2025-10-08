package org.syscimc.model;

public class Pessoa {
    private String nome;
    private float altura;
    private float peso;
    private float imc;

//************************************
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getImc() {
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }

    //************************************
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //************************************
    public Pessoa() {
    }

    public Pessoa(String nome, float altura, float peso, float imc) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.imc = imc;
    }

    //************************************

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }

    public float calcularimc(){
        this.imc = this.peso /(this.altura * this.altura);

        return this.imc;
    }
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    public String classificaçãoIMC(){
        String classificação;
        if(this.imc < 18.5)
            return "abaixo do peso";
        else if(this.imc >= 18.5 && this.imc <24.9)
            return "Peso normal";
        else if(this.imc >= 25 && this.imc <29.9)
            return "Peso normal";
        else if(this.imc >= 30 && this.imc <34.9)
            return "Obesidade Grau 1";
        else if(this.imc >= 35 && this.imc <39.9)
            return "Obesidade Grau 2";
        else
            return "Obesidade Grau 3";



    }
}
