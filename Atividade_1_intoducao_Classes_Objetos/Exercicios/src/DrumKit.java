class DrumKit {
	boolean TopHat = true;
	boolean Snare = true;
	
	void PlaySnare() {
		System.out.println("bang bang ba-bang");
	}
	
	void PlayTopHat() {
		System.out.println("ding ding da-ding");
	}
}

class DrumKitTestDrive{
	public static void main(String[] args) {
		DrumKit d = new DrumKit();
		d.PlaySnare();
		d.PlayTopHat();
	}
}