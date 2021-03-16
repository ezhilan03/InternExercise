package EYExercise.day22;

import java.util.HashSet;
import java.util.Set;

public class ItemTransactionDemo {
	public static void main(String[] args) {
		ItemTransactionDAOImpl itemImpl = new ItemTransactionDAOImpl();
		
		ItemTransactionDTO itemTransac1 = new ItemTransactionDTO();
		itemTransac1.setInvNo(1);
		itemTransac1.setItemNo(101);
		itemTransac1.setItemQuantity(5);
		
//		//insert
//		System.out.println(itemImpl.insertItemTransaction(itemTransac1));
		
//		//delete
//		System.out.println(itemImpl.deleteItemTransaction(1, 101));
		
		//update
		System.out.println(itemImpl.updateItemTransaction(itemTransac1, 10));
		
		//get
		itemTransac1 = itemImpl.getItemTransaction(1, 101);
		System.out.println(itemTransac1);
		
		//get all
		Set<ItemTransactionDTO> set = new HashSet<>();
		set=itemImpl.getItemTransactionAll();
		System.out.println(set);
	}
}
