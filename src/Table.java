import java.util.ArrayList;

public class Table {
    ArrayList<Property> properties = new ArrayList<>();
    String name;

    public Table(String name){
        this.name = name;
    }
    public String getTableName(){
        return this.name;
    }
    @Override
    public String toString() {
        String res = "| ";
        for(int i=0;i<properties.size();i++){
            res+=(String.format("%-20s",properties.get(i).getName()) + " | ");
        }
        res+="\n";
        for(int i=0;i<properties.size();i++){
            res+="| ";
            for(int j=0;j<properties.size();j++){
                res+=(String.format("%-20s",properties.get(j).getElement(i)) + " | ");
            }
            res+="\n";
        }
        return res;
    }

    public static void main(String[] args) {
        Property id = new Property("ID");
        id.addElement(1);
        id.addElement(2);
        id.addElement(3);
        id.addElement(4);
        Property ten = new Property("TENNV");
        ten.addElement("Tran Thanh Lam");
        ten.addElement("Nguyen Thua Tuan");
        ten.addElement("Nguyen Van Long");
        ten.addElement("Hoang Ngoc Long");
        Property year = new Property("NGAYSINH");
        year.addElement("22/09/2004");
        year.addElement("NULL");
        year.addElement("NULL");
        year.addElement("NULL");
        Property pb = new Property("PHONG");
        pb.addElement("7");
        pb.addElement("SIUU");
        pb.addElement("Cristiano");
        pb.addElement("Ronaldo");
        Table table = new Table("svien");
        table.properties.add(id);
        table.properties.add(ten);
        table.properties.add(year);
        table.properties.add(pb);
        System.out.println(table);

    }
}
