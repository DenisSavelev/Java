package com.example.Chapter3;

public class Coconut {
    public Coconut() {
    }

    public void drinkThemBothUp() {
        System.out.println("You put the lime in the coconut...");
        System.out.println("and drink �em both up...");
        System.out.println("You put the lime in the coconut...");
        lime.drink(); // ����� ������ drink() ���������� Lime
    }
    private Lime lime;
    public void setLime(Lime lime) {
        this.lime = lime;
    }
}