package HomeAssignment;

public class APIClient {
    
    public void sendRequest(String endpoint) {
        System.out.println("Sending request to endpoint: " + endpoint);
    }

    
    public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
        System.out.println("Sending request to endpoint: " + endpoint);
        System.out.println("Request body: " + requestBody);
        System.out.println("Request status: " + (requestStatus ? "Success" : "Failure"));
    }

    public static void main(String[] args) {
       APIClient apiClient = new APIClient();
        apiClient.sendRequest("https://api.example.com/data");
        apiClient.sendRequest("https://api.example.com/data", "{ \"key\": \"value\" }", true);
    }


}
