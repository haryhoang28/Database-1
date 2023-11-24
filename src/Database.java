import java.util.ArrayList;
import java.util.Scanner;

public class Database {
    ArrayList<Table> tables = new ArrayList<>();

    public String toString(){
        String res = "List Table : \n";
        for(int i=0;i<tables.size();i++){
            res+=("\t +" + tables.get(i).getTableName() + "\n");
        }
        return res;
    }
    public void addTable(Table table){
        tables.add(table);
    }

    public static void main(String[] args) {
        Database db = new Database();
        Table svien = new Table("sinh_vien");
        Table qlda = new Table("qly_du_an");
        Table fb = new Table("football");
        db.addTable(svien);
        db.addTable(qlda);
        db.addTable(fb);
        System.out.println(db);
        System.out.println("Bạn muốn vào bảng nào : ");
        Scanner input = new Scanner(System.in);
        String tableName = input.nextLine();
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
        if(tableName.equals("sinh_vien")){
            System.out.println(table);
        }
    }
}
