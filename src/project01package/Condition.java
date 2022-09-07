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
}
