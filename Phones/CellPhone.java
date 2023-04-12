package Phones;

public class CellPhone extends Phone implements Call{
    private String type;

    public CellPhone(String producer, String color, String type) {
        super(producer, color);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
