package com.MF.TextToDB.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.MF.TextToDB.Helper.MFHelper;
import com.MF.TextToDB.Response.Response;
import com.MF.TextToDB.Service.MFService;
import com.MF.TextToDB.model.MFEntity;

@Controller
@RequestMapping("/api/csv")
public class MFController {
	@Autowired
	MFService mfService;
	
	
	
	@GetMapping("/list")
	  public ResponseEntity<List<MFEntity>> getAllTutorials() {
	    try {
	      List<MFEntity> MFlist = mfService.getAllTutorials();

	      if (MFlist.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	      }

	      return new ResponseEntity<>(MFlist, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	
	
	@PostMapping("/upload")
	  public ResponseEntity<Response> uploadFile(@RequestParam("file") MultipartFile file) {
	    String message = "";

	    if (MFHelper.hasCSVFormat(file)) {
	      try {
	        mfService.save(file);

	        message = "Uploaded the file successfully: " + file.getOriginalFilename();
	        
	        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
	                .path("/api/csv/download/")
	                .path(file.getOriginalFilename())
	                .toUriString();

	        return ResponseEntity.status(HttpStatus.OK).body(new Response(message,fileDownloadUri));
	      } catch (Exception e) {
	        message = "Could not upload the file: " + file.getOriginalFilename() + "!";
	        return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new Response(message,""));
	      }
	    }

	    message = "Please upload a csv file!";
	    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Response(message,""));
	  }

	  @GetMapping("/tutorials")
	  public ResponseEntity<List<MFEntity>> getAllEntities() {
	    try {
	      List<MFEntity> tutorials = mfService.getAllTutorials();

	      if (tutorials.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	      }

	      return new ResponseEntity<>(tutorials, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }

	  
	
	
	
	
}
