class PetAdopt {
    public static void main(String[] args) {
        // Create Shelter instances
        Shelter shelter1 = new Shelter("Paws Shelter", "Bautzhan Momushyly 13", 50);
        Shelter shelter2 = new Shelter("Tails Shelter", "Mangilik EL 34", 30);

        // Create Pet instances
        Pet pet1 = new Pet("Aqzhol", "Dog", 3, true, shelter1);
        Pet pet2 = new Pet("Barsik", "Cat", 2, true, shelter2);
        Pet pet3 = new Pet("Reks", "Dog", 4, false, shelter1);

        // Create Adopter instances
        Adopter adopter1 = new Adopter("Kamila", "kamila@gmail.com", "+77775468956", 1);
        Adopter adopter2 = new Adopter("Anton", "anton@gmail.com", "+77071238875", 2);

        // Display information
        System.out.println(pet1);
        System.out.println(pet2);
        System.out.println(pet3);

        System.out.println(adopter1);
        System.out.println(adopter2);

        System.out.println(shelter1);
        System.out.println(shelter2);

        // Compare objects
        System.out.println("Is pet1 available for adoption? " + pet1.isAvailable());
        System.out.println("Is adopter1's preferred number of pets greater than adopter2's? "
                + (adopter1.getPreferredPets() > adopter2.getPreferredPets()));
    }
}