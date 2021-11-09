package task5;

class Patient {
    String name;
    boolean mask;
    Vaccine vaccinated;
    boolean covid;
    boolean freelance;

    Patient ( boolean mask, Vaccine vaccinated, boolean covid, boolean freelance){
        this.mask = mask;
        this.vaccinated = vaccinated;
        this.covid = covid;
        this.freelance = freelance;
    }
    public Patient(String name) {
        this.name = name;
    }
}
