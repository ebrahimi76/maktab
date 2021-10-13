package drugstore.entity;

public class Prescription {
    private int patientId;
    private int listId;

    public Prescription(int patientId, int listId) {
        this.patientId = patientId;
        this.listId = listId;
    }

    public int getPatientId() {
        return patientId;
    }

    public int getListId() {
        return listId;
    }
}
