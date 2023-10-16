package HomeworkOOPs6;

import java.io.FileWriter;
import java.io.IOException;

public class SaveInquiry {

    
    private Order2 order;

    public SaveInquiry (Order2 order) {
        this.order = order;
    }

    public SaveInquiry () {

    }

    public void saveToJson() {
        String fileName = "order2.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ order.getClientName() + "\",\n");
            writer.write("\"product\":\""+ order.getProduct()+"\",\n");
            writer.write("\"qnt\":"+ order.getQnt() +",\n");
            writer.write("\"price\":"+ order.getPrice() +"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
