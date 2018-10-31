package designpattern.structural.adapter.example1;

public class SocketAdpaterImpl extends Socket implements SocketAdapter {
	public Volt get120Volt() {
		return getVolt();
	}

	public Volt get12Volt() {
		return convertVolt(getVolt(), 10);
	}

	public Volt get3Volt() {
		return convertVolt(getVolt(), 40);
	}

	private Volt convertVolt(Volt volt, int devider) {
		return new Volt(volt.getVolts() / devider);
	}
}
