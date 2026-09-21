<details>
<summary>Section 1: Architecture Summary – a short paragraph describing the design in your own words.</summary><br>
Start by defining the dashboards whih will be loaded as HTML via thymeleaf which will be the AdminDashboard and DoctorDashboard. Next define the JSON based REST modules which will are the Appointments and PatientDashboard modules. For the Dashboards use Thymeleaf controllers to call these to the service layer, similarly use RESt controllers to call the REST modules. Define the following MySQL Repository. Starting with the MySQL database of formatted informaton, define MySQL models with classes for Patient, Doctor, Appointment, Admin. Define the following MongoDB Repository. Starting with the MongoDB database, define MongoDB models with a class for Prescription. The service layer then uses both of these repositories to manage the backend.<br>
</details>


<details>
<summary>Section 2: Numbered Flow – list each step in the request/response cycle from frontend to database.</summary><br>
Step 1: User Interface Layer <br>
Step 2: Controller Layer <br>
Step 3: Service Layer <br>
Step 4: Repository Layer <br>
Step 5: Database Access <br>
Step 6: Model Binding <br>
Step 7: Application Models <br>
</details>
