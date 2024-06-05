package org.example;

/**
 * Represents an apartment property, extending the base property class.
 */
public class Apartamento extends org.example.Propriedade {

    /** The number of bedrooms in the apartment. */
    private int quartos;

    /** The number of bathrooms in the apartment. */
    private int banheiros;

    /** The floor number of the apartment. */
    private int andar;

    /** Indicates whether the apartment has an elevator or not. */
    private boolean elevador;

    /** Indicates whether the apartment has a balcony or not. */
    private boolean varanda;

    /** Default constructor */
    public Apartamento() {}

    /**
     * Parameterized constructor.
     * @param localizacao The location of the apartment.
     * @param tamanho The size of the apartment in square meters.
     * @param estado The condition or amenities of the apartment.
     * @param preco The price per night for renting the apartment.
     * @param quartos The number of bedrooms in the apartment.
     * @param banheiros The number of bathrooms in the apartment.
     * @param andar The floor number of the apartment.
     * @param elevador True if the apartment has an elevator, otherwise false.
     * @param varanda True if the apartment has a balcony, otherwise false.
     */
    public Apartamento(String localizacao, int tamanho, String estado, int preco, int quartos, int banheiros, int andar, boolean elevador, boolean varanda) {
        super(localizacao, tamanho, estado, preco);
        this.quartos = quartos;
        this.banheiros = banheiros;
        this.andar = andar;
        this.elevador = elevador;
        this.varanda = varanda;
    }

    /**
     * Gets the number of bedrooms in the apartment.
     * @return The number of bedrooms.
     */
    public int getQuartos() {
        return quartos;
    }

    /**
     * Gets the number of bathrooms in the apartment.
     * @return The number of bathrooms.
     */
    public int getBanheiros() {
        return banheiros;
    }

    /**
     * Gets the floor number of the apartment.
     * @return The floor number.
     */
    public int getAndar() {
        return andar;
    }

    /**
     * Checks if the apartment has an elevator.
     * @return True if the apartment has an elevator, otherwise false.
     */
    public boolean isElevador() {
        return elevador;
    }

    /**
     * Checks if the apartment has a balcony.
     * @return True if the apartment has a balcony, otherwise false.
     */
    public boolean isVaranda() {
        return varanda;
    }

    /**
     * Sets the number of bedrooms in the apartment.
     * @param quartos The number of bedrooms.
     */
    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    /**
     * Sets the number of bathrooms in the apartment.
     * @param banheiros The number of bathrooms.
     */
    public void setBanheiros(int banheiros) {
        this.banheiros = banheiros;
    }

    /**
     * Sets the floor number of the apartment.
     * @param andar The floor number.
     */
    public void setAndar(int andar) {
        this.andar = andar;
    }

    /**
     * Sets whether the apartment has an elevator.
     * @param elevador True if the apartment has an elevator, otherwise false.
     */
    public void setElevador(boolean elevador) {
        this.elevador = elevador;
    }

    /**
     * Sets whether the apartment has a balcony.
     * @param varanda True if the apartment has a balcony, otherwise false.
     */
    public void setVaranda(boolean varanda) {
        this.varanda = varanda;
    }

    /**
     * Provides a string representation of the apartment property.
     * @return A string containing details of the apartment.
     */
    @Override
    public String toString() {
        return super.toString() + this.quartos + " quartos - " + this.banheiros + " banheiros - Andar: " + this.andar + " - " + (elevador ? "Tem elevador" : "Não tem elevador") + " - " + (varanda ? "Tem varanda" : "Não tem varanda") + "\n";
    }
}
