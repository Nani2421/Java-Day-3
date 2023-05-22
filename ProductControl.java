package Telesko.FindProductSpring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductControl
{
    private final ProductServ productServ;

    @Autowired
    public ProductControl(ProductServ productServ)
    {
        this.productServ = productServ;
    }

    @PostMapping
    public void addProduct(@RequestBody Product product)
    {
        productServ.addProduct(product);
    }

    @GetMapping
    public List<Product> getAllProducts()
    {
        return productServ.getAllProducts();
    }

    @GetMapping("/{place}")
    public Product getProduct(@PathVariable String place)
    {
        return productServ.getProduct(place);
    }

    @GetMapping("/search/{text}")
    public List<Product> getProductWithText(@PathVariable String text)
    {
        return productServ.getProductWithText(text);
    }

    @GetMapping("/warranty/{year}")
    public List<Product> OutOfWarranty(@PathVariable int year)
    {
        return productServ.OutOfWarranty(year);
    }

    @GetMapping("/place/{place}")
    public List<Product> getProductsWithPlace(@PathVariable String place)
    {
        return productServ\.getProductsWithPlace(place);
    }
}
