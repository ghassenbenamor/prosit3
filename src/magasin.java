public class magasin {

    // attributes
    private int id;
    private String adress;
    private int capacity;
    private produit produits[];
    final int maxCapacity = 50;

    //constructors

    public magasin() {

    }
    public magasin (int id, String adress) {
        this.id = id;
        this.adress = adress;
        this.capacity = 0;
        this.produits = new produit[maxCapacity];
    }

    //getters

    public int getId() {
        return id;
    }

    public String getAdress() {
        return adress;
    }

    public int getCapacity() {
        return capacity;
    }

    //setters

    public void setId(int id) {
        this.id = id;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }


    // methods

    public void addProduct (produit produit) {
        if (capacity<maxCapacity && searchProduct(produit) == false) {
            produits[capacity] =  produit;
            capacity++;
        }
    }

    public void showMagasin () {
        System.out.println(this);
        for (int i = 0; i< capacity; i++) {
            System.out.println(produits[i]);

        }
        System.out.println("}");    }


    public void total () {
        System.out.println(this.capacity);
    }

    public boolean searchProduct(produit p) {
        boolean exist = false;
        for (int i=0; i<capacity;i++)
        {
            if(produits[i] == p) {
                exist = true;
                break;
            }
        }
        return exist;
    }
    public int searchProductById(int id) {
        int position = -1;
        for (int i=0; i < capacity; i++)
        {
            if(produits[i].getId() == id )
                position = i ;

        }
        return position;
    }

    public void deleteProduct(int id) {
        int position =  searchProductById(id);
        for(int i= position; i<capacity; i++)
        {
                produits[i] = produits[i+1];
        }
        produits[capacity] = null;
        capacity--;
    }

    public static void storeWithMostProducts(magasin m1,magasin m2) {
        if (m1.getCapacity() > m2.getCapacity())
            System.out.println("Magasin de "+ m1.getAdress() + " has more products");
            else if (m1.getCapacity() < m2.getCapacity())
            System.out.println("Magasin de "+ m2.getAdress()+ " has more products");
            else
            System.out.println("draw");
        }


    @Override
    public String toString() {
        return "Magasin{" + "id=" + id + ", address=" + adress + ", capacite=" + capacity + ", CAPACITE_MAX=" + maxCapacity + ", produits = {";
    }

}
