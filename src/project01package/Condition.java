package project01package;

public enum Condition {
	NEW("new"), 
	GOOD("good"), 
	POOR("poor"), 
	TRASHED("trashed");
	private final String mCond;
	Condition(String cond){
		mCond = cond;
	}
	public String toString(){ return mCond; }
	
	// converts the condition to a number
	// NEW = 3
	// GOOD = 2
	// POOR = 1
	// TRASHED = 0
	public int toInt() {
		if (mCond.equals("new"))
			return 3;
		else if (mCond.equals("good"))
			return 2;
		else if (mCond.equals("poor"))
			return 1;
		else if (mCond.equals("trashed"))
			return 0;
		else // indicates something went wrong
			return -1;
	}
}
