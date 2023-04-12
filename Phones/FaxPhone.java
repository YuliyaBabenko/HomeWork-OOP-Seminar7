package Phones;

public class FaxPhone extends Phone implements Standard, Fax{

    public FaxPhone(String producer, String color) {
        super(producer, color);
    }
    
    @Override
    public void ring() {
        System.out.println("Звонит");;
    }

    @Override
    public void dial() {
        System.out.println("Набирает номер");;
    }

    @Override
    public void getConnected() {
        System.out.println("Подсоединился");;
    }

    @Override
    public void getDisconnected() {
        System.out.println("Соединение прервано");;
    }

    @Override
    public void sendFax() {
        System.out.println("Отправляет факс");;
    }

    @Override
    public void getFax() {
        System.out.println("Получает факс");;
    }
    
}
