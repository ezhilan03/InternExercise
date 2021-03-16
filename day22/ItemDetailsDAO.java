package EYExercise.day22;

import java.util.Set;

public interface ItemDetailsDAO {
	public int insertItemDetails(ItemDetailsDTO itemDetailsDTO);
	public int deleteItemDetails(int itemNo);
	public int updateItemDetails(ItemDetailsDTO itemDetailsDTO,double itemPrice);
	public ItemDetailsDTO getItemDetails(int itemNo);
	public Set<ItemDetailsDTO> getItemDetailsAll();
}
