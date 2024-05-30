package com.hotmail.stinger.luis;

public class desafioClassficadorDoNivelDoHeroi {

    public static void main(String[] args) {

        String Nome = "Vegeta";
        int nivelXp = 10590;

        if (nivelXp == 1000) {
            System.out.println(" O Heroi do nome: " +Nome+ " está no nível de: Ferro "+nivelXp);
        } else if (nivelXp >= 1001 && nivelXp <= 2000) {
            System.out.println(" O Heroi do nome: " +Nome+ " está no nível de: Bronze "+nivelXp);
        } else if (nivelXp >= 2001 && nivelXp <= 5000) {
            System.out.println(" O Heroi do nome: " +Nome+ " está no nível de: Prata "+nivelXp);
        } else if (nivelXp >= 5001 && nivelXp <= 7000) {
            System.out.println(" O Heroi do nome: " +Nome+ " está no nível de: Ouro "+nivelXp);
        } else if (nivelXp >= 7001 && nivelXp <= 8000) {
            System.out.println(" O Heroi do nome: " +Nome+ " está no nível de: Platina "+nivelXp);
        } else if (nivelXp >= 8001 && nivelXp <= 9000) {
            System.out.println(" O Heroi do nome: " +Nome+ " está no nível de: Ascendente "+nivelXp);
        } else if (nivelXp >= 9001 && nivelXp <= 10000) {
            System.out.println(" O Heroi do nome: " +Nome+ " está no nível de: Imortal "+nivelXp);
        }else if (nivelXp >= 10001 && nivelXp <= 11000) {
            System.out.println(" O Heroi do nome: " +Nome+ " está no nível de: Radiante "+nivelXp);
        }
    }
}
