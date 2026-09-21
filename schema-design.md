Here are some real-world actions that a clinic management system should support:

Registering patients and doctors
Scheduling and tracking appointments
Creating and managing prescriptions
Managing doctor availability and working hours
Storing notes or feedback
Possibly even chat records, payment history, or uploadable documents


## MySQL Database Design

### Table: patients
- id: INT, Primary Key, Auto Increment
- patient_name: STR,
- patient_age: INT,
- patient_email: STR
- patient_prescriptions: STR, Foreign Key → prescriptions(id)
- patient_booked_appointments: DATETIME, Foreign Key → appointmets(id)

### Table: doctors
- id: INT, Primary Key, Auto Increment
- doctor_name: STR,
- doctor_working_hours: DATETIME
- doctor_patients: STR, Foreign Key → Patients(id)
- doctor_booked_appointments: DATETIME, Foreign Key → appointmets(appointment_time)

### Table: admins
- id: INT, Primary Key, Auto Increment
- : STR,
- patient_surname: STR,
- patient_age: INT,
- patient_booked_appointments: DATETIME, Foreign Key → appointmets(id)

### Table: appointments
- id: INT, Primary Key, Auto Increment
- doctor_id: INT, Foreign Key → doctors(id)
- patient_id: INT, Foreign Key → patients(id)
- appointment_time: DATETIME, Not Null
- status: INT (0 = Scheduled, 1 = Completed, 2 = Cancelled)


### Table: prescriptions
- id: INT, Primary Key, Auto Increment
- prescription_name: STR
- prescription_side_affects: STR
- prescriptions_treatment_for: STR
- prescription_risk_index: INT (0 = No side affects, 1 = Minimal side affects, 2 = Moderate side affects, 3 = Notable side affects, 4 = Intense side affects, 5 = Prescribe under no circumstnaces)



## MongoDB Collection Design

### Table: logs
- id: INT, Primary Key, Auto Increment
- log_doctor: STR, Foreign Key → doctors(id)
- log_patient: STR, Foreign Key → patients(id)
- log_content: STR

### Table: logs
- id: INT, Primary Key, Auto Increment
- log_doctor: STR, Foreign Key → doctors(id)
- log_patient: STR, Foreign Key → patients(id)
- log_content: STR



### Collection: prescriptions





```json
{
  "_id": "ObjectId('64abc123456')",
  "patientName": "John Smith",
  "appointmentId": 51,
  "medication": "Paracetamol",
  "dosage": "500mg",
  "doctorNotes": "Take 1 tablet every 6 hours.",
  "refillCount": 2,
  "pharmacy": {
    "name": "Walgreens SF",
    "location": "Market Street"
  }
}
