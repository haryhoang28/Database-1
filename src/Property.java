import java.util.ArrayList;

public class Property {

    String name;
    ArrayList<Integer> integerNum = new ArrayList<>();
    ArrayList<Double> doubleNum = new ArrayList<>();
    ArrayList<String> varChar = new ArrayList<>();

    public Property(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void addElement(Object object){
        if(object instanceof Integer){
            integerNum.add((int) object);
        }else if(object instanceof Double){
            doubleNum.add((double) object);
        }else if(object instanceof String){
            varChar.add((String) object);
        }
    }

    public Object getElement(int index){
        int mainProperty = Math.max(Math.max(integerNum.size(),doubleNum.size()),varChar.size());
        int intSize = integerNum.size();
        int doubleSize = doubleNum.size();
        int charSize = varChar.size();
        if(mainProperty == intSize){
            return integerNum.get(index);
        }else if(mainProperty == doubleSize){
            return doubleNum.get(index);
        }else if(mainProperty == varChar.size()){
            return varChar.get(index);
        }
        return null;
    }
}
