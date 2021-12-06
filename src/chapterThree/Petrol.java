package chapterThree;

public class Petrol {
    public static void main(String[] args) {
        PetrolPurchase petrol = new PetrolPurchase("Lagos","Diesel",60,270,2);
        System.out.printf("%s was bought in %s at %.2f per litres%n",petrol.getPetrolType(),petrol.getLocation(),petrol.getPrice());

        petrol.getPurchaseAmount();
        System.out.printf("The purchase amount of %s is %.2f",petrol.getPetrolType(),petrol.getPurchaseAmount());
    }
}
