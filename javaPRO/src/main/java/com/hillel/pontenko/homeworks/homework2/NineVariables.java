package com.hillel.pontenko.homeworks.homework2;

public class NineVariables {
    private byte sugar;
    private short salt;
    private int pepper;
    private long flour;
    private float buckwheat;
    private double milk;
    private char currency;
    private boolean tasteBalance;
    private String greetings;

    public byte getSugar() {
        return sugar;
    }

    public void setSugar(byte sugar) {
        this.sugar = sugar;
    }

    public short getSalt() {
        return salt;
    }

    public void setSalt(short salt) {
        this.salt = salt;
    }

    public int getPepper() {
        return pepper;
    }

    public void setPepper(int pepper) {
        this.pepper = pepper;
    }

    public long getFlour() {
        return flour;
    }

    public void setFlour(long flour) {
        this.flour = flour;
    }

    public float getBuckwheat() {
        return buckwheat;
    }

    public void setBuckwheat(float buckwheat) {
        this.buckwheat = buckwheat;
    }

    public double getMilk() {
        return milk;
    }

    public void setMilk(double milk) {
        this.milk = milk;
    }

    public char getCurrency() {
        return currency;
    }

    public void setCurrency(char currency) {
        this.currency = currency;
    }

    public boolean isTasteBalance() {
        return tasteBalance;
    }

    public void setTasteBalance(boolean tasteBalance) {
        this.tasteBalance = tasteBalance;
    }

    public String getGreetings() {
        return greetings;
    }

    public void setGreetings(String greetings) {
        this.greetings = greetings;
    }


    public NineVariables() {

    }

    public NineVariables(byte sugar) {
        this.sugar = sugar;
    }

    public NineVariables(byte sugar, short salt) {
        this.sugar = sugar;
        this.salt = salt;
    }

    public NineVariables(byte sugar, short salt, int pepper) {
        this.sugar = sugar;
        this.salt = salt;
        this.pepper = pepper;
    }

    public NineVariables(byte sugar, short salt, int pepper, long flour) {
        this.sugar = sugar;
        this.salt = salt;
        this.pepper = pepper;
        this.flour = flour;
    }

    public NineVariables(byte sugar, short salt, int pepper, long flour, float buckwheat) {
        this.sugar = sugar;
        this.salt = salt;
        this.pepper = pepper;
        this.flour = flour;
        this.buckwheat = buckwheat;
    }

    public NineVariables(byte sugar, short salt, int pepper, long flour, float buckwheat, double milk) {
        this.sugar = sugar;
        this.salt = salt;
        this.pepper = pepper;
        this.flour = flour;
        this.buckwheat = buckwheat;
        this.milk = milk;
    }

    public NineVariables(byte sugar, short salt, int pepper, long flour, float buckwheat, double milk, char currency) {
        this.sugar = sugar;
        this.salt = salt;
        this.pepper = pepper;
        this.flour = flour;
        this.buckwheat = buckwheat;
        this.milk = milk;
        this.currency = currency;
    }

    public NineVariables(byte sugar, short salt, int pepper, long flour, float buckwheat, double milk, char currency, boolean tasteBalance) {
        this.sugar = sugar;
        this.salt = salt;
        this.pepper = pepper;
        this.flour = flour;
        this.buckwheat = buckwheat;
        this.milk = milk;
        this.currency = currency;
        this.tasteBalance = tasteBalance;
    }

    public NineVariables(byte sugar, short salt, int pepper, long flour, float buckwheat, double milk, char currency, boolean tasteBalance, String greetings) {
        this.sugar = sugar;
        this.salt = salt;
        this.pepper = pepper;
        this.flour = flour;
        this.buckwheat = buckwheat;
        this.milk = milk;
        this.currency = currency;
        this.tasteBalance = tasteBalance;
        this.greetings = greetings;
    }
}
