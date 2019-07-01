package models;

public class Cars {

    private Integer id;
    private String marka;
    private String model;

    public Integer getId() {
        return id;
    }
    public String getMarka() {
        return marka;
    }
    public String getModel() {
        return model;
    }
    public void setMarka(String marka) {
        this.marka = marka;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setId(Integer id) {
        this.id = id;
    }
}