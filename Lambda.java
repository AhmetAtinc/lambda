package work1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;



public class Lambda {

	public static void main(String[] args) {
		
		
		List<Integer> myList=new ArrayList<>(Arrays.asList(3,5,9,12,30));
		
		

		ciftKare(myList);
		System.out.println();
		cift(myList);
		System.out.println();
		ondanKucuk(myList);
		System.out.println();
		tekBuyuk(myList);
		System.out.println();
		kupArtiBir(myList);
		System.out.println();
		kareKok(myList);
		System.out.println();
		max(myList);
		
	}
	public static void yazdir(int x) {
		System.out.println(x + " ");
	}
	
	public static boolean cift(int i) {
		return i%2==0;
	}
	
	public static void ciftKare(List<Integer> myList) {
		myList.stream().filter(Lambda::cift).map(t->t*t).forEach(Lambda::yazdir);
	}
	
	public static void cift(List<Integer> myList) {
		myList.stream().filter(Lambda::cift).forEach(Lambda::yazdir);
	}
	
	public static void ondanKucuk(List<Integer> myList) {
		myList.stream().filter(t->t%2==0 & t>10).forEach(Lambda::yazdir);
	}
	
	public static void tekBuyuk(List<Integer> myList) {
		myList.stream().filter(t->t%2==1|t>20).forEach(Lambda::yazdir);
	}
	
	public static void kupArtiBir(List<Integer> list) {
		
		list.stream().filter(t->t%2==1).map(t->t*t*t+1).forEach(Lambda::yazdir);
	}
	
	public static void kareKok(List<Integer> list) {
	
		list.stream().filter(Lambda::cift).map(Math::sqrt).forEach(t->System.out.print(t+" "));
	}
	
	private static void max(List<Integer> list) {
		
		Optional<Integer>max=list.stream().reduce(Math::max);
		System.out.println(max);
	}
}