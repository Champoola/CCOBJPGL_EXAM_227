interface Tourist {

    int budget = 0;

    void visit();

    void visit(Boracay boracay);
    void visit(Batanes batanes);
    void visit(Cebu cebu);
    void visit(Davao davao);
    void visit(Ilocos ilocos);
    void visit(Palawan palawan);
    
    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}