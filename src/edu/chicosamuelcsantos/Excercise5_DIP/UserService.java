package edu.chicosamuelcsantos.Excercise5_DIP;

public class UserService {
    private Logger logger;

    public UserService(Logger logger) {
        this.logger = logger;
    }

    public void createUser(String username) {
        logger.log("Created user: " + username);
    }
}