package ro.ase.cts.drona.singleton;

import java.util.*;

public class DroneConnection implements IDroneConnection {

    private boolean isConnected;
    private String currentConectedUser;
    private Map<String, Date> connectedUsersHistory;

    private static DroneConnection instance = null;

    private DroneConnection(){
        this.isConnected = false;
        this.currentConectedUser = null;
        this.connectedUsersHistory = new LinkedHashMap<>();
    }

    public static synchronized DroneConnection getInstance() {
        if(instance == null) {
            instance = new DroneConnection();
        }
        return instance;
    }

    @Override
    public void connect(String userName) {
        if(this.isConnected) {
            throw new RuntimeException("A user is already connected!");
        }
        this.isConnected = true;
        this.currentConectedUser = userName;
        this.connectedUsersHistory.put(userName,new Date());
    }

    @Override
    public void disconnect(String userName) {
        if(!userName.equals(this.currentConectedUser)) {
           throw new RuntimeException(userName + " is not connected!");
        }
        this.isConnected = false;
        this.currentConectedUser = null;
    }

    @Override
    public boolean isConnected(String userName) {
        return userName.equals(this.currentConectedUser);
    }

    @Override
    public void viewConnections() {
        for(Map.Entry<String,Date> entry : this.connectedUsersHistory.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
