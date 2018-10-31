package designpattern.structural.adapter.example1;

public interface SocketAdapter {
	Volt get120Volt();

	Volt get12Volt();

	Volt get3Volt();
}
