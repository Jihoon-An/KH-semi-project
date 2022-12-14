package dto;

import java.sql.ResultSet;
import java.sql.Timestamp;

public class ExerciseDTO {
	private int exr_seq;
	private Timestamp exr_date;
	private int user_seq;
	private String exr_memo;
	private int exr_how;
	private String exr_intensity;
	private String inbody_weight;
	private String inbody_bfm;
	private String inbody_bmi;
	private String inbody_sm;


	public ExerciseDTO() {}
	
	public ExerciseDTO(ResultSet resultSet) throws Exception{
		this.exr_seq = resultSet.getInt("exr_seq");
		this.exr_date = resultSet.getTimestamp("exr_date");
		this.user_seq = resultSet.getInt("user_seq");
		this.exr_memo = resultSet.getString("exr_memo");
		this.exr_how = resultSet.getInt("exr_how");
		this.exr_intensity = resultSet.getString("exr_intensity");
		this.inbody_weight = resultSet.getString("inbody_weight");
		this.inbody_bfm = resultSet.getString("inbody_bfm");
		this.inbody_bmi = resultSet.getString("inbody_bmi");
		this.inbody_sm = resultSet.getString("inbody_sm");
	}	


	public ExerciseDTO(int exr_seq, Timestamp exr_date, int user_seq, String exr_memo, int exr_how,

			String exr_intensity, String inbody_weight, String inbody_bfm, String inbody_bmi, String inbody_sm) {
		super();
		this.exr_seq = exr_seq;
		this.exr_date = exr_date;
		this.user_seq = user_seq;
		this.exr_memo = exr_memo;
		this.exr_how = exr_how;
		this.exr_intensity = exr_intensity;
		this.inbody_weight = inbody_weight;
		this.inbody_bfm = inbody_bfm;
		this.inbody_bmi = inbody_bmi;
		this.inbody_sm = inbody_sm;
	}
	public int getExr_seq() {
		return exr_seq;
	}
	public void setExr_seq(int exr_seq) {
		this.exr_seq = exr_seq;
	}
	public Timestamp getExr_date() {
		return exr_date;
	}
	public void setExr_date(Timestamp exr_date) {
		this.exr_date = exr_date;
	}
	public int getUser_seq() {
		return user_seq;
	}
	public void setUser_seq(int user_seq) {
		this.user_seq = user_seq;
	}
	public String getExr_memo() {
		return exr_memo;
	}
	public void setExr_memo(String exr_memo) {
		this.exr_memo = exr_memo;
	}
	public int getExr_how() {
		return exr_how;
	}
	public void setExr_how(int exr_how) {
		this.exr_how = exr_how;
	}
	public String getExr_intensity() {
		return exr_intensity;
	}
	public void setExr_intensity(String exr_intensity) {
		this.exr_intensity = exr_intensity;
	}
	public String getInbody_weight() {
		return inbody_weight;
	}
	public void setInbody_weight(String inbody_weight) {
		this.inbody_weight = inbody_weight;
	}
	public String getInbody_bfm() {
		return inbody_bfm;
	}
	public void setInbody_bfm(String inbody_bfm) {
		this.inbody_bfm = inbody_bfm;
	}
	public String getInbody_bmi() {
		return inbody_bmi;
	}
	public void setInbody_bmi(String inbody_bmi) {
		this.inbody_bmi = inbody_bmi;
	}
	public String getInbody_sm() {
		return inbody_sm;
	}
	public void setInbody_sm(String inbody_sm) {
		this.inbody_sm = inbody_sm;
	}


}
