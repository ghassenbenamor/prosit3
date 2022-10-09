public class main {
    public static void main(String[] args) {
        produit p1 = new produit(1021,"lait","delice",1.3);
        produit p2 = new produit(2510,"yaourt","vitalait",0.7);
        produit p3 = new produit(3250,"tomate","sicam",1.250);
        produit p4 = new produit(1021,"lait","yab",1.3);
        magasin m1 = new magasin(1,"rades");
        magasin m2 = new magasin(2,"charguia");
        m1.addProduct(p1);
        m1.addProduct(p2);
        m1.addProduct(p3);
        m1.addProduct(p1);
        m1.showMagasin();
        m1.total();
        m1.showMagasin();
        p1.compareOne(p4);
        p1.compareOne(p2);
        produit.compareTwo(p1,p4);
        produit.compareTwo(p1,p2);
        m1.deleteProduct(2510);
        m1.showMagasin();
        m2.addProduct(p1);
        m2.addProduct(p2);
        m2.addProduct(p3);

        magasin.storeWithMostProducts(m1,m2);
    }
}
