package org.brujula;


public class Kata{
    public static String declareWinner(Fighter luchador, Fighter contrincante){
        while ((luchador.getHealth() > 0) || (contrincante.getHealth() > 0)){
            luchador.combat(contrincante.getAttack());
            contrincante.combat(luchador.getAttack());
        }
        if (luchador.getHealth() < contrincante.getHealth()){
            return contrincante.getName();
        }
        return luchador.getName();
    }
}
