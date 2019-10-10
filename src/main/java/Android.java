public class Android extends Mobile{
    private int messageLengthLimit = 15;
    @Override
    public void call(String message){
        if(message.length() < messageLengthLimit) System.out.println("<Android>Message: " + message);
        else lengthLimitAlert();
    }

    public void lengthLimitAlert() {
        System.out.println("<Android> Message cannot be sent");
    }
}