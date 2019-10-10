public class Iphone extends Mobile{
    private int messageLengthLimit = 50;
    @Override
    public void call(String message){
        if(message.length() < messageLengthLimit) System.out.println("<Iphone>Message: " + message);
        else lengthLimitAlert();
    }

    public void lengthLimitAlert() {
        System.out.println("<Iphone> Message cannot be sent");
    }
}