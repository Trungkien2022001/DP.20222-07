package utils;

public class RequestFactory {
    Request request = null;
    public static Request getRequest (String type){
        switch (type) {
            case 'GET' :
                request = new GetRequest();
                break;
            case 'POST':
                request = new PostRequest();
                break;
            
            // Nếu cần mở rộng thì chỉ cần define một method connection mới
            case 'PUT':
            case 'PATCH':
            case "DELETE":
            case "OPTION":
                break;
            default:
                break;
        }
        return request;
}

