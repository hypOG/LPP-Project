package org.example;

/**
 * Represents a chalet property, extending the base property class.
 */
public class Chale extends Propriedade {

    /** The number of bedrooms in the chalet. */
    private int quartos;

    /** The number of bathrooms in the chalet. */
    private int banheiros;

    /** Indicates whether the chalet has central heating or not. */
    private boolean aquecimentoCentral;

    /** Indicates whether the chalet has a mountain view or not. */
    private boolean vistaParaMontanha;

    /** Default constructor */
    public Chale() {}

    /**
     * Parameterized constructor.
     * @param localizacao The location of the chalet.
     * @param tamanho The size of the chalet in square meters.
     * @param estado The condition or amenities of the chalet.
     * @param preco The price per night for renting the chalet.
     * @param quartos The number of bedrooms in the chalet.
     * @param banheiros The number of bathrooms in the chalet.
     * @param aquecimentoCentral True if the chalet has central heating, otherwise false.
     * @param vistaParaMontanha True if the chalet has a mountain view, otherwise false.
     */
    public Chale(String localizacao, int tamanho, String estado, int preco, int quartos, int banheiros, boolean aquecimentoCentral, boolean vistaParaMontanha) {
        super(localizacao, tamanho, estado, preco);
        this.quartos = quartos;
        this.banheiros = banheiros;
        this.aquecimentoCentral = aquecimentoCentral;
        this.vistaParaMontanha = vistaParaMontanha;
    }

    /**
     * Gets the number of bedrooms in the chalet.
     * @return The number of bedrooms.
     */
    public int getQuartos() {
        return quartos;
    }

    /**
     * Gets the number of bathrooms in the chalet.
     * @return The number of bathrooms.
     */
    public int getBanheiros() {
        return banheiros;
    }

    /**
     * Checks if the chalet has central heating.
     * @return True if the chalet has central heating, otherwise false.
     */
    public boolean isAquecimentoCentral() {
        return aquecimentoCentral;
    }

    /**
     * Checks if the chalet has a mountain view.
     * @return True if the chalet has a mountain view, otherwise false.
     */
    public boolean isVistaParaMontanha() {
        return vistaParaMontanha;
    }

    /**
     * Sets the number of bedrooms in the chalet.
     * @param quartos The number of bedrooms.
     */
    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    /**
     * Sets the number of bathrooms in the chalet.
     * @param banheiros The number of bathrooms.
     */
    public void setBanheiros(int banheiros) {
        this.banheiros = banheiros;
    }

    /**
     * Sets whether the chalet has central heating.
     * @param aquecimentoCentral True if the chalet has central heating, otherwise false.
     */
    public void setAquecimentoCentral(boolean aquecimentoCentral) {
        this.aquecimentoCentral = aquecimentoCentral;
    }

    /**
     * Sets whether the chalet has a mountain view.
     * @param vistaParaMontanha True if the chalet has a mountain view, otherwise false.
     */
    public void setVistaParaMontanha(boolean vistaParaMontanha) {
        this.vistaParaMontanha = vistaParaMontanha;
    }

    /**
     * Provides a string representation of the chalet property.
     * @return A string containing details of the chalet.
     */
    @Override
    public String toString() {
        return super.toString() + this.quartos + " quartos - " + this.banheiros + " banheiros - " + (aquecimentoCentral ? "Tem aquecimento central" : "Não tem aquecimento central") + " - " + (vistaParaMontanha ? "Vista para montanha" : "Sem vista para montanha") + "\n";
    }
}
