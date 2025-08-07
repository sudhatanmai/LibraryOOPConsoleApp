public class User {
    private int userId;
    private String name;

    // Constructor
    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    // Getters
    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public void displayInfo() {
        System.out.println("User ID: " + userId + ", Name: " + name);
    }
}
