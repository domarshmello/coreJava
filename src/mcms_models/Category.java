package mcms_models;

public class Category {
    private int id;
    private  int partent_id;
    private String name;
    private boolean status;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPartent_id() {
        return partent_id;
    }

    public void setPartent_id(int partent_id) {
        this.partent_id = partent_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
