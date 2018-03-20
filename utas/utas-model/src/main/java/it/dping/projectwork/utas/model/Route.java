package it.dping.projectwork.utas.model;
import java.util.Date;

public class Route  extends AEntity<String> {
	private int codLine;
	private int codBus;
	private Date date;
	private String day;
	public int getCodLine() {
		return codLine;
	}
	public void setCodLine(int codLine) {
		this.codLine = codLine;
	}
	public int getCodBus() {
		return codBus;
	}
	public void setCodBus(int codBus) {
		this.codBus = codBus;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	@Override
	public String getOid() {
		return Integer.toString (getCodBus());
	}
	
	
}
