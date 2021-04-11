package algorithms.search;

public abstract  class AState {
    private double cost;
    private AState cameFrom;

    /**
     *  Constructor
     * @param cost
     * @param cameFrom
     */
    public AState(double cost, AState cameFrom) {
        this.cost = cost;
        this.cameFrom = cameFrom;
    }

    /**
     * Default Constructor
     */
    public AState() {
        this.cost=0;
        this.cameFrom = null;
    }

    public AState(double cost) {
        this.cost = cost;
        this.cameFrom = null;
    }

    /**
     * getter for cost
     * @return the cost of this state
     */
    public double getCost() {
        return cost;
    }


    /**
     * Getter for CameFrom
     * @return the Astate from where we came from
     */
    public AState getCameFrom() {
        return cameFrom;
    }

}
