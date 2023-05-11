public class Me implements Tourist {

    static int budget = 1000;

    public void visit() {
        System.out.println("Enjoying my stay");
    }

    public void visit(Boracay boracay) {
        checkBudget();
        if (budget < boracay.airFare) {
            System.out.println("Ipon muna bago gala ulit!");

        } else {
            budget = budget - boracay.airFare;
            System.out.println();
            System.out.println("Let's Go BORACAY!"); 
            System.out.println("Finally!! I visited Bora");  
            System.out.println();
        } checkBudget();
    }
    public void visit(Batanes batanes) {
        if (budget < batanes.airFare) {
         System.out.println("Ipon muna bago gala ulit!");
         } else {budget = budget - batanes.airFare;
            System.out.println("Let's Go BATANES!"); 
         System.out.println("Thank You! The land of True Insulars");
         System.out.println();
         } checkBudget();
    }
    public void visit(Davao davao) {
        if (budget < davao.airFare) {
            System.out.println("Ipon muna bago gala ulit!");
           
         } else { 
            budget = budget - davao.airFare;
            System.out.println("Let's Go DAVAO!"); 
            System.out.println("DAGHANG SALAMAT! The Durian Capital of the Philippines");
            System.out.println();
         } checkBudget();
    }
    public void visit(Ilocos ilocos) {
        
        if (budget < ilocos.airFare) {
            System.out.println("Ipon muna bago gala ulit!");
         } else {
            budget = budget - ilocos.airFare;
            System.out.println("Let's Go ILOCOS!"); 
            System.out.println("Fantastic! I finally came at the Heritage haven of the Far North!");
            System.out.println();
         } checkBudget();
    }
    public void visit(Palawan palawan) {
       
        if (budget < palawan.airFare) {
            System.out.println("Ipon muna bago gala ulit!");
         } else {
            budget = budget - palawan.airFare;
            System.out.println("Let's Go PALAWAN!"); 
            System.out.println("Amazing! The Largest Province in the Philippines!");
            System.out.println();
         } checkBudget();
    }
    public void visit(Cebu cebu) {
        if (budget < cebu.airFare) {
            System.out.println("Ipon muna bago gala ulit!");
         } else {
            budget = budget - cebu.airFare;
            System.out.println("Let's Go CEBU!"); 
            System.out.println("Perfect! The Gateway to a Thousand Journeys!");
            System.out.println();
         } checkBudget();
    }

    public void checkBudget() {
        System.out.println("My budget is " + budget);
    }

}