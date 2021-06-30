import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class Java_stream_basic {
	
	public static void main(String[] args) {
	
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhishek");
		names.add("Aman");
		names.add("Don");
		names.add("Adam");
		names.add("Ram");
		
		streamFilter(names);
		
		/*int count = 0;
		
		
		for(int i=0;i<names.size();i++)
		{
			String a =names.get(i);
			if(a.startsWith("A"))
			{
				count++;
				System.out.println(names.get(i));
			}
		}
			System.out.println(count ); 		  */
	}
	
		public static void streamFilter(ArrayList<String> names) {	
			
		//Info: Filter is intermediate operation and count is terminal operation; terminal operation is must ; intermediate operation should be true
		//Print names start with A in sorted manner
		Long d = Stream.of("Abhishek","Amandeep","Don","Adam","Ram").filter(s->s.startsWith("A")).count();
		System.out.println(d);
		
		//Print names>4 characters.
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println("length>4 is "+s));
		
		//Print only 2 values and sorted
		names.stream().filter(s->s.length()>2).limit(2).sorted().forEach(s->System.out.println("First two sported values "+s));
		
		//Print names which has last letter a characters with Upper Case
		names.stream().filter(s->s.endsWith("m")).map(s->s.toUpperCase()).forEach(s->System.out.println("Uppercase Letter end with 'm' "+s));
		
		//Merge 2 array list
		concat(names);
		
		}

		public static void concat(ArrayList<String> names) {
			
			ArrayList<String> names1 = new ArrayList<String>();
			names1.add("Abhishek");
			names1.add("Aditya");
			
			//Join 2 array list
			Stream<String> newStream1 = Stream.concat(names.stream(), names1.stream());
			newStream1.sorted().forEach(s->System.out.println("newStream is "+s));
			
			//Match any element in array list
			Stream<String> newStream2 = Stream.concat(names.stream(), names1.stream());
			boolean flag = newStream2.anyMatch(s->s.equalsIgnoreCase("Aditya"));
			Assert.assertTrue(flag);
			
			//Collect Method Usage:- Convert back to list
			List<String> ls = names1.stream().filter(s->s.endsWith("a")).map(s->s.toUpperCase()).collect(Collectors.toList());
			System.out.println(ls.get(0));
			
			
			//Print unique and sorted number from array 
			List<Integer> values = Arrays.asList(3,2,2,7,5,1,9);
			
			List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
			System.out.println(li);
			System.out.println(li.get(2));
			
}

}	
	
