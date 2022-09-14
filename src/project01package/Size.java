package project01package;

public enum Size {
	S("S"),
	M("M"),
	L("L"),
	XL("XL");
	private final String mCond;
	Size(String cond){
		mCond = cond;
	}
	public String toString(){ return mCond; }
	
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
