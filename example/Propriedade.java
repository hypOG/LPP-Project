package org.example;

/**
 * Represents a property with its location, size, condition, price, and rental status.
 */
public class Propriedade implements ServicoPropriedade {

    /** The location of the property. */
    private String localizacao;

    /** The size of the property in square meters. */
    private int tamanho;

    /** The condition or amenities of the property. */
    private String estado;

    /** The price per night for renting the property. */
    private int preco;

    /** Indicates if the property is currently rented or not. */
    private boolean alugada;

    /** Default constructor */
    public Propriedade() {}

    /**
     * Parameterized constructor.
     * @param localizacao The location of the property.
     * @param tamanho The size of the property in square meters.
     * @param estado The condition of the property.
     * @param preco The price per night for renting the property.
     */
    public Propriedade(String localizacao, int tamanho, String estado, int preco)  {
        this.localizacao = localizacao;
        this.tamanho = tamanho;
        this.estado = estado;
        this.preco = preco;
        this.alugada = false;
    }

    /**
     * Gets the price per night for renting the property.
     * @return The price per night.
     */
    public int getPreco() {
        return preco;
    }

    /**
     * Gets the size of the property.
     * @return The size in square meters.
     */
    public int getTamanho() {
        return tamanho;
    }

    /**
     * Gets the condition or amenities of the property.
     * @return The condition or amenities.
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Gets the location of the property.
     * @return The location.
     */
    public String getLocalizacao() {
        return localizacao;
    }

    /**
     * Sets the price per night for renting the property.
     * @param preco The price per night.
     */
    public void setPreco(int preco) {
        this.preco = preco;
    }

    /**
     * Sets the condition or amenities of the property.
     * @param estado The condition or amenities.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Sets the location of the property.
     * @param localizacao The location.
     */
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    /**
     * Sets the size of the property.
     * @param tamanho The size in square meters.
     */
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    /**
     * Sets the rental status of the property.
     * @param alugada True if the property is rented, otherwise false.
     */
    public void setAlugada(boolean alugada) {
        this.alugada = alugada;
    }

    /**
     * Provides a string representation of the property.
     * @return A string containing details of the property.
     */
    @Override
    public String toString() {
        return String.format("Localização: " + localizacao + "\nTamanho: " + tamanho + "m2\nEstado: " + estado + "\nPreço por noite: " + preco + " euros\n");
    }

    /**
     * Rents out the property.
     * @return True if the property was successfully rented, otherwise false.
     */
    @Override
    public boolean alugarPropriedade() {
        if (!alugada) {
            setAlugada(true);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Checks the availability of the property for renting.
     * @return True if the property is available for rent, otherwise false.
     */
    @Override
    public boolean verificarDisponibilidade() {
        return !alugada;
    }

    /**
     * Applies a discount to the property's price.
     * @param percentage The percentage of discount to apply (0 to 100).
     * @return True if the discount was successfully applied, otherwise false.
     */
    @Override
    public boolean aplicarDesconto(int percentage) {
        setPreco(getPreco() - (getPreco() * percentage / 100));
        return true;
    }
}