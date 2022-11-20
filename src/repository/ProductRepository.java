package repository;

import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ProductRepository {
    private List<Product> products = new ArrayList<>();
    private List<Brand> brands = new ArrayList<>();
    private BrandRepository brandRepository = Config.getBrandRepositoryInstance();
    private List<ProductGroup> productGroup = Config.getProductGroupRepositoryInstance().productGroups;
    public ProductRepository(){
        List<Brand> brands = brandRepository.getAll();
        brands.add(new Brand(UUID.randomUUID(), "Samsung"));
        brands.add(new Brand(UUID.randomUUID(), "Lenovo"));
        brands.add(new Brand(UUID.randomUUID(), "Apple"));
        brands.add(new Brand(UUID.randomUUID(), "Huawei"));
        brands.add(new Brand(UUID.randomUUID(), "Casper"));
        brands.add(new Brand(UUID.randomUUID(), "Asus"));
        brands.add(new Brand(UUID.randomUUID(), "HP"));
        brands.add(new Brand(UUID.randomUUID(), "Xiaomi"));
        brands.add(new Brand(UUID.randomUUID(), "Monster"));

        products.add(new MobilePhone(UUID.randomUUID(),
                10.388,
                1.0,
                300,
                "Samsung Galaxy A53",
                productGroup.get(1),
                brands.get(1),
                128,
                6.5,
                5000,
                8,
                Color.WHITE.getName()));
        products.add(new Notebook(UUID.randomUUID(),
                13.000,
                5.0,
                100,
                "Lenovo ideapad",
                productGroup.get(0),
                brands.get(1),
                12.0,
                256.0,
                MemoryType.SSD,
                15.6));
        products.add(new Notebook(UUID.randomUUID(),
                19.000,
                3.0,
                100000,
                "Macbook air",
                productGroup.get(0),
                brands.get(2),
                8.0,
                256.0,
                MemoryType.SSD,
                13.3));
        products.add(new Notebook(UUID.randomUUID(),
                16.000,
                7.0,
                1000,
                "Huawei Matebook D15",
                productGroup.get(0),
                brands.get(3),
                16.0,
                512.0,
                MemoryType.SSD,
                15.6));
        products.add(new Notebook(UUID.randomUUID(),
                12.505,
                8.0,
                1000,
                "Casper Nirvana C600",
                productGroup.get(0),
                brands.get(4),
                8.0,
                512.0,
                MemoryType.SSD,
                15.6));
        products.add(new Notebook(UUID.randomUUID(),
                21.999,
                4.0,
                1000,
                "Asus ROG Strix G15",
                productGroup.get(0),
                brands.get(5),
                8.0,
                512.0,
                MemoryType.SSD,
                15.6));
        products.add(new Notebook(UUID.randomUUID(),
                16.199,
                9.0,
                100,
                "Hp Pavilion Gaming",
                productGroup.get(0),
                brands.get(6),
                16.0,
                512.0,
                MemoryType.SSD,
                15.6));
        products.add(new MobilePhone(UUID.randomUUID(),
                16.199,
                9.0,
                100,
                "Xiaomi Redmi Note 11 Pro",
                productGroup.get(1),
                brands.get(7),
                128,
                6.67,
                5160,
                8,
                Color.RED.getName()
                ));
        products.add(new Notebook(UUID.randomUUID(),
                18.699,
                18.0,
                10000,
                "Abra A5 V17.2",
                productGroup.get(0),
                brands.get(8),
                8.0,
                512.0,
                MemoryType.SSD,
                15.6));
    }

    public Product createProduct(Product product){
        products.add(product);
        return product;
    }

    public List<Product> getAll(){
        return products;
    }

    public Optional<Product> getById(UUID id){
        Optional<Product> productOptional = products.stream()
                .filter(product->product.getId().equals(id))
                .findFirst();
       return productOptional;
    }

    public Optional<Product> getByName(String name){
        Optional<Product> productOptional = products.stream()
                .filter(product->product.getName().equals(name))
                .findFirst();
        return productOptional;
    }

    public void deleteById(UUID id){
        products.remove(getById(id).get());
    }
}
