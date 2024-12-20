class Adopter {
    String name;
    String email;
    String phone;
    int preferredPets;

    Adopter(String name, String email, String phone, int preferredPets) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.preferredPets = preferredPets;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getEmail() {
        return email;
    }

    void setEmail(String email) {
        this.email = email;
    }

    String getPhone() {
        return phone;
    }

    void setPhone(String phone) {
        this.phone = phone;
    }

    int getPreferredPets() {
        return preferredPets;
    }

    void setPreferredPets(int preferredPets) {
        this.preferredPets = preferredPets;
    }

    public String toString() {
        return "Adopter{name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", preferredPets=" + preferredPets +
                '}';
    }
}