package Phones;

public class StationaryPhone extends Phone implements Standard{

    public StationaryPhone(String producer, String color) {
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
