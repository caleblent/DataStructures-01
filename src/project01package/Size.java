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
}
