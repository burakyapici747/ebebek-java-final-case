package repository;


public class Config {
    private static ProductRepository productRepositoryInstance;
    private static ProductGroupRepository productGroupRepositoryInstance;
    private static BrandRepository brandRepositoryInstance;

    public static ProductRepository getProductRepositoryInstance(){
        if(productRepositoryInstance == null){
           productRepositoryInstance = new ProductRepository();
        }
        return productRepositoryInstance;
    }
    public static ProductGroupRepository getProductGroupRepositoryInstance(){
        if(productGroupRepositoryInstance == null){
            productGroupRepositoryInstance = new ProductGroupRepository();
        }
        return productGroupRepositoryInstance;
    }
    public static BrandRepository getBrandRepositoryInstance(){
        if(brandRepositoryInstance == null){
            brandRepositoryInstance = new BrandRepository();
        }
        return brandRepositoryInstance;
    }
}
