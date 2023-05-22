package Telesko.FindProductSpring;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReposInterface extends JpaRepository<Product, Long>
{
    

}
