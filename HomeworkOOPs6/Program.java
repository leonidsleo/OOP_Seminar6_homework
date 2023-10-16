package HomeworkOOPs6;

public class Program {
    
    public static void main(String[] args) {

        // Order order = new Order();
        // order.inputFromConsole();
        // // order.saveToJson();
        // System.out.println("Информация по заказу успешно сохранена в файл.");

        Order2 order = new Order2();
        InputConsole inputConsole = new InputConsole(order);
        inputConsole.inputFromConsole();
        SaveInquiry saveInquiry = new SaveInquiry(order);
        saveInquiry.saveToJson();
        System.out.println("Информация по заказу успешно сохранена в файл order2.");
    }
        
}
