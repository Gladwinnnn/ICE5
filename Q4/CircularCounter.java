public class CircularCounter extends Counter{
    private int limit;

    public CircularCounter(int limit){
        super(0);
        this.limit = limit;
    }

    public void increment(){
        if(this.getValue() == limit){
            this.setValue(0);
        } else{
            int placeHolder = this.getValue();
            placeHolder++;
            this.setValue(placeHolder);
        }
    }

    public void decrement(){
        if(this.getValue() == 0){
            this.setValue(limit);
        } else{
            int placeHolder = this.getValue();
            placeHolder--;
            this.setValue(placeHolder);
        }
    }
}