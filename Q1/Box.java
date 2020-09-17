public class Box{
    private int length;
    private int breadth;
    private int height;

    public Box(int length, int breadth, int height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public Object clone(){
        return new Box(length, breadth, height);
    }

    public boolean equals(Object another){
        if (!(another instanceof Box)){
            return false;
        } else{
            Box e = (Box)another;
            return (e.length == this.length && e.breadth == this.breadth && e.height == this.height);
        }
    }

    public String toString(){
        return "height: " + height + ", breadth " + breadth + ", length " + length;
    }
}