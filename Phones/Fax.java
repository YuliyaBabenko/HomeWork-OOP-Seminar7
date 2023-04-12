package Phones;

public class Fax extends Phone implements Call{

    public Fax(String producer, String color) {
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
    
}
