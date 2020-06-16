
public class Item {

    private final String code;
    private final String name;

    public Item(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Item comparable = (Item) obj;

        if (this.code.equals(comparable.getCode())) {
            return true;
        }
        
        return false;
    }

    @Override
    public String toString() {
        return code + ": " + name;
    }
}
