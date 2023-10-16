package HomeworkOOPs6;

import java.util.Scanner;

public class InputConsole {
    
    private Order2 order = new Order2();
    private Scanner scanner = new Scanner(System.in);

    public InputConsole(Order2 order) {
        this.order = order;
    }

    public InputConsole(){

    }

    public void inputFromConsole() {
        order.clientName = prompt("Имя клиента: ");
        order.product = prompt("Продукт: ");
        order.qnt = Integer.parseInt(prompt("Кол-во: "));
        order.price = Double.parseDouble(prompt("Цена: "));
    }


    private String prompt(String message){
        System.out.print(message);
        return scanner.nextLine();
    }
}
