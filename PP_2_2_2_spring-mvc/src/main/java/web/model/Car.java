package web.model;

public class Car {
    public String model;

    private String owner;
    private String code;

    public Car(String model,String owner,String code) {
        this.model = model;
        this.owner = owner;
        this.code = code;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Car - " +
                "model = '" + model + '\'' +
                "\nOwner= '" + owner + '\'' +
                "\nCode = '" + code + '\'';
    }
}
