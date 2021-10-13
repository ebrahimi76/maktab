package drugstore.entity;

public class DrugList {
    private int patientId;
    private Drug[] drugs;
    private int[] numbers;

    public DrugList(int patientId, Drug[] drugs, int[] numbers) {
        this.patientId = patientId;
        this.drugs = drugs;
        this.numbers = numbers;
    }

    public int getPatientId() {
        return patientId;
    }

    public Drug[] getDrugs() {
        return drugs;
    }

    public int[] getNumbers() {
        return numbers;
    }
}
