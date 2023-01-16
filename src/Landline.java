public class Landline implements Phone{
    String myPhoneNo;
    boolean  isRinging;
    boolean isPowerOn;

    public Landline(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
        isRinging = false;
        isPowerOn = true;
    }

    public String getMyPhoneNo() {
        return myPhoneNo;
    }

    public void setMyPhoneNo(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    @Override
    public void powerOn() {
        this.isPowerOn = true;
    }

    @Override
    public void callNumber(String phoneNo) {
        if(isPowerOn){
            System.out.println("You are dailing the number: " + phoneNo);
        }
        else {
            System.out.println("Your landline is OFF");
        }

    }

    @Override
    public void receiveCall(String phoneNo) {
        if(isPowerOn && myPhoneNo.equals(phoneNo)){
            System.out.println("Hey! "+myPhoneNo+" You are receiving a call");
            isRinging = true;
        }
        else {
            System.out.println("call not receive");
        }
    }

    @Override
    public boolean answerCall() {
        if(isRinging){
            System.out.println("You are answering a call");
            isRinging = false;
            return true;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
