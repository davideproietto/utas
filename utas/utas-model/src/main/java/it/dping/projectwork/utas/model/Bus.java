package it.dping.projectwork.utas.model;


import java.util.Date;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Table(name="BUSX")
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Bus extends AEntity<String>{
	@Id
	private String idBus;
	private String model;
	private String license; // targa
	private int yearImatr;
	private int kmLastRev;
	private int kmTot;
	private	int state;
	private	String note;
	//private	ImageView image;

	
	
	@Override
	public String getOid() {
		return getIdBus();
	}

	public Bus(String idBus, String model, String license, int yearImatr, int kmLastRev, int kmTot, int state,
			String note) {
		super();
		this.idBus = idBus;
		this.model = model;
		this.license = license;
		this.yearImatr = yearImatr;
		this.kmLastRev = kmLastRev;
		this.kmTot = kmTot;
		this.state = state;
		this.note = note;
	}

	public String getIdBus() {
		return idBus;
	}

	public void setIdBus(String idBus) {
		this.idBus = idBus;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public int getYearImatr() {
		return yearImatr;
	}

	public void setYearImatr(int yearImatr) {
		this.yearImatr = yearImatr;
	}

	public int getKmLastRev() {
		return kmLastRev;
	}

	public void setKmLastRev(int kmLastRev) {
		this.kmLastRev = kmLastRev;
	}

	public int getKmTot() {
		return kmTot;
	}

	public void setKmTot(int kmTot) {
		this.kmTot = kmTot;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "Bus [getOid()=" + getOid() + ", getIdBus()=" + getIdBus() + ", getModel()=" + getModel()
				+ ", getLicense()=" + getLicense() + ", getYearImatr()=" + getYearImatr() + ", getKmLastRev()="
				+ getKmLastRev() + ", getKmTot()=" + getKmTot() + ", getState()=" + getState() + ", getNote()="
				+ getNote() + "]";
	};
	
	
}
