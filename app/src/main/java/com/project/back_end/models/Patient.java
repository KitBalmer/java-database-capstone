package com.project.back_end.models;

public class Patient {
    @Entity
// @Entity annotation:
//    - Marks the class as a JPA entity, meaning it represents a table in the database.
//    - Required for persistence frameworks (e.g., Hibernate) to map the class to a database table.
    private Long id{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    }
// 1. 'id' field:
//    - Type: private Long
//    - Description:
//      - Represents the unique identifier for each patient.
//      - The @Id annotation marks it as the primary key.
//      - The @GeneratedValue(strategy = GenerationType.IDENTITY) annotation auto-generates the ID value when a new record is inserted into the database.
    private String name{
        @NotNull
        @Size(min = 3, max = 100)
    }
// 2. 'name' field:
//    - Type: private String
//    - Description:
//      - Represents the patient's full name.
//      - The @NotNull annotation ensures that the patient's name is required.
//      - The @Size(min = 3, max = 100) annotation ensures that the name length is between 3 and 100 characters. 
//      - Provides validation for correct input and user experience.

private String email{
    @NotNull
    @Email
}
// 3. 'email' field:
//    - Type: private String
//    - Description:
//      - Represents the patient's email address.
//      - The @NotNull annotation ensures that an email address must be provided.
//      - The @Email annotation validates that the email address follows a valid email format (e.g., patient@example.com).
    private String password{
        @NotNull
        @Size(min = 6)
        @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    }
// 4. 'password' field:
//    - Type: private String
//    - Description:
//      - Represents the patient's password for login authentication.
//      - The @NotNull annotation ensures that a password must be provided.
//      - The @Size(min = 6) annotation ensures that the password must be at least 6 characters long.

    private String phone{
        @NotNull
        @Pattern(regexp = "^[0-9]{10}$") 
    }
// 5. 'phone' field:
//    - Type: private String
//    - Description:
//      - Represents the patient's phone number.
//      - The @NotNull annotation ensures that a phone number must be provided.
//      - The @Pattern(regexp = "^[0-9]{10}$") annotation validates that the phone number must be exactly 10 digits long.

    private String address{
        @NotNull
        @Size(max = 255)
    }
// 6. 'address' field:
//    - Type: private String
//    - Description:
//      - Represents the patient's address.
//      - The @NotNull annotation ensures that the address must be provided.
//      - The @Size(max = 255) annotation ensures that the address does not exceed 255 characters in length, providing validation for the address input.

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getSpecialty() {
        return patient
    }
    public String getEmail() {
        return email
    }
    public String getPassword() {
        return password
    }
    public String getPhone() {
        return phone
    }
    public List<String> getAvailableTimes() {
        return availableTimes
    }

    public void setId(String newId) {
        this.id = newId;
    }
    public void setName(String newName) {
        this.name = newName;
    }
    public void setSpecialty(String newSpecialty) {
        this.specialty = newSpecialty;
    }
    public void setEmail(String newEmail) {
        this.email = newEmail;
    }
    public void setPassword(String newPassword) {
        this.password = newPassword;
    }
    public void setPhone(String newPhone) {
        this.phone = newPhone;
    }
    public void setAvailableTimes(String newAvailableTimes) {
        this.availableTimes = newAvailableTimes;
    }

// 7. Getters and Setters:
//    - Standard getter and setter methods are provided for all fields: id, name, email, password, phone, and address.
//    - These methods allow access and modification of the fields of the Patient class.

  

}
