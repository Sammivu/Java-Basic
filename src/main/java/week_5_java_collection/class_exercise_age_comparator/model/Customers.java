package week_5_java_collection.class_exercise_age_comparator.model;

public class Customers {
    private  String fullName;

    private boolean isCustomerOld;

    private boolean isCustomerYoung;

    public Customers(String fullName, boolean isCustomerOld, boolean isCustomerYoung) {
        this.fullName = fullName;
        this.isCustomerOld = isCustomerOld;
        this.isCustomerYoung = isCustomerYoung;
    }

    public String getFullName() {
        return fullName;
    }

    public boolean isCustomerOld() {
        return isCustomerOld;
    }

    public boolean isCustomerYoung() {
        return isCustomerYoung;
    }
}
