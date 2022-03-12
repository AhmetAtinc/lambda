package work1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lambda2 {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>(Arrays.asList(12-3,65,3,7,34,22,-60,42,15));
				
		ciftKare(list);
		System.out.println();
		top1(list);
		System.out.println();
		top2(list);
		System.out.println();
		carpCift(list);
	}
		
	public static void ciftKare(List<Integer> list) {
	Optional<Integer> maxEl = list.stream().filter(Lambda::cift).map(t->t*t).reduce(Integer::max);
		System.out.println(maxEl);
	}
	
	public static void top1(List<Integer> list) {
		int top = list.stream().reduce(0,(x,y)->x+y);
		System.out.println(top);
	}
	
	public static void top2(List<Integer> list) {
		Optional<Integer> top = list.stream().reduce(Integer::sum);
		Optional<Integer> top1 = list.stream().reduce(Math::addExact);
		System.out.println(top);
		System.out.println(top1);
	}
	public static void carpCift(List<Integer> list) {
		
		Optional<Integer> carp = list.stream().filter(Lambda::cift).reduce(Math::multiplyExact);
		System.out.println(carp);
	}
}
