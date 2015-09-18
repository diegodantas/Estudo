package br.com.caelum.vraptor.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Preenchimento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1154539493144108964L;
	
	@Id
	@GeneratedValue
	private int id;
	
	@ManyToOne
	private Usuario usuario;
	
	@Column(nullable=false)
	private double jan;
	@Column(nullable=false)
	private double fev;
	@Column(nullable=false)
	private double mar;
	@Column(nullable=false)
	private double abr;
	@Column(nullable=false)
	private double mai;
	@Column(nullable=false)
	private double jun;
	@Column(nullable=false)
	private double jul;
	@Column(nullable=false)
	private double ago;
	@Column(nullable=false)
	private double set;
	@Column(nullable=false)
	private double out;
	@Column(nullable=false)
	private double nov;
	@Column(nullable=false)
	private double dez;
	
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getJan() {
		return jan;
	}
	public void setJan(float jan) {
		this.jan = jan;
	}
	public double getFev() {
		return fev;
	}
	public void setFev(double fev) {
		this.fev = fev;
	}
	public double getMar() {
		return mar;
	}
	public void setMar(double mar) {
		this.mar = mar;
	}
	public double getAbr() {
		return abr;
	}
	public void setAbr(double abr) {
		this.abr = abr;
	}
	public double getMai() {
		return mai;
	}
	public void setMai(double mai) {
		this.mai = mai;
	}
	public double getJun() {
		return jun;
	}
	public void setJun(double jun) {
		this.jun = jun;
	}
	public double getJul() {
		return jul;
	}
	public void setJul(double jul) {
		this.jul = jul;
	}
	public double getAgo() {
		return ago;
	}
	public void setAgo(double ago) {
		this.ago = ago;
	}
	public double getSet() {
		return set;
	}
	public void setSet(double set) {
		this.set = set;
	}
	public double getOut() {
		return out;
	}
	public void setOut(double out) {
		this.out = out;
	}
	public double getNov() {
		return nov;
	}
	public void setNov(double nov) {
		this.nov = nov;
	}
	public double getDez() {
		return dez;
	}
	public void setDez(double dez) {
		this.dez = dez;
	}
	@Override
	public String toString() {
		return "dados [jan=" + jan + ", fev=" + fev + ", mar=" + mar
				+ ", abr=" + abr + ", mai=" + mai + ", jun=" + jun + ", jul="
				+ jul + ", ago=" + ago + ", set=" + set + ", out=" + out
				+ ", nov=" + nov + ", dez=" + dez + "]";
	}

}
