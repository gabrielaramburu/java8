package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {
	public static void main(String[] args) {
		//get 3 names of dishes with more than 300 calories.
		List<String> filteredDishes = 
				getListOfDishes().stream()
					.filter(dish -> dish.getCalories() > 300)
					.map(Dish::getName)
					.limit(3)
					.collect(Collectors.toList());
		
		System.out.println(filteredDishes);
	}
				
	public static List<Dish> getListOfDishes() {
		List<Dish> menu = Arrays.asList(
				new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT),
				new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("french fries", true, 530, Dish.Type.OTHER),
				new Dish("rice", true, 350, Dish.Type.OTHER),
				new Dish("season fruit", true, 120, Dish.Type.OTHER),
				new Dish("pizza", true, 550, Dish.Type.OTHER),
				new Dish("prawns", false, 300, Dish.Type.FISH),
				new Dish("salmon", false, 450, Dish.Type.FISH) );
		
		return menu;
	}
}
