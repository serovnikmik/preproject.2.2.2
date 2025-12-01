package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private final List<Car> cars =  new ArrayList<>();

    {
        cars.add(new Car("Model 1", 100, 40));
        cars.add(new Car("Model 2", 200, 200));
        cars.add(new Car("Model 3", 300, 10));
        cars.add(new Car("Model 4", 400, 160));
        cars.add(new Car("Model 5", 500, 180));
    }

    public List<Car> getCars(int number) {
        if (number <= 0){
            return new ArrayList<>();
        }
        if (number > cars.size()){
            return cars;
        }
        return cars.subList(0, number);
    }

}
