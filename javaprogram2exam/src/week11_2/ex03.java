package week11_2;

class Producer implements Runnable {
	private Buffer buffer;
	public Producer(Buffer buffer) {
		this.buffer = buffer;
	}
	public void run() {
		for( int i=0; i<10; i++) {
			buffer.put(i);
			System.out.println("생산자: " + i + "번 케이크 생산 ");
			try {
				Thread.sleep((int)(Math.random()*100));} catch(Exception e) {}
			}
		}
	}