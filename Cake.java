//Alenna - alenna.castaneda@oneidaihla.org
//for CTE software development 1
//instructor Mr Gross
import java.util.Collections;
import java.util.ArrayList;

public class Cake implements Comparable<Cake> {
    //creatting attributes
    String name;
    String flavor;
    int size;
    String sizeType;

    //constructor
    public Cake(String name,String flavor,String sizeType,int size) {
        this.name = name;
        this.flavor = flavor;
        this.sizeType = sizeType;
        this.size = size;
    }

    //putting attributes in a string
    public String toString() {
        return ("Name: "+name+", Order Size: "+sizeType+", Flavor: "+flavor+", Diameter: "+size);
    }
    
    @Override
    //comparing strings
    public int compareTo(Cake c) {
        // comparing if strings aren't equal
        if (this.name.compareTo(c.name) != 0 ) {
            return this.name.compareTo(c.name);
        } else { // comparing sizetype if strings are equal
            return this.sizeType.compareTo(c.sizeType);
        }
    }

    
}
class Driver {
    //running above code
    public static void main(String[] args) {
        //creating "cakeMenu" arraylist
        ArrayList<Cake> cakeMenu = new ArrayList<>();
        //adding 10 cakes to cakeMenu
        cakeMenu.add(new Cake("RazBurry", "raspberry", "regular", 8));
        cakeMenu.add(new Cake("Chocotack", "chocolate fudge", "regular", 8));
        cakeMenu.add(new Cake("Velvet", "red-velvet", "regular", 8));
        cakeMenu.add(new Cake("Snow", "vanilla", "regular", 8));
        cakeMenu.add(new Cake("Cookie", "chocolate chip cookie", "regular", 6));
        cakeMenu.add(new Cake("Chocotack", "chocolate fudge", "mini", 4));
        cakeMenu.add(new Cake("Blizzard", "cookies & cream", "regular", 10));
        cakeMenu.add(new Cake("Blizzard", "cookies & cream", "mini", 5));
        cakeMenu.add(new Cake("RazBurry", "raspberry", "mini", 4));
        cakeMenu.add(new Cake("Snow", "vanilla", "mini", 4));

        System.out.println("Unsorted Cake Menu");
        //printing the unsorted array
        print(cakeMenu);
        //adding a space
        System.out.println();

        //sorting the cakes
        Collections.sort(cakeMenu);
        System.out.println("Sorted Cake Menu");
        //printing the sorted array
        print(cakeMenu);
    }
    //printing cake method
    public static void print(ArrayList<Cake> cakeMenu) {
        for (int i = 0; i < cakeMenu.size(); i ++) {
            System.out.println(cakeMenu.get(i));
        }
    }
}