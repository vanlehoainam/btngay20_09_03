package pxu.com.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "sinhvien")
public class SinhVien {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idsv;
	private String hoTen;
	private Date ngaySinh;
	private String dcht;
	private String cccd;
	private String gioiTinh;
	private String queQuan;

	@ManyToOne
	@JoinColumn(name = "idkh")
	private KhoaHoc khoaHoc;

	public SinhVien() {
		super();
	}

	public int getIdsv() {
		return idsv;
	}

	public void setIdsv(int idsv) {
		this.idsv = idsv;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getDcht() {
		return dcht;
	}

	public void setDcht(String dcht) {
		this.dcht = dcht;
	}

	public String getCccd() {
		return cccd;
	}

	public void setCccd(String cccd) {
		this.cccd = cccd;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getQueQuan() {
		return queQuan;
	}

	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}

	public KhoaHoc getKhoaHoc() {
		return khoaHoc;
	}

	public void setKhoaHoc(KhoaHoc khoaHoc) {
		this.khoaHoc = khoaHoc;
	}

	public SinhVien(int idsv, String hoTen, Date ngaySinh, String dcht, String cccd, String gioiTinh,
			String queQuan, KhoaHoc khoaHoc) {
		super();
		this.idsv = idsv;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.dcht = dcht;
		this.cccd = cccd;
		this.gioiTinh = gioiTinh;
		this.queQuan = queQuan;
		this.khoaHoc = khoaHoc;
	}

}
