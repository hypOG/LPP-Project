package org.example;

/**
 * Represents a cabin property, extending the base property class.
 */
public class Cabana extends Propriedade {

    /** The number of bedrooms in the cabin. */
    private int quartos;

    /** The number of bathrooms in the cabin. */
    private int banheiros;

    /** Indicates whether the cabin has a fireplace or not. */
    private boolean lareira;

    /** Indicates whether the cabin is close to a forest or not. */
    private boolean florestaProxima;

    /** Default constructor */
    public Cabana() {}

    /**
     * Parameterized constructor.
     * @param localizacao The location of the cabin.
     * @param tamanho The size of the cabin in square meters.
     * @param estado The condition or amenities of the cabin.
     * @param preco The price per night for renting the cabin.
     * @param quartos The number of bedrooms in the cabin.
     * @param banheiros The number of bathrooms in the cabin.
     * @param lareira True if the cabin has a fireplace, otherwise false.
     * @param florestaProxima True if the cabin is close to a forest, otherwise false.
     */
    public Cabana(String localizacao, int tamanho, String estado, int preco, int quartos, int banheiros, boolean lareira, boolean florestaProxima) {
        super(localizacao, tamanho, estado, preco);
        this.quartos = quartos;
        this.banheiros = banheiros;
        this.lareira = lareira;
        this.florestaProxima = florestaProxima;
    }

    /**
     * Gets the number of bedrooms in the cabin.
     * @return The number of bedrooms.
     */
    public int getQuartos() {
        return quartos;
    }

    /**
     * Gets the number of bathrooms in the cabin.
     * @return The number of bathrooms.
     */
    public int getBanheiros() {
        return banheiros;
    }

    /**
     * Checks if the cabin has a fireplace.
     * @return True if the cabin has a fireplace, otherwise false.
     */
    public boolean isLareira() {
        return lareira;
    }

    /**
     * Checks if the cabin is close to a forest.
     * @return True if the cabin is close to a forest, otherwise false.
     */
    public boolean isFlorestaProxima() {
        return florestaProxima;
    }

    /**
     * Sets the number of bedrooms in the cabin.
     * @param quartos The number of bedrooms.
     */
    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    /**
     * Sets the number of bathrooms in the cabin.
     * @param banheiros The number of bathrooms.
     */
    public void setBanheiros(int banheiros) {
        this.banheiros = banheiros;
    }

    /**
     * Sets whether the cabin has a fireplace.
     * @param lareira True if the cabin has a fireplace, otherwise false.
     */
    public void setLareira(boolean lareira) {
        this.lareira = lareira;
    }

    /**
     * Sets whether the cabin is close to a forest.
     * @param florestaProxima True if the cabin is close to a forest, otherwise false.
     */
    public void setFlorestaProxima(boolean florestaProxima) {
        this.florestaProxima = florestaProxima;
    }

    /**
     * Provides a string representation of the cabin property.
     * @return A string containing details of the cabin.
     */
    @Override
    public String toString() {
        return super.toString() + this.quartos + " quartos - " + this.banheiros + " banheiros - " + (lareira ? "Tem lareira" : "Não tem lareira") + " - " + (florestaProxima ? "Perto de floresta" : "Não perto de floresta") + "\n";
    }
}