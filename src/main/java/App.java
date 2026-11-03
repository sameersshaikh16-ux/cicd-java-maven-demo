
public class App {

    public String getMessage() {
        return "Java application is running successfully!";
    }

    public static void main(String[] args) {

        System.out.println("Assalamu Alaikum! Welcome to my first CI/CD project.");

        App app = new App();
        System.out.println(app.getMessage());
    }
}
