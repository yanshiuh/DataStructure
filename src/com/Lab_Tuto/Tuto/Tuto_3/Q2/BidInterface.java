package com.Lab_Tuto.Tuto.Tuto_3.Q2;

public interface BidInterface {
    /*
    - Javadoc comments are more focused on the parameters of the methods,
      what your method will return depending on the parameters you give to your methods.

    - Block comments are important to understand how the code works,
      why it works and which are the operations used to do the actual work.
     */

    /**
     * Gets the name of company making this bid
     * @return  The String of company name
     */
    String companyName();

    /**
     * Gets the description of the air conditioner that this bid for
     * @return  The String of description
     */
    String description();

    /**
     * Gets the capacity of this bid's AC in tons (1 ton = 12,000 BTU)
     * @return  The Integer of number of capacity
     */
    int capacity();

    /**
     * Gets the seasonal efficiency of this id's AC (SEER)
     * @return  The Double of number of seasonal efficiency
     */
    double seasonalEfficiency();


    /**
     * Gets the cost of this bid's AC
     * @return  The Double of cost
     */
    double cost();

    /**
     * Gets the cost of installing this bid's AC
     * @return  The Double of number of cost installation
     */
    double costInstallation();

    /**
     * Gets the yearly cost of operating this bid's AC
     * @return  The Double of number of yearly costx
     */
    double yearlyCost();
}
