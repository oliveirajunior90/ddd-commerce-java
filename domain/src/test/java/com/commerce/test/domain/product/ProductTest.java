package test.java.com.commerce.test.domain.product;

import com.commerce.domain.product.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import main.java.com.commerce.domain.exceptions.DomainException;

public class ProductTest {

    @Test
    public void givenAValidParams_whenCallNewProduct_thenInstantiateAProduct() {
        final var expectedName = "Iphone 14";
        final var expectedPrice = 7000.00;

        var product = Product.newProduct(expectedName, expectedPrice);

        Assertions.assertNotNull(product);
        Assertions.assertEquals(expectedName, product.getName());
        Assertions.assertEquals(expectedPrice, product.getPrice());
    }

    public void givenAValidParams_instantiateAProductAndChangeNameAndPrice() {
        final var expectedName = "Iphone 15";
        final var expectedPrice = 9000.00;

        var product = Product.newProduct("Iphone 14", 7000.00);
        product.changeName(expectedName);
        product.changePrice(expectedPrice);

        Assertions.assertNotNull(product);
        Assertions.assertEquals(expectedName, product.getName());
        Assertions.assertEquals(expectedPrice, product.getPrice());
    }

    public void givenAnInvalidNullName_whenCallNewCategoryAndValidate_thenShouldReceiveError() {
        final String expectedName = null;
        final var expectedPrice = 9000.00;

        final var product = Product.newProduct(expectedName, expectedPrice);

        final var errException = Assertions.assertThrows(DomainException.class, () -> product.validate());

        Assertions.assertEqual("'name' should not be null", errException.getErrors.get(0));

    }

}
