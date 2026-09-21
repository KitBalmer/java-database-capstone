package com.project.back_end.models;

public class Prescription {
    @Document(collection = "prescriptions")
  // @Document annotation:
//    - Marks the class as a MongoDB document (a collection in MongoDB).
//    - The collection name is specified as "prescriptions" to map this class to the "prescriptions" collection in MongoDB.

    private Long id{
        @Id
    }

// 1. 'id' field:
//    - Type: private String
//    - Description:
//      - Represents the unique identifier for each prescription.
//      - The @Id annotation marks it as the primary key in the MongoDB collection.
//      - The id is of type String, which is commonly used for MongoDB's ObjectId as it stores IDs as strings in the database.

    private String patientName{
        @NotNull
        @Size(min = 3, max = 100)
    }

// 2. 'patientName' field:
//    - Type: private String
//    - Description:
//      - Represents the name of the patient receiving the prescription.
//      - The @NotNull annotation ensures that the patient name is required.
//      - The @Size(min = 3, max = 100) annotation ensures that the name length is between 3 and 100 characters, ensuring a reasonable name length.

    private Long apppointmentId{
        @NotNull
    }
// 3. 'appointmentId' field:
//    - Type: private Long
//    - Description:
//      - Represents the ID of the associated appointment where the prescription was given.
//      - The @NotNull annotation ensures that the appointment ID is required for the prescription.
    private String medication{
        @NotNull
        @Size(min = 3, max = 100)
    }
// 4. 'medication' field:
//    - Type: private String
//    - Description:
//      - Represents the medication prescribed to the patient.
//      - The @NotNull annotation ensures that the medication name is required.
//      - The @Size(min = 3, max = 100) annotation ensures that the medication name is between 3 and 100 characters, which ensures meaningful medication names.
    private String dosage{
        @NotNull
    }
// 5. 'dosage' field:
//    - Type: private String
//    - Description:
//      - Represents the dosage information for the prescribed medication.
//      - The @NotNull annotation ensures that the dosage information is provided.
    private String doctorNotes{
        @Size(max = 200)
    }
// 6. 'doctorNotes' field:
//    - Type: private String
//    - Description:
//      - Represents any additional notes or instructions from the doctor regarding the prescription.
//      - The @Size(max = 200) annotation ensures that the doctor's notes do not exceed 200 characters, providing a reasonable limit for additional notes.

// 7. Constructors:
//    - The class includes a no-argument constructor (default constructor) and a parameterized constructor that initializes the fields: patientName, medication, dosage, doctorNotes, and appointmentId.

    public Long getId() {
        return id;
    }
    public String getPatientName() {
        return patientNameame;
    }
    public String getAppointmentId() {
        return appointmentId
    }
    public String getMedication() {
        return medication
    }
    public String getDosage() {
        return dosage
    }
    public String getDoctorNotes() {
        return doctorNotes
    }

    public void setId(String newId) {
        this.id = newId;
    }
    public void setPatientName(String newName) {
        this.name = newName;
    }
    public void setAppointmentId(String newAppointmentId) {
        this.appointmentId = newAppointmentId;
    }
    public void setMedication(String newMedication) {
        this.medication = newMedication;
    }
    public void setPassword(String newPassword) {
        this.password = newPassword;
    }
    public void setDosage(String newDosage) {
        this.dosage = newDosage;
    }
    public void setDoctorNotes(String newDoctorNotes) {
        this.doctorNotes = newDoctorNotes;
    }

// 8. Getters and Setters:
//    - Standard getter and setter methods are provided for all fields: id, patientName, medication, dosage, doctorNotes, and appointmentId.
//    - These methods allow access and modification of the fields of the Prescription class.


}
