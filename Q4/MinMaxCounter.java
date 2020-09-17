public class MinMaxCounter extends Counter{
    private int min;
    private int max;

    public MinMaxCounter(int min, int max){
        super(min);
        this.min = min;
        this.max = max;
    }

    public void increment(){
        if(this.getValue() == max){
            this.setValue(max);
        } else{
            int placeHolder = this.getValue();
            placeHolder++;
            this.setValue(placeHolder);
        }
    }

    public void decrement(){
        if(this.getValue() == min){
            this.setValue(min);
        } else{
            int placeHolder = this.getValue();
            placeHolder--;
            this.setValue(placeHolder);
        }
    }
}