package com.company;
public class Main {
    public static SortedLinkedList products = new SortedLinkedList();
    public static void main(String[] args) {
       String petType;
        String option;
        do {
            System.out.println("0: quit");
            System.out.println("1: add new product");
            System.out.println("2: Find product");
            System.out.println("3: remove product");
            System.out.println("4: display products");
            option = Input.getString("option: ").trim();
            switch (option) {
                case "0":
                    System.out.println("quitting program");
                    break;
                case "1":
                   addProduct();
                    break;

                case "2":
                    findProduct();
                    break;
                case "3":
                    removeProduct();
                    break;
                case "4":
                    displayProducts();
                    break;


                default:
                    System.out.println("invalid option");
            }
        } while (!option.equals("0"));
    }

private static void addProduct(){

        String productCode, productName;
        int stock;
        productCode = Input.getString("Type in product code : ");
        productName = Input.getString("Type in product name : ");
        stock = Input.getInteger("Type in number in stock: ");
        try{
            products.insert(new Product(productCode,productName,stock));
        }catch (SortedADT.NotUniqueException e){
            System.out.println("This product already exists in the product list");
        }

}
private static void findProduct(){
        String productName = Input.getString("Type in the name of the product: ");
        try{
            products.find(new Product("000",productName,0));
            System.out.println(productName + " Found!");
        }catch (SortedADT.NotFoundException e){
            System.out.println(productName + " Not found!!");
        }

}

private static void removeProduct(){
        String productName = Input.getString("Type in the name of the product you want to remove: ");
        try{
            products.remove(new Product("0",productName,0));
            System.out.println(productName + " successfully removed!");
        }catch (SortedADT.NotFoundException e){
            System.out.println(productName + " not found in the product list");

        }
}

private static void displayProducts(){
    if(products.isEmpty()){
        System.out.println("Product list is empty");
    }else{
        System.out.println(products);
    }
}
}


