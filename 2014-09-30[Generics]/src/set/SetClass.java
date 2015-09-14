/**
 * 
 */
package set;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author SmPatel
 *
 */
public class SetClass {

	/**
	 * @param args
	 */	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Price> lhs = new HashSet<Price>();
        lhs.add(new Price("Banana", 20));
        lhs.add(new Price("Banana", 20));
        lhs.add(new Price("Banana", 20));
        
              
        System.out.println(lhs.size());
        Price i;
        for(Price pr:lhs){
            System.out.println(pr);
        }
       
		
	}

}
class Price{
    
    private String item;
    private int price;
     
    public Price(String itm, int pr){
        this.item = itm;
        this.price = pr;
    }       
    public int hashCode(){        
        int hashcode = 0;
        hashcode = price;
        hashcode += item.hashCode();
        return hashcode;
    }
     
    public boolean equals(Object obj){        
        if (obj instanceof Price) {
            Price pp = (Price) obj;
            return (pp.item.equals(this.item) && pp.price == this.price);
        } else {
            return false;
        }
    }
     
    /*public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }*/
     
    public String toString(){
        return "item: "+item+"  price: "+price;
    }

}
