import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import com.accounts.GeoService;

public class GeoServiceTest {
    
    @Test
    public void testCilinderVolume() {
        assertEquals(251.3, GeoService.cilinderVolume(5,4), 0.1);

    }

    @Test
    public void testCubeVolume() {
        assertEquals(8, GeoService.cubeVolume(2));
    }

    @Test
    public void testSphereVolume() {

    }

    @Test
    public void testRectangleArea() {
        assertEquals(10, GeoService.rectangleArea(2, 5));

    }

    @Test
    public void testSquareArea() {
            assertEquals(4, GeoService.squareArea(2));
            assertNotEquals(5, GeoService.squareArea(2));
    }   

    @Test
    public void testTriangleArea() {

    }
}
