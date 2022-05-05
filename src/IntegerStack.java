import java.util.ArrayList;

public class IntegerStack {
    private ArrayList<Integer> values;

    public IntegerStack (){
        this.values = new ArrayList<>();
    }

    public void push (Integer element){
        this.values.add(element);
    }

    public  Integer pop (){
        return this.values.remove(this.values.size()-1);
    }
}
