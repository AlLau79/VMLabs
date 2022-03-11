public abstract class Car {
    private int speed;
    private boolean engineState;

    public abstract void setSpeed(int speed);

    public int getSpeed(){
        return speed;
    }

    public boolean engineState(){
        return engineState;
    }

}
