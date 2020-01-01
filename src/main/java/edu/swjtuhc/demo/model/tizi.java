package edu.swjtuhc.demo.model;

public class tizi {
	private int tid;
	private int tsid;
	private int tuid;
	private int trrplycount;
	private String ttopic;
	private String tcontents;
	private String ttime;
	private int tlastid;
	private int tlasttime;
	
	@Override
	public String toString() {
		return "tizi [tid=" + tid + ", tsid=" + tsid + ", tuid=" + tuid + ", trrplycount=" + trrplycount + ", ttopic="
				+ ttopic + ", tcontents=" + tcontents + ", ttime=" + ttime + ", tlastid=" + tlastid + ", tlasttime="
				+ tlasttime + "]";
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getTsid() {
		return tsid;
	}
	public void setTsid(int tsid) {
		this.tsid = tsid;
	}
	public int getTuid() {
		return tuid;
	}
	public void setTuid(int tuid) {
		this.tuid = tuid;
	}
	public int getTrrplycount() {
		return trrplycount;
	}
	public void setTrrplycount(int trrplycount) {
		this.trrplycount = trrplycount;
	}
	public String getTtopic() {
		return ttopic;
	}
	public void setTtopic(String ttopic) {
		this.ttopic = ttopic;
	}
	public String getTcontents() {
		return tcontents;
	}
	public void setTcontents(String tcontents) {
		this.tcontents = tcontents;
	}
	public String getTtime() {
		return ttime;
	}
	public void setTtime(String ttime) {
		this.ttime = ttime;
	}
	public int getTlastid() {
		return tlastid;
	}
	public void setTlastid(int tlastid) {
		this.tlastid = tlastid;
	}
	public int getTlasttime() {
		return tlasttime;
	}
	public void setTlasttime(int tlasttime) {
		this.tlasttime = tlasttime;
	}
	
}
