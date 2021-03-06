package proxyPattern;

public class RealImage implements Image {

	private String fileName;
	
	public RealImage(String fileName){
		this.fileName = fileName;
		loadFromDisk(fileName);
	}
	
	private void loadFromDisk(String fileName2) {
		System.out.println("Loading file: " + fileName2);
	}

	@Override
	public void display() {
		System.out.println("Displaying File: " + fileName);
	}

}
