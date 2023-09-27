package pxu.com.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "khoahoc")
public class KhoaHoc {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idkh;
	private String tenKhoaHoc;

	@OneToMany(mappedBy = "idsv")
	private List<SinhVien> sinhViens;

	public int getidkh() {
		return idkh;
	}

	public void setKhoahoc_id(int idkh) {
		this.idkh = idkh;
	}

	public String getTenKhoaHoc() {
		return tenKhoaHoc;
	}

	public void setTenKhoaHoc(String tenKhoaHoc) {
		this.tenKhoaHoc = tenKhoaHoc;
	}

	public List<SinhVien> getSinhViens() {
		return sinhViens;
	}

	public void setSinhViens(List<SinhVien> sinhViens) {
		this.sinhViens = sinhViens;
	}

	public KhoaHoc(int idkh, String tenKhoaHoc, List<SinhVien> sinhViens) {
		super();
		this.idkh = idkh;
		this.tenKhoaHoc = tenKhoaHoc;
		this.sinhViens = sinhViens;
	}

	public KhoaHoc() {
		super();
	}

}
