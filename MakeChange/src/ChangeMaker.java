import java.util.ArrayList;
import java.util.List;


public class ChangeMaker {
	public static List<Integer> makeChange(List<Integer> coins, int amount){
		List<Integer> result = new ArrayList<>();
		
		for(Integer coin : coins){
			int numToAdd = amount/coin;
			amount -= numToAdd*coin;
			for(int i=0;i<numToAdd;i++){
				result.add(coin);
			}
		}
		
		return result;
	}
}
