package org.brujula;


public class Kata{
    public static String declareWinner(Fighter luchador, Fighter contrincante){
        while ((luchador.getHealth() > 0) || (contrincante.getHealth() > 0)){
            contrincante.combat(luchador.getAttack());
            if (luchador.getHealth() <= 0){
                return contrincante.getName();
            }else{
            luchador.combat(contrincante.getAttack());
        }}
        return luchador.getName();
    }
}
