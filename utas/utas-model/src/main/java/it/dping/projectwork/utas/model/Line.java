package it.dping.projectwork.utas.model;

public class Line  extends AEntity<String>{

	private double lat;
	private double lng;
	private String name;
	private int nLinea;
	private int nTappa;
	private double kmLinea;
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLng() {
		return lng;
	}
	public void setLng(double lng) {
		this.lng = lng;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getnLinea() {
		return nLinea;
	}
	public void setnLinea(int nLinea) {
		this.nLinea = nLinea;
	}
	public int getnTappa() {
		return nTappa;
	}
	public void setnTappa(int nTappa) {
		this.nTappa = nTappa;
	}
	public double getKmLinea() {
		return kmLinea;
	}
	public void setKmLinea(double kmLinea) {
		this.kmLinea = kmLinea;
	}
	@Override
	public String getOid() {
		return Integer.toString (getnLinea());
	}
	
}
