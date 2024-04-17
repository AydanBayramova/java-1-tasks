package module01.Part02.genericss;

public class genericss <A>{
    private A data;

    public genericss(A data) {
        this.data = data;
    }

    public A getData() {
        return data;
    }

    public void setData(A data) {
        this.data = data;
    }
}
