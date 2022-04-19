public class Item implements Comparable<Item> {

    private String cod;

    public Item(String cod) {
        this.cod = cod;
    }

    @Override
    public String toString() {
        return "Item [cod=" + cod + "]";
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public int compareTo(Item c) {
        return this.cod.compareTo(c.getCod());
    }

}