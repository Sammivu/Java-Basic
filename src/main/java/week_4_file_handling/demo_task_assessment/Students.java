package week_4.demo_task_assessment;

public class Students {
    private int  admissionId;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String gender;
    private int age;

    public Students(int admissionId, String firstName, String lastName, String dateOfBirth, String gender, int age) {
        this.admissionId = admissionId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.age = age;
    }

    public int getAdmissionId() {
        return admissionId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "addimisionId=" + admissionId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateofBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
