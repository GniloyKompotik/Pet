class Shelter {
    String name;
    String address;
    int capacity;

    Shelter(String name, String address, int capacity) {
        this.name = name;
        this.address = address;
        this.capacity = capacity;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getAddress() {
        return address;
    }

    void setAddress(String address) {
        this.address = address;
    }

    int getCapacity() {
        return capacity;
    }

    void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    public String toString() {
        return "Shelter{name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
