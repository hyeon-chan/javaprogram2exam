package week8;

public class ex01 {
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	static interface OnClickListener {
		void onClick();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
