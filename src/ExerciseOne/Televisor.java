package ExerciseOne;

public class Televisor {
    private String status;

    public Televisor() {
        this.status = "Off";
    }

    public void turnOn(){
        status = "On";
    }

    public void turnOff(){
        status = "Off";
    }

    public void showStatus(){
        System.out.println("ExerciseOne.Televisor is: " + status);
    }
}
