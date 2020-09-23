import java.util.ArrayList;

public class Graphique {
    private Rectangle graphique;
    private ArrayList<Item> items;

    public Graphique(Rectangle graphique) {
        this.graphique = graphique;
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void moveTo(int translationX, int translationY) {
        for(Item i : items) {
            i.moveTo(translationX, translationY);
        }
    }

    public Rectangle getGraphique() {
        return graphique;
    }

    @Override
    public String toString() {
        return "Graphique{" +
                "\n - Rectangle =" + graphique +
                "\n - Lignes =" + items +
                '}';
    }
}
