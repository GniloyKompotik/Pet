class Pet {
    String name;
    String type;
    int age;
    boolean isAvailable;
    Shelter shelter;

    public Pet(String name, String type, int age, boolean isAvailable, Shelter shelter) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.isAvailable = isAvailable;
        this.shelter = shelter;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getType() {
        return type;
    }

    void setType(String type) {
        this.type = type;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    boolean isAvailable() {
        return isAvailable;
    }

    void setAvailable(boolean available) {
        isAvailable = available;
    }

    Shelter getShelter() {
        return shelter;
    }

    void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    public String toString() {
        return "Pet{name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                ", isAvailable=" + isAvailable +
                ", shelter=" + shelter.getName() +
                '}';
    }
}