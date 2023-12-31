package pxu.com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pxu.com.exception.ResourceNotFoundException;
import pxu.com.model.KhoaHoc;
import pxu.com.model.Product;
import pxu.com.model.SinhVien;
import pxu.com.repository.KhoaHocRepository;
import pxu.com.service.KhoaHocService;

@Controller
@RequestMapping("/khoahoc")
public class KHController{
	@Autowired
	private KhoaHocService khoaHocService;

	@GetMapping("/listkhoahoc")
	public String listkhoahoc(Model model) {
		List<KhoaHoc> khoaHocs = khoaHocService.getAllKhoaHoc();
		model.addAttribute("khoaHocs", khoaHocs);
		return "listkhoahoc";
	}

	@GetMapping("/showform")
	public String showform(Model model) {
		KhoaHoc khoaHocs = new KhoaHoc();
		model.addAttribute("khoaHocs", khoaHocs);
		return "formkhoahoc";
	}

	@PostMapping("/addkhoahoc")
	public String addKhoaHoc(@ModelAttribute("khoaHocs") KhoaHoc khoaHoc) {
		khoaHocService.createKhoaHoc(khoaHoc);
		return "redirect:/khoahoc/listkhoahoc";
	}

	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("khoahocid") int id) throws ResourceNotFoundException {
		khoaHocService.deleteKhoaHoc(id);
		return "redirect:/khoahoc/listkhoahoc";
	}

	@GetMapping("/updatekhoahoc")
	public String showFormForUpdate(@RequestParam("khoahocid") int id, Model theModel)
			throws ResourceNotFoundException {
		Optional<KhoaHoc> khoaHoc = khoaHocService.getKhoaHocById(id);
		theModel.addAttribute("khoaHoc", khoaHoc);
		return "updatekhoahoc";
	}

	@PostMapping("/editkhoahoc")
	public String updateProduct(@ModelAttribute("khoahoc_id") KhoaHoc khoaHoc) {
		khoaHocService.updateKhoaHoc(khoaHoc.getidkh(), khoaHoc);
		return "redirect:/khoahoc/listkhoahoc";
	}
}
