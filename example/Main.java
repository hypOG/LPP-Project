package org.example;

public class Main {
    public static void main(String[] args) {

        // Não utilizar, apenas para debugging

        // Criação de duas instâncias de Casa
        Casa casa1 = new Casa("Rua das Flores, 123", 250, "Bom", 50, 3, 2, 100, true);
        Casa casa2 = new Casa("Avenida Central, 456", 300, "Médio", 75, 4, 3, 150, false);

        // Criação de duas instâncias de Apartamento
        Apartamento apartamento1 = new Apartamento("Rua dos Bosques, 789", 120, "Bom", 30, 2, 1, 5, true, true);
        Apartamento apartamento2 = new Apartamento("Avenida das Palmeiras, 101", 150, "Médio", 45, 3, 2, 10, true, false);

        // Criação de duas instâncias de Cabana
        Cabana cabana1 = new Cabana("Floresta Encantada, 202", 80, "Bom", 20, 1, 1, true, true);
        Cabana cabana2 = new Cabana("Bosque dos Pássaros, 303", 90, "Bom", 25, 2, 1, true, false);

        // Criação de duas instâncias de Chale
        Chale chale1 = new Chale("Montanha Azul, 404", 110, "Mau", 35, 2, 2, true, true);
        Chale chale2 = new Chale("Vale dos Ventos, 505", 130, "Bom", 40, 3, 2, false, true);

        // Exibindo as propriedades
        System.out.println(casa1);
        System.out.println(casa2);
        System.out.println(apartamento1);
        System.out.println(apartamento2);
        System.out.println(cabana1);
        System.out.println(cabana2);
        System.out.println(chale1);
        System.out.println(chale2);
    }
}