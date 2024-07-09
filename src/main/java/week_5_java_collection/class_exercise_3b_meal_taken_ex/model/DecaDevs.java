package week_5_java_collection.class_exercise_3b_meal_taken_ex.model;

public class DecaDevs {
    private String fullName;
    private boolean isFemale;
    private boolean isMale;

    public DecaDevs(String fullName, boolean isFemale, boolean isMale) {
        this.fullName = fullName;
        this.isFemale = isFemale;
        this.isMale = isMale;
    }

    public String getFullName() {
        return fullName;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public boolean isMale() {
        return isMale;
    }
}
