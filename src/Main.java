import java.util.Calendar;

public class Main {
    static String time() {
        String time = Calendar.getInstance().getTime().toString();

        return time.substring(11, 19);
    }

    public static void main(String[] args) {
        // Skapa en metod som returnerar vad klockan är och använd den
        // för att skriva ut: "Klockan är: tt:mm:ss"

        System.out.println("Klockan är: " + time());
    }
}