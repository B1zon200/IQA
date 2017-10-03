/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iqa;

import java.util.Scanner;

/**
 *
 * @author André A Kaviatkovski - Gabriel R Garcia
 */
public class Calculos {
    
    private double solidos;
    private double turbidez;
    private double coliformes;
    private double dbo;
    private double nitrato;
    private double fosfato;
    private double ph;
    private double variacao;
    private double oxigenio;
    private double altitude;
    private double iqa;
    private double temperatura;

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    
    public void setIqa(double iqa) {
        this.iqa = iqa;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }
    
    public void setSolidos(double solidos) {
        this.solidos = solidos;
    }

    public void setTurbidez(double turbidez) {
        this.turbidez = turbidez;
    }

    public void setColiformes(double coliformes) {
        this.coliformes = coliformes;
    }

    public void setDbo(double dbo) {
        this.dbo = dbo;
    }

    public void setNitrato(double nitrato) {
        this.nitrato = nitrato;
    }

    public void setFosfato(double fosfato) {
        this.fosfato = fosfato;
    }

    public void setPh(double ph) {
        this.ph = ph;
    }

    public void setVariacao(double variacao) {
        this.variacao = variacao;
    }

    public void setOxigenio(double oxigenio) {
        this.oxigenio = oxigenio;
    }

    public double getTemperatura() {
        return temperatura;
    }
    
    
    public double getIqa() {
        return iqa;
    }

    public double getSolidos() {
        return solidos;
    }

    public double getTurbidez() {
        return turbidez;
    }

    public double getColiformes() {
        return coliformes;
    }

    public double getDbo() {
        return dbo;
    }

    public double getNitrato() {
        return nitrato;
    }

    public double getFosfato() {
        return fosfato;
    }

    public double getPh() {
        return ph;
    }

    public double getVariacao() {
        return variacao;
    }

    public double getOxigenio() {
        return oxigenio;
    }

    public double getAltitude() {
        return altitude;
    }
    
    public void Solidos(double solidos) {
        if (solidos <= 150) {
            setSolidos(79.75 + (0.166 * solidos)
                    - (0.001088 * (Math.pow(solidos, 2))));
        }
         else if (solidos > 150 && solidos <= 500) {
            setSolidos(101.67 - (0.13917 * solidos));
        } else if (solidos > 500) {
            setSolidos(32);
        } else {// TODO: incluir exceção 
            setSolidos(0);
        }
    }

    public void Turbidez(double turbidez) {
        if (turbidez <= 25) {
            setTurbidez(100.17 - (2.67 * turbidez) + (0.03775 * (Math.pow(turbidez, 2))));
        } else if (turbidez > 25 && turbidez <= 100) {
            setTurbidez(84.76 * (Math.pow(2.71828, (-0.016206 * turbidez))));
        } else if (turbidez > 100) {
            setTurbidez(5);
        } else {//TODO: incluir exceção
            setTurbidez(0);
        }
    }

    public void Coliformes(double coliformes) {
        double coli_b10 = Math.log10(coliformes);

        if (coli_b10 == 0) {
            setColiformes(100);
        } else if (coli_b10 <= 1) {
            setColiformes(100 - (33 * coli_b10));
        } else if (coli_b10 > 1 && coli_b10 <= 5) {
            setColiformes(100 - (37.2 * coli_b10)
                    + (3.60743 * (Math.pow(coli_b10, 2))));
        } else if (coli_b10 > 5) {
            setColiformes(3);
        } else {//TODO: inlcuir exceção
            setColiformes(0);
        }
    }

    public void DBO(double dbo) {
        if (dbo <= 5) {
            setDbo(100.9571 - 3.6674 * dbo);
        } else if (dbo > 5 && dbo <= 15) {
            setDbo(104.67 - (31.5463 * Math.log10(dbo)));
        } else if (dbo > 15 && dbo <= 30) {
            setDbo(4394.91 * (Math.pow(dbo, -1.99809)));
        } else if (dbo > 30) {
            setDbo(2);
        } else {//TODO: incluir exceção
            setDbo(0);
        }
    }

    public void Nitrato(double nitrogenio) {
        if (nitrogenio <= 10) {
            setNitrato(100 - (8.169 * nitrogenio) + (0.3059 * (Math.pow(nitrogenio, 2))));
        } else if (nitrogenio > 10 && nitrogenio <= 60) {
            setNitrato(101.9 - 23.1023 * Math.log(nitrogenio));
        } else if (nitrogenio > 60 && nitrogenio <= 90) {
            setNitrato(10000000000.0 * (Math.pow(nitrogenio, (-5.1161))));
        } else if (nitrogenio > 90) {
            setNitrato(1);
        } else {//TODO: incluir exceção
            setNitrato(0);
        }
    }

    public void Fosfato(double fosforo) {
        double fosfato = fosforo * 3.066;

        if (fosfato <= 1) {
            setFosfato(99 * (Math.pow(Math.E, (-0.91269 * fosfato))));
        } else if (fosfato > 1 && fosfato <= 5) {
            setFosfato(57.6 - (20.178 * fosfato) + (2.1326 * (Math.pow(fosfato, 2))));
        } else if (fosfato > 5 && fosfato <= 10) {
            setFosfato(19.8 * (Math.pow(Math.E, (-0.13544 * fosfato))));
        } else if (fosfato > 10) {
            setFosfato(5);
        } else {//TODO: incluir exceção 
            setFosfato(0);
        }
    }

    public void Ph(double ph) {
        if (ph <= 2) {
            setPh(2);
        } else if (ph > 2 && ph <= 4) {
            setPh(13.6 - (10.6 * ph) + (2.4364 * (Math.pow(ph, 2))));
        } else if (ph > 4 && ph <= 6.2) {
            setPh(155.5 - (77.36 * ph) + (10.2481 * (Math.pow(ph, 2))));
        } else if (ph > 6.2 && ph <= 7) {
            setPh(-657.2 + (197.38 * ph) - (12.9167 * (Math.pow(ph, 2))));
        } else if (ph > 7 && ph <= 8) {
            setPh(-427.8 + (142.05 * ph) - (9.695 * (Math.pow(ph, 2))));
        } else if (ph > 8 && ph <= 8.5) {
            setPh(216 - (16 * ph));
        } else if (ph > 8.5 && ph <= 9) {
            setPh(1415823 * (Math.pow(Math.E, (-1.1507 * ph))));
        } else if (ph > 9 && ph <= 10) {
            setPh(-27 * ph + 288);
        } else if (ph > 10 && ph <= 12) {
            setPh(633 - (106.5 * ph) + (4.5 * (Math.pow(ph, 2))));
        } else if (ph > 12 && ph <= 14) {
            setPh(3);
        } else {// TODO: incluir exceção
            setPh(0);
        }
    }

    public void Variacao(double variacao) {
        if ((variacao > -0.625) && (variacao < 0.625)) {
            setVariacao(4.8 * variacao + 94);
        } else {
            setVariacao(0);
        }
    }

    public void Oxigenio(double oxigenio) {
      
        double saturacao = (14.62-(0.3898*getTemperatura())+
                           (0.006969*Math.pow(getTemperatura(),2)-
                           (0.00005896*Math.pow(getTemperatura(),3)))*
                           (Math.pow((1-0.0000228675*getAltitude()),5.167)));
        double porcentagem = 100 * (oxigenio / saturacao);
        System.out.println("Saturação: " + saturacao + " porcentagem: " + porcentagem);
        if (porcentagem <= 50) {
            setOxigenio(((0.34 * porcentagem) + (0.008095 * Math.pow(porcentagem, 2))
                    + (1.35252 * 0.00001 * Math.pow(porcentagem, 3))) + 3);
        } else if (porcentagem > 50 && porcentagem <= 85) {
            setOxigenio(((-1.166 * porcentagem) + (0.058 * Math.pow(porcentagem, 2))
                    - (3.803435 * 0.0001 * Math.pow(porcentagem, 3))) + 3);
        } else if (porcentagem > 85 && porcentagem <= 100) {
            setOxigenio((3.7745 * Math.pow(porcentagem, 0.704889)) + 3);
        } else if (porcentagem > 100 && porcentagem <= 140) {
            setOxigenio(((2.9 * porcentagem) - (0.02496 * Math.pow(porcentagem, 2))
                    + (5.60919 * 0.00001 * Math.pow(porcentagem, 3))) + 3);
        } else if (porcentagem > 140) {
            setOxigenio(50);
        } else { // TODO: incluir exceção
            setOxigenio(0);
        }
    }

    public void IQA() {
        
        double iqa = 0.0, p_solidos = 0.08, p_turbidez = 0.08,
                p_coliformes = 0.15, p_dbo = 0.1, p_nitrogenio = 0.1,
                p_fosforo = 0.1, p_ph = 0.12, p_variacao = 0.1,
                p_oxigenio = 0.17;

        iqa = (Math.pow(getSolidos(), p_solidos)
                * Math.pow(getTurbidez(), p_turbidez)
                * Math.pow(getColiformes(), p_coliformes)
                * Math.pow(getDbo(), p_dbo) 
                * Math.pow(getNitrato(), p_nitrogenio)
                * Math.pow(getFosfato(), p_fosforo) 
                * Math.pow(getPh(), p_ph)
                * Math.pow(getVariacao(), p_variacao)
                * Math.pow(getOxigenio(), p_oxigenio));
        setIqa(iqa);
    }
}
