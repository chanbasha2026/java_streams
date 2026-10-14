package streams.com;

import java.util.List;

public class Product {
    private String name;
    private List<String> color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getColor() {
        return color;
    }

    public void setColor(List<String> color) {
        this.color = color;
    }

    public Product(String name, List<String> color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", color=" + color +
                '}';
    }
}
