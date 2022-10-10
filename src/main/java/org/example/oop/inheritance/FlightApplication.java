package org.example.oop.inheritance;

public class FlightApplication {
    public static void main(String[] args) {

        Flight flight1 = new Flight("2000G","White","AirBus2300");
        System.out.println(flight1.toString());
        Flight flight2 = new Cargo("3000J","Grey-White","Cargo-6755",4000);
        System.out.println(flight2.toString());
        Flight flight3 = new Passenger("5000B","Red-White","Air-Spice9089",800);
        System.out.println(flight3.toString());
    }

}

class Flight {
    String flightModel;
    String flightColour;
    String flightName;

    public Flight() {}
    public Flight(String flightModel, String flightColour, String flightName) {
        this.flightModel = flightModel;
        this.flightColour = flightColour;
        this.flightName = flightName;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightModel='" + flightModel + '\'' +
                ", flightColour='" + flightColour + '\'' +
                ", flightName='" + flightName + '\'' +
                '}';
    }
}

class Cargo extends Flight {
    Integer cargoFlightLuggageCapacity;

    public Cargo(Integer cargoFlightLuggageCapacity) {
        this.cargoFlightLuggageCapacity = cargoFlightLuggageCapacity;
    }

    public Cargo(String flightModel, String flightColour, String flightName, Integer cargoFlightLuggageCapacity) {
        super(flightModel, flightColour, flightName);
        this.cargoFlightLuggageCapacity = cargoFlightLuggageCapacity;
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "cargoFlightLuggageCapacity=" + cargoFlightLuggageCapacity +
                ", flightModel='" + flightModel + '\'' +
                ", flightColour='" + flightColour + '\'' +
                ", flightName='" + flightName + '\'' +
                '}';
    }
}
class Passenger extends Flight {
    Integer passengerFlightSeatingCapacity;

    public Passenger(Integer passengerFlightSeatingCapacity) {
        this.passengerFlightSeatingCapacity = passengerFlightSeatingCapacity;
    }

    public Passenger(String flightModel, String flightColour, String flightName, Integer passengerFlightSeatingCapacity) {
        super(flightModel, flightColour, flightName);
        this.passengerFlightSeatingCapacity = passengerFlightSeatingCapacity;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "passengerFlightSeatingCapacity=" + passengerFlightSeatingCapacity +
                ", flightModel='" + flightModel + '\'' +
                ", flightColour='" + flightColour + '\'' +
                ", flightName='" + flightName + '\'' +
                '}';
    }
}

