package random_practice.Replits.Repls.TjMax;

import java.util.ArrayList;
import java.util.List;

/**
 * represents TJMaxx store class.
 * https://tjmaxx.com/
 */
public class TJMaxx {

    /**
     * Private lists to hold regular Item objects
     * and OnSaleItem objects that represent items that sell in TJMaxx
     */
    private List<Item> regularItems;
    private List<OnSaleItem> onSaleItems;

    /**
     * Public no-args constructor - Instantiates regularItems and onSaleItems lists
     * as new ArrayList
     */
    public TJMaxx() {
        regularItems = new ArrayList<Item>();
        onSaleItems = new ArrayList<OnSaleItem>();
    }

    /**
     * adds an item object to regularItems list
     * @param item
     */
    public void addRegularItem(Item item) {
        regularItems.add(item);

    }

    /**
     * adds OnSaleItem object to onSaleItems list
     * @param item
     */
    public void addOnSaleItem(OnSaleItem item) {
        onSaleItems.add(item);

    }

    /**
     * getter for regularItems
     * @return
     */
    public List<Item> getRegularItems() {
        //TODO change from null
        return regularItems;
    }

    /**
     * getter for onSaleItems
     * @return
     */
    public List<OnSaleItem> getOnSaleItems() {
        //TODO change from null
        return onSaleItems;
    }

    /**
     * return count of regularItem object
     * @return
     */
    public int regularItemsCount() {
        //TODO change from -1
        return regularItems.size();
    }

    /**
     * returns count of onSaleItems in TJ Maxx
     * @return
     */
    public int onSaleItemsCount() {
        //TODO change from -1
        return onSaleItems.size();
    }

    /**
     * returns the name of each item in TJ Maxx starting
     * from regular item then onSaleItems
     * @return
     */
    public List<String> getAllItemNames() {
        List<String> allNames = new ArrayList<>();
        for(Item each: regularItems){
            allNames.add(each.getName());
        }
        for(OnSaleItem each: onSaleItems){
            allNames.add(each.getName());
        }

        return allNames;
    }

    /**
     * gets catalog number and returns price for the item
     * it will search for the item both regularItems and onsaleonSaleItems
     * @param catalogNumber
     * @returns 0.0 if product cannot be found with that catalognumber
     */
    public double getItemPrice(int catalogNumber)
    {

        for(Item each: regularItems){
            if (catalogNumber == each.getCatalogNumber()){
                return each.getPrice();
            }
        }

        for(OnSaleItem each: onSaleItems){
            if (catalogNumber == each.getCatalogNumber()){
                return each.getPrice();
            }
        }
//
//        regularItems.removeIf(each -> each.getCatalogNumber() == 2);
//
//
//        for (Iterator<Item> iterator = regularItems.iterator(); iterator.hasNext();) {
//            Item each = iterator.next();
//            if(each.getCatalogNumber() == catalogNumber) {
//                iterator.remove();
//            }
//        }

        return 0.0;
    }

    /**
     * accepts a name then searches
     * amoung onSaleItems. Once it finds, the method will return
     * that OnSaleItem object
     * @param name
     * @return
     */
    public OnSaleItem getOnSaleItem(String name)
    {
        for(OnSaleItem each : onSaleItems ){
            if(each.getName().equals(name)){
                return each;
            }
        }

        return null;
    }

    /**
     * removes the item with matching catalogNumber
     * from both regularItems and onSaleItems.
     * Does nothing if not found
     * @param catalogNumber
     */
    public void removeItem(int catalogNumber) {
        regularItems.removeIf( n -> n.getCatalogNumber() == catalogNumber);
        onSaleItems.removeIf( n -> n.getCatalogNumber() == catalogNumber);

    }

    /**
     * - it accepts a catalog number and finds that item
     * among regularItems and onSaleItems
     * - if it finds the item:
     *   - decrease the count of the Item by 1
     *   - if count reaches 0 after decrementing then remove the product(call removeItem method)
     *
     * @param catalogNumber
     */
    public void buyItem(int catalogNumber) {

        int m = -1;
        boolean found = false;

        for (int i = 0; i < regularItems.size(); i++) {
            if (regularItems.get(i).getCatalogNumber() == catalogNumber) {
                found = true;
                m = i;
            }
        }
        if (found) {
            Item item = regularItems.get(m);
            item.setQuantity(item.getQuantity() - 1);
            found = false;
            m = -1;
            if (item.getQuantity() <= 0) {
                removeItem(catalogNumber);

            }
        }

        for (int i = 0; i < onSaleItems.size(); i++) {
            if (onSaleItems.get(i).getCatalogNumber() == catalogNumber) {
                found = true;
                m = i;
            }
        }
        if (found) {
            OnSaleItem itemTwo = onSaleItems.get(m);
            itemTwo.setQuantity(itemTwo.getQuantity() - 1);
            found = false;
            m = -1;
            if (itemTwo.getQuantity() <= 0) {
                removeItem(catalogNumber);

            }
        }
    }





//        regularItems.removeIf(each -> each.getCatalogNumber() == 2);
//        for (Iterator<Item> iterator = regularItems.iterator(); iterator.hasNext();) {
//            Item each = iterator.next();
//            if(each.getCatalogNumber() == catalogNumber) {
//                each.setQuantity(each.getQuantity()-1);
//                if(each.getQuantity() <= 0){ removeItem(catalogNumber);}
//            }
//        }


//        for(Item each: regularItems){
//            if(each.getCatalogNumber() == catalogNumber){
//                each.setQuantity(each.getQuantity()-1);
//                if(each.getQuantity() <= 0){
//                    removeItem(catalogNumber);
//                }
//            }
//        }
//
//        for(Item each: onSaleItems){
//            if(each.getCatalogNumber() == catalogNumber){
//                each.setQuantity(each.getQuantity()-1);
//                if(each.getQuantity() <= 0){
//                    removeItem(catalogNumber);
//                }
//            }
//        }



}
