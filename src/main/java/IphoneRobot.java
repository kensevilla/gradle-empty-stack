public class IphoneRobot {
    public Iphone getIphone() {
        return iphone;
    }

    public void setIphone(Iphone iphone) {
        this.iphone = iphone;
    }

    private Iphone iphone;

    public void makeCall(){
        iphone.call("IphoneRobot called");
    }
}
