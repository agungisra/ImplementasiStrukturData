public class Lagu {
    private String judulLagu;
    private String namaPenyanyi;

    public Lagu(String judulLagu, String namaPenyanyi) {
        this.judulLagu = judulLagu;
        this.namaPenyanyi = namaPenyanyi;
    }

    public Object getjudulLagu() {
        return judulLagu;
    }

    @Override
    public String toString() {
        return "Lagu{" +
                "judulLagu='" + judulLagu + '\'' +
                ", namaPenyanyi='" + namaPenyanyi + '\'' +
                '}';
    }
}