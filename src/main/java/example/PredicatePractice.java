package example;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicatePractice {
	
	public static void main(String[] args) {
		Predicate<Integer> isEven = n -> n%2 ==0;
		System.out.println(isEven.test(34));
		
		Predicate<String> containsA = s-> s.contains("a");
		System.out.println(containsA.test("abc"));
		
		Predicate<Integer> isGraterThan35 = n -> n > 35;
		System.out.println(isEven.and(isGraterThan35).test(20));
		
		System.out.println(isEven.negate().test(20));
		
		List<Integer> nums = Arrays.asList(1,23,25,30,56);
		List<Integer> even = nums.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
		System.out.println(even);
		
		List<Integer> oddAndGreaterThan10 = nums.stream().filter(n -> ((n%2 !=0) && (n> 10))).collect(Collectors.toList());
		
		System.out.println(oddAndGreaterThan10);
		
		
	}

}
