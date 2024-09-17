import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.accounts.GeoService;

public class GeoServiceTest {

    @Test
    public void testTriangleArea() {
        assertEquals(2, GeoService.triangleArea(2, 2));

    }

    @Test
    public void testCircleArea() {
        assertEquals(12.5, GeoService.circleArea(2),0.1);

    }
    @Test
    public void testSquareArea() {
            assertEquals(4, GeoService.squareArea(2));
    }  
    
    @Test
    public void testRectangleArea() {
        assertEquals(6, GeoService.rectangleArea(2, 3));

    }

    @Test
    public void testCubeVolume() {
        assertEquals(8, GeoService.cubeVolume(2));
    }
    
    @Test
    public void testCilinderVolume() {
        assertEquals(25.1, GeoService.cilinderVolume(2,2), 0.1);

    }

    @Test
    public void testSphereVolume() {
        assertEquals(33.5, GeoService.sphereVolume(2),0.1);
        
    }

  

   

   
}
