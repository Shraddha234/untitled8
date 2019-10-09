package main;

public class Ledstrip {
    private LED[] ledstrip;
    private int lengthOfStrip(){
        return ledstrip.length;
    }
    private  int numberOfDefectiveLEDs() {
        int counter=0;
        for (LED led : ledstrip) {
            if(!led.isWorking()){
                counter++;
            }
        }
        return counter;
    }
    private boolean isStripDefective(){
        return numberOfDefectiveLEDs()>(lengthOfStrip()/2);
    }
    public void printStripStatus(){
        if(isStripDefective()==false){
            System.out.println("This strip is not defective!");
        }
        else
            System.out.println("This strip is defective!");
    }
    public Ledstrip(LED[] ledstrip){
        this.ledstrip=ledstrip;
    }

    public LED[] getLedstrip() {
        return ledstrip;
    }

    public void setLedstrip(LED[] ledstrip) {
        this.ledstrip = ledstrip;
    }
}
