package org.example;

/**
 * Represents a house property, extending the base property class.
 */
public class Casa extends Propriedade {

    /** The number of bedrooms in the house. */
    private int quartos;

    /** The number of bathrooms in the house. */
    private int banheiros;

    /** The size of the external area in square meters. */
    private int areaExterna;

    /** Indicates whether the house has a swimming pool or not. */
    private boolean piscina;

    /** Default constructor */
    public Casa() {}

    /**
     * Parameterized constructor.
     * @param localizacao The location of the house.
     * @param tamanho The size of the house in square meters.
     * @param estado The condition or amenities of the house.
     * @param preco The price per night for renting the house.
     * @param quartos The number of bedrooms in the house.
     * @param banheiros The number of bathrooms in the house.
     * @param areaExterna The size of the external area in square meters.
     * @param piscina True if the house has a swimming pool, otherwise false.
     */
    public Casa(String localizacao, int tamanho, String estado, int preco, int quartos, int banheiros, int areaExterna, boolean piscina) {
        super(localizacao, tamanho, estado, preco);
        this.quartos = quartos;
        this.banheiros = banheiros;
        this.areaExterna = areaExterna;
        this.piscina = piscina;
    }

    /**
     * Gets the size of the external area.
     * @return The size in square meters.
     */
    public int getAreaExterna() {
        return areaExterna;
    }

    /**
     * Gets the number of bathrooms in the house.
     * @return The number of bathrooms.
     */
    public int getBanheiros() {
        return banheiros;
    }

    /**
     * Gets the number of bedrooms in the house.
     * @return The number of bedrooms.
     */
    public int getQuartos() {
        return quartos;
    }

    /**
     * Sets the size of the external area.
     * @param areaExterna The size in square meters.
     */
    public void setAreaExterna(int areaExterna) {
        this.areaExterna = areaExterna;
    }

    /**
     * Sets the number of bathrooms in the house.
     * @param banheiros The number of bathrooms.
     */
    public void setBanheiros(int banheiros) {
        this.banheiros = banheiros;
    }

    /**
     * Sets whether the house has a swimming pool or not.
     * @param piscina True if the house has a swimming pool, otherwise false.
     */
    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    /**
     * Sets the number of bedrooms in the house.
     * @param quartos The number of bedrooms.
     */
    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    /**
     * Provides a string representation of the house property.
     * @return A string containing details of the house.
     */
    @Override
    public String toString() {
        return super.toString() + this.quartos + " quartos - "  + this.banheiros + " banheiros - Area externa: " + this.areaExterna + "m2 - " + (piscina ? "Tem piscina" : "Não tem piscina") + "\n";
    }
}