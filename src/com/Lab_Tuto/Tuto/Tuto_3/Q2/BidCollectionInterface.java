package com.Lab_Tuto.Tuto.Tuto_3.Q2;

public interface BidCollectionInterface {

    /**
     * Adds a new bid to the collection
     * @param bid  The object to be added as new bid
     * @return True if the condition is success, or False if not.
     */
    boolean add(BidInterface bid);

    /**
     * Gets the bid with the best yearly cost in the collection
     * @return  The BidInterface bid that consists the best yearly cost.
     */
    BidInterface bestYearlyCost();

    /**
     * Gets the bid with the best initial cost in the collection
     * @return  The BidInterface bid that has best initial cost.
     */
    BidInterface bestInitialCost();

    /**
     * Remove all the elements in the collection.
     */
    void clear();

    /**
     * Get the number of items in the collection.
     * @return The integer number of item currently in the collection.
     */
    int numberOfItems();

    /**
     * Sees whether this collection is empty.
     * @return True if the collection is empty, or false if not.
     */
    boolean isEmpty();
}
