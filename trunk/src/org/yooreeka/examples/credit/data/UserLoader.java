package org.yooreeka.examples.credit.data;


import java.util.List;

import org.yooreeka.config.YooreekaConfigurator;
import org.yooreeka.examples.credit.data.users.User;
import org.yooreeka.examples.credit.util.CreditDataUtils;


public class UserLoader {

    public static final String TRAINING_USERS_FILE = 
    		YooreekaConfigurator.getHome()+"/data/ch06/training-users.txt";
    
    public static final String TEST_USERS_FILE = 
    		YooreekaConfigurator.getHome()+"/data/ch06/test-users.txt";

    public static List<User> loadUsers(String filename) {
        return CreditDataUtils.loadUsers(filename);
    }
    
    public static UserDataset loadTrainingDataset() {
        List<User> allUsers = loadUsers(TRAINING_USERS_FILE);
        return new UserDataset(allUsers);
    }

    public static UserDataset loadTrainingDataset(String filename) {
        List<User> allUsers = loadUsers(filename);
        return new UserDataset(allUsers);
    }

    public static UserDataset loadTestDataset() {
        List<User> allUsers = loadUsers(TEST_USERS_FILE);
        return new UserDataset(allUsers);
    }

    public static UserDataset loadTestDataset(String filename) {
        List<User> allUsers = loadUsers(filename);
        return new UserDataset(allUsers);
    }
}
