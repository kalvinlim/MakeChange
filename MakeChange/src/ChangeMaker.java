import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;


public class ChangeMaker {
	public static List<Integer> makeChange(List<Integer> coins, int amount,  TreeMap<Integer, List<Integer>> solutionSet){					
		return populateSolutionSet(coins, amount, solutionSet).firstEntry().getValue();				
	}
	private static TreeMap<Integer, List<Integer>> populateSolutionSet(List<Integer> coins, int amount, TreeMap<Integer, List<Integer>> solutionSet){
		int amountCopy = amount;
		 
		List<Integer> result = new ArrayList<>();
			
		if(coins.size() == 1){
			int numToAdd = amountCopy/coins.get(0);
			amountCopy -= numToAdd*coins.get(0);

			for(int i=0;i<numToAdd;i++){
				result.add(coins.get(0));
			}
			solutionSet.put(result.size(), result);
			return solutionSet;
		}
	
		for(Integer coin : coins){
			int numToAdd = amountCopy/coin;
			if(numToAdd > 0){
				amountCopy -= (numToAdd*coin);
				
				for(int i=0;i<numToAdd;i++){
					result.add(coin);
				}
			}
		}
		solutionSet.put(result.size(), result);

		coins.remove(0);

		return populateSolutionSet(coins, amount, solutionSet);
		
		
	}
}
