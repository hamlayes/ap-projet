package com.example.ap_projet;

import java.io.Serializable;

public class personne implements Serializable {
    private String pseudo;
    private float taille;
    private float poids;

    public personne (String pseudo, float taille, float poids){
        this.pseudo = pseudo;
        this.taille = taille;
        this.poids = poids;
    }

    public float calculerImc(){
        float imc=0;
        if(taille>0 && poids>0){
            imc= Math.round(poids/(taille*taille));
        }
        return imc;
    }


    public String interpretationIMC(){
        String r ;
        if(calculerImc() < 18.5){
            r = "vous êtes maigre";
        }
        else if (calculerImc() >= 18.5 && calculerImc() <= 25 ){
            r = "vous êtes normal";
        }
        else if (calculerImc() >= 25 && calculerImc() <= 30 ){
            r = "surpoids";
        }
        else if (calculerImc() >= 30 && calculerImc() <= 35 ){
            r = "Obésité modérée";
        }
        else if (calculerImc() >= 35 && calculerImc() <=40 ){
            r = "Obésité sévère ";
        }
        else{
            r = "Obésité morbide ou massive";
        }
        return r;
    }

    public String toString(){
        return " "+pseudo + " votre IMC est de " + calculerImc() + " " + interpretationIMC();
    }

}