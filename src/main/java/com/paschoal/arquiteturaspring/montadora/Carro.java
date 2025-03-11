package com.paschoal.arquiteturaspring.montadora;

public class Carro {
    private String modelo;
    private Color cor;
    private Motor motor;
    private montadora montadora;


    public Carro(Motor motor) {
        this.motor = motor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public montadora getMontadora() {
        return montadora;
    }

    public void setMontadora(montadora montadora) {
        this.montadora = montadora;
    }
}
