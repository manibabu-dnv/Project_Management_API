package Service;

import Repositry.ProductRepo;
import com.example.demo.Product;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class ProductService {
    private final ProductRepo Rpro;


    @Autowired
    public ProductService(ProductRepo Rpro) {
        this.Rpro = Rpro;
    }

    public Product createProduct(Product product) {
        if(product.getName() == null || product.getName().isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be null or empty");
        }
        return Rpro.Save(product);
    }


    public List<Product> getAllProducts() {
        return Rpro.findall();
    }
}
