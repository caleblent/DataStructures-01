package project01package;

// CONVERSION CHART (Size - Number)
//  XL= 3
//  L = 2
//  M = 1
//  S = 0

public enum Size {
	XL("XL"),
	L("L"),
	M("M"),
	S("S");
	private final String mCond;
	Size(String cond){
		mCond = cond;
	}
	public String toString(){ return mCond; }
	
	/**
	 * Converts the given condition to its numeric equivalent
	 * (Refer to conversion chart at top of file)
	 * 
	 * @param num
	 * @return Condition (that correlates to the number provided)
	 * @throws IllegalArgumentException
	 */
	public int toInt() {
		if (mCond.equals("XL"))
			return 3;
		else if (mCond.equals("L"))
			return 2;
		else if (mCond.equals("M"))
			return 1;
		else if (mCond.equals("S"))
			return 0;
		else // indicates something went wrong
			return -1;
	}
	
	/**
	 * Accepts an integer from 0 to 3 (inclusive) and returns the Size equivalent
	 * (Refer to conversion chart at top of file)
	 * 
	 * @param num
	 * @return Size (that correlates to the number provided)
	 * @throws IllegalArgumentException
	 */
	public static Size intToSize(int num) throws IllegalArgumentException {
		if (num == 3)
			return Size.XL;
		else if (num == 2)
			return Size.L;
		else if (num == 1)
			return Size.M;
		else if (num == 0)
			return Size.S;
		else
			throw new IllegalArgumentException("Integer supplied must be 0, 1, 2, or 3");
	}
}
