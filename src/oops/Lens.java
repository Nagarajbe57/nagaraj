package oops;

public class Lens {
	private String zoom;
	private String material;
	private int price;
	
	public void setZoom(String zoom) {
		this.zoom=zoom;
	}
	public String getZoom() {
		return this.zoom;
	}
	public void setMaterial(String material) {
		this.material=material;
	}
	public String getMaterial() {
		return this.material;
	}
	public void setprice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return this.price;
	}
	public Lens(String zoom,String material,int price) {
		this.zoom=zoom;
		this.material=material;
		this.price=price;
	}
	public String toString() {
		return "ZOOM LEVEL="+this.zoom+" "+"MATERIAL TYPE="+this.material+" "+"PRICE OF LENS="+this.price;
		
	}

}
