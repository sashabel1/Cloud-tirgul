/**
 * The {@code SharedData} class represents a shared data structure
 * used to store and access various fields such as an integer array,
 * a win condition array, a flag, and a constant value.
 * 
 * This class provides getter and setter methods for managing
 * the shared data, ensuring encapsulation and controlled access.
 * </p>
 * 
 * @author Daniel Chernov
 * @author Alexandra Belkind
 */

public class SharedData 
{
	private int [] array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/**
     * Constructs a {@code SharedData} object with a given array and constant value.
     * 
     * @param array the integer array to be shared
     * @param b     a constant integer value
     */
	public SharedData(int[] array, int b) {
		
		this.array = array;
		this.b = b;
	}
	/**
     * Returns the win condition array.
     * 
     * @return a boolean array indicating win conditions
     */
	public boolean[] getWinArray() 
	{
		return winArray;
	}
	
	/**
     * Sets the win condition array.
     * 
     * @param winArray a boolean array to track win conditions
     */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}
	
	/**
     * Returns the shared integer array.
     * 
     * @return an integer array representing the shared data
     */
	public int[] getArray() 
	{
		return array;
	}
	
	/**
     * Returns the constant integer value.
     * 
     * @return the constant integer value
     */
	public int getB() 
	{
		return b;
	}
	
	/**
     * Returns the current state of the flag.
     * 
     * @return {@code true} if the flag is set; {@code false} otherwise
     */
	public boolean getFlag() 
	{
		return flag;
	}
	
	/**
     * Sets the state of the flag.
     * 
     * @param flag {@code true} to set the flag; {@code false} to unset it
     */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
