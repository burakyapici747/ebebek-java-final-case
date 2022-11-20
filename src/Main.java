import service.ProductGroupService;
import service.ProductService;

import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    private static final String STORE_NAME = "Patika Store";
    private static Scanner scanner = new Scanner(System.in);
    private static ProductService productService = new ProductService();
    private static ProductGroupService productGroupService = new ProductGroupService();

    public static void main(String[] args) {
        System.out.println(STORE_NAME + " Sanal Mağazasına Hoşgeldiniz!");
        selectTransactionType();
    }

    public static void productTransactions(){
        System.out.println("[1] ÜRÜNLERİ LİSTELE, " + "[2] ID İLE ÜRÜN ARAMA, " + "[3] GRUP ADI İLE ÜRÜN LİSTELE"+ "[4] ÜRÜN SİL");
        switch (scanner.nextInt()){
            case 1:
                writeList(productService.getAllProduct());
                selectTransactionType();
                break;
            case 2:
                System.out.println("Lütfen ürün ID giriniz!");
                System.out.println(productService.findById(UUID.fromString(scanner.next())).toString());
                selectTransactionType();
                break;
            case 3:
                System.out.println("Lütfen grup ismi giriniz!");
                writeList(productService.getProductsByGroupName(scanner.next()));
                selectTransactionType();
                break;
            case 4:
                productService.deleteById(UUID.fromString(scanner.next()));
                selectTransactionType();
                break;
            default:
                selectTransactionType();
                break;
        }
    }

    public static void productGroupTransactions(){
        System.out.println("[1] ÜRÜN GRUPLARINI LİSTELE, " + "[2] ID İLE ÜRÜN GRUBU ARAMA, " + "[3] ÜRÜN GRUBUNU SİL");
        switch (scanner.nextInt()){
            case 1:
                writeList(productGroupService.getAllProductGroups());
                selectTransactionType();
                break;
            case 2:
                System.out.println("Lütfen ürün grup ID giriniz!");
                System.out.println(productGroupService.findById(UUID.fromString(scanner.next())));
                selectTransactionType();
                break;
            case 3:
                System.out.println("Lütfen silmek istediğiniz ürün grubu ID giriniz!");
                productGroupService.deleteById(UUID.fromString(scanner.next()));
                selectTransactionType();
                break;
            default:
                selectTransactionType();
                break;
        }
    }

    public static void selectTransactionType(){
        System.out.println("[1] Ürün işlemleri, " + "[2] Ürün grup işlemleri");
        switch (scanner.nextInt()){
            case 1:
                productTransactions();
                break;
            case 2:
                productGroupTransactions();
                break;
            default:
                selectTransactionType();
                break;
        }
    }

    private static <T> void writeList(List<T> list){
        list.forEach(item -> System.out.println(item.toString()));
    }

}
