package client;

/**
 * Created by kobi626 on 25/10/2016.
 */
public class Answer {
    private int type;
    private String data;

    public Answer() { }

    public Answer(int type, String data) {
        this.type = type;
        this.data = data;
    }

    /**
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }


}
