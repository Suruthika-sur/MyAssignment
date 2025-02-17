package HomeAssignment;



public class JavaConnection extends MySQLDatabaseConnection implements DatabaseConnection {

	public static void main(String[] args) {
		JavaConnection cntn = new JavaConnection();
		cntn.disconnect();
		cntn.connect();
		cntn.executeUpdate();
		cntn.executeQuery("Connected to server successfully");
	}

	@Override
	public void connect() {
		System.out.println("Connecting...");
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnecting...");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Execute the updates...");
	}

}
