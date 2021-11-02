public enum Vaccine {
    JOHNSON("Johnson & Johnson"),
    CV("CoronaVac"),
    BIO("BioNTech и Pfizer"),
    AZ("AstraZeneca"),
    SPUTNIK("Спутник V");

    private String vaccineName;

    Vaccine(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public String getVaccineName() {
        return vaccineName;
    }
}
