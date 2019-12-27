package Source;

public class Link {
    int data;
    Link next;
    Link prev;

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public Link(int data) {
        this.data = data;
    }
}
