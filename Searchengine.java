import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.


    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return String.format("What do you wanna search for?");
        } else if (url.getPath().equals("/Riddhi")) {
            return String.format("Riddhi found!");
        } else if (url.getPath().equals("/Aditi")) {
            return String.format("Aditi found!");
        } else if (url.getPath().equals("Kevin")) {
            return String.format("Kevin found!");
        } else if (url.getPath().equals("Kevin1")) {
            return String.format("Mehdi found!");
        } else if (url.getPath().equals("Kevin1")) {
            return String.format("Mehdi found!");
        } else {
            return String.format("Sorry, not found!");
        }
    }
}

class NumberServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
