package mockitopoc;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


//Car.java (model)
class Car {
 private String model;

 public Car(String model) {
     this.model = model;
 }

 public String getModel() {
     return model;
 }
}

//CarRepository.java (interface)
interface CarRepository {
 void save(Car car);
 Car getCar(String model);
 void freak();
}

class RealImplementation implements CarRepository
{

	@Override
	public void save(Car car) {
		// TODO Auto-generated method stub
		System.out.println("save method of real");
		
	}

	@Override
	public Car getCar(String model) {
		// TODO Auto-generated method stub
		System.out.println("get car method of real ");
		return new Car("ABC");
	}

	@Override
	public void freak() {
		// TODO Auto-generated method stub
		System.out.println("this is freak method of car");
		
	}
	
	
}

//CarService.java (class to be tested)
class CarService {
 private CarRepository carRepository;

 public CarService(CarRepository carRepository) {
     this.carRepository = carRepository;
 }

 public void saveCar(Car car) {
     carRepository.save(car);  // Save the car
 }

 public String getCarModel(String model) {
     Car car = carRepository.getCar(model);
     return car != null ? car.getModel() : null;
 }
}



public class CarServiceTest {

    @Test
    void testVerifyMethodCalls() {
        // Step 1: Create a mock of CarRepository @Mock
        CarRepository mockCarRepository = mock(CarRepository.class);

        // Step 2: Create the CarService instance with the mocked repository  @InjectMock
        CarService carService = new CarService(mockCarRepository);

        // Step 3: Create a Car object
        Car car = new Car("Toyota");

        // Step 4: Call methods on the carService
        carService.saveCar(car);  // This calls save on the mock
        carService.getCarModel("Toyota");  // This calls getCar on the mock

        // Step 5: Use verify to check if the methods were called on the mock

        // Verify that save was called exactly once on the mockCarRepository with the car object
        verify(mockCarRepository, times(1)).save(car);

        // Verify that getCar was called exactly once with the "Toyota" model
        verify(mockCarRepository, times(1)).getCar("Toyota");

        // Verify that no other methods were called on the mockCarRepository
        verify(mockCarRepository, never()).freak();  // Verifying no save calls with any other argument

        // Verifying method calls with atLeastOnce
        verify(mockCarRepository).getCar("Toyota");  // getCar("Toyota") was called at least once
    }
}
