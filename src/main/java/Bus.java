import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity = 10;
    private ArrayList<Person> passengers;

    public Bus(){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public void addPassenger(Person person) {
        if (this.passengerCount() <= this.capacity){
            this.passengers.add(person);
        }
    }

    public void removePassenger() {
        this.passengers.remove(0);
    }
}
