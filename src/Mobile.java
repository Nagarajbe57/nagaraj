
public abstract class Mobile implements ElectronicDevices {
	public void powerUse(String power) {
		if(power=="electric") {
			System.out.println("ELECTRiC POWER");
		}
		else {
			System.out.println("BATTERY POWER");
		}			
		}
	public abstract void printMAH(int mah);
}

