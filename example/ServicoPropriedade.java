package org.example;

/**
 * Interface for managing property services such as renting, availability checking, and applying discounts.
 */
public interface ServicoPropriedade {

    /**
     * Rents out the property.
     * @return True if the property was successfully rented, otherwise false.
     */
    boolean alugarPropriedade();

    /**
     * Checks the availability of the property for renting.
     * @return True if the property is available for rent, otherwise false.
     */
    boolean verificarDisponibilidade();

    /**
     * Applies a discount to the property's price.
     * @param desconto The percentage of discount to apply (0 to 100).
     * @return True if the discount was successfully applied, otherwise false.
     */
    boolean aplicarDesconto(int desconto);
}
