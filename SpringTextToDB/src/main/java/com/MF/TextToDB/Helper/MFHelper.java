package com.MF.TextToDB.Helper;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.QuoteMode;
import org.springframework.web.multipart.MultipartFile;

import com.MF.TextToDB.model.MFEntity;

public class MFHelper {
	
	
	public static String TYPE = "text/csv";
	  static String[] HEADERs = { "UniqueNo","SchemeCode","RTASchemeCode","AMCSchemeCode","ISIN","AMCCode","SchemeType","SchemePlan",
			  "SchemeName","PurchaseAllowed","PurchaseTransactionmode","MinimumPurchaseAmount","AdditionalPurchaseAmount",
			  "MaximumPurchaseAmount","PurchaseAmountMultiplier","PurchaseCutoffTime","RedemptionAllowed","RedemptionTransactionMode",
			  "MinimumRedemptionQty","RedemptionQtyMultiplier","MaximumRedemptionQty","RedemptionAmountMinimum","RedemptionAmountMaximum",
			  "RedemptionAmountMultiple","RedemptionCutoffTime","RTAAgentCode","AMCActiveFlag","DividendReinvestmentFlag","SIPFLAG",
			  "STPFLAG","SWPFlag","SwitchFLAG","SETTLEMENTTYPE","AMCIND","FaceValue","StartDate","EndDate","ExitLoadFlag","ExitLoad",
			  "LockinPeriodFlag","LockinPeriod","ChannelPartnerCode","ReOpeningDate"};

	  public static boolean hasCSVFormat(MultipartFile file) {
	    if (TYPE.equals(file.getContentType())
	    		|| file.getContentType().equals("application/vnd.ms-excel")) {
	      return true;
	    }

	    return false;
	  }

	  public static List<MFEntity> csvToTutorials(InputStream is) {
	    try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
	        CSVParser csvParser = new CSVParser(fileReader,
	            CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());) {

	      List<MFEntity> developerTutorialList = new ArrayList<>();

	      Iterable<CSVRecord> csvRecords = csvParser.getRecords();

	      for (CSVRecord csvRecord : csvRecords) {
	    	  MFEntity mfEntity = new MFEntity(
	    			     csvRecord.get("UniqueNo"),
	    	             csvRecord.get("SchemeCode"),
	    	             csvRecord.get("RTASchemeCode"),
	    	             csvRecord.get("AMCSchemeCode"),
	    	             csvRecord.get("ISIN"),
	    	             csvRecord.get("AMCCode"),
	    	             csvRecord.get("SchemeType"),
	    	             csvRecord.get("SchemePlan"),
	    	             csvRecord.get("SchemeName"),
	    	             csvRecord.get("PurchaseAllowed"),
	    	             csvRecord.get("PurchaseTransactionmode"),
	    	             csvRecord.get("MinimumPurchaseAmount"),
	    	             csvRecord.get("AdditionalPurchaseAmount"),
	    	             csvRecord.get("MaximumPurchaseAmount"),
	    	             csvRecord.get("PurchaseAmountMultiplier"),
	    	             csvRecord.get("PurchaseCutoffTime"),
	    	             csvRecord.get("RedemptionAllowed"),
	    	             csvRecord.get("RedemptionTransactionMode"),
	    	             csvRecord.get("MinimumRedemptionQty"),
	    	             csvRecord.get("RedemptionQtyMultiplier"),
	    	             csvRecord.get("MaximumRedemptionQty"),
	    	             csvRecord.get("RedemptionAmountMinimum"),
	    	             csvRecord.get("RedemptionAmountMaximum"),
	    	             csvRecord.get("RedemptionAmountMultiple"),
	    	             csvRecord.get("RedemptionCutoffTime"),
	    	             csvRecord.get("RTAAgentCode"),
	    	             csvRecord.get("AMCActiveFlag"),
	    	             csvRecord.get("DividendReinvestmentFlag"),
	    	             csvRecord.get("SIPFLAG"),
	    	             csvRecord.get("STPFLAG"),
	    	             csvRecord.get("SWPFlag"),
	    	             csvRecord.get("SwitchFLAG"),
	    	             csvRecord.get("SETTLEMENTTYPE"),
	    	             csvRecord.get("AMCIND"),
	    	             csvRecord.get("FaceValue"),
	    	             csvRecord.get("StartDate"),
	    	             csvRecord.get("EndDate"),
	    	             csvRecord.get("ExitLoadFlag"),
	    	             csvRecord.get("ExitLoad"),
	    	             csvRecord.get("LockinPeriodFlag"),
	    	             csvRecord.get("LockinPeriod"),
	    	             csvRecord.get("ChannelPartnerCode"),
	    	             csvRecord.get("ReOpeningDate")
	            );

	    	  developerTutorialList.add(mfEntity);
	      }

	      return developerTutorialList;
	    } catch (IOException e) {
	      throw new RuntimeException("fail to parse CSV file: " + e.getMessage());
	    }
	  }

	  public static ByteArrayInputStream tutorialsToCSV(List<MFEntity> mfEntities) {
	    final CSVFormat format = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.MINIMAL);

	    try (ByteArrayOutputStream out = new ByteArrayOutputStream();
	        CSVPrinter csvPrinter = new CSVPrinter(new PrintWriter(out), format);) {
	      for (MFEntity mfEntity : mfEntities) {
	        List<String> data = Arrays.asList(
	              String.valueOf(mfEntity.getUniqueNo()),
	              mfEntity.getSchemeCode(),
 	             mfEntity.getRTASchemeCode(),
 	             mfEntity.getAMCSchemeCode(),
 	             mfEntity.getISIN(),
 	             mfEntity.getAMCCode(),
 	             mfEntity.getSchemeType(),
 	             mfEntity.getSchemePlan(),
 	             mfEntity.getSchemeName(),
 	             mfEntity.getPurchaseAllowed(),
 	             mfEntity.getPurchaseTransactionMode(),
 	             mfEntity.getMinimumPurchaseAmount(),
 	             mfEntity.getAdditionalPurchaseAmount(),
 	             mfEntity.getMaximumPurchaseAmount(),
 	             mfEntity.getPurchaseAmountMultiplier(),
 	             mfEntity.getPurchaseCutoffTime(),
 	             mfEntity.getRedemptionAllowed(),
 	             mfEntity.getRedemptionTransactionMode(),
 	             mfEntity.getMinimumRedemptionQty(),
 	             mfEntity.getRedemptionQtyMultiplier(),
 	             mfEntity.getMaximumRedemptionQty(),
 	             mfEntity.getRedemptionAmountMinimum(),
 	             mfEntity.getRedemptionAmountMaximum(),
 	             mfEntity.getRedemptionAmountMultiple(),
 	             mfEntity.getRedemptionCutoffTime(),
 	             mfEntity.getRTAAgentCode(),
 	             mfEntity.getAMCActiveFlag(),
 	             mfEntity.getDividendReinvestmentFlag(),
 	             mfEntity.getSIPFLAG(),
 	             mfEntity.getSTPFLAG(),
 	             mfEntity.getSWPFlag(),
 	             mfEntity.getSwitchFLAG(),
 	             mfEntity.getSETTLEMENTTYPE(),
 	             mfEntity.getAMCIND(),
 	             mfEntity.getFaceValue(),
 	             mfEntity.getStartDate(),
 	             mfEntity.getEndDate(),
 	             mfEntity.getExitLoadFlag(),
 	             mfEntity.getExitLoad(),
 	             mfEntity.getLockinPeriodFlag(),
 	             mfEntity.getLockinPeriod(),
 	             mfEntity.getChannelPartnerCode(),
 	             mfEntity.getReOpeningDate()
	              //String.valueOf(mfEntity.isPublished())
	            );

	        csvPrinter.printRecord(data);
	      }

	      csvPrinter.flush();
	      return new ByteArrayInputStream(out.toByteArray());
	    } catch (IOException e) {
	      throw new RuntimeException("fail to import data to CSV file: " + e.getMessage());
	    }
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static String TYPE = "text/csv";
//	  static String[] HEADERs = { "Id", "Title", "Description", "Published" };
//
//	  public static boolean hasCSVFormat(MultipartFile file) {
//	    if (TYPE.equals(file.getContentType())
//	    		|| file.getContentType().equals("application/vnd.ms-excel")) {
//	      return true;
//	    }
//
//	    return false;
//	  }
//
//	  public static List<MFEntity> csvToTutorials(InputStream is) {
//	    try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
//	        CSVParser csvParser = new CSVParser(fileReader,
//	            CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());) {
//
//	      List<MFEntity> developerTutorialList = new ArrayList<>();
//
//	      Iterable<CSVRecord> csvRecords = csvParser.getRecords();
//
//	      for (CSVRecord csvRecord : csvRecords) {
//	    	  MFEntity mfEntity = new MFEntity(
//	              Long.parseLong(csvRecord.get("Id")),
//	              csvRecord.get("Title"),
//	              csvRecord.get("Description"),
//	              Boolean.parseBoolean(csvRecord.get("Published"))
//	            );
//
//	    	  developerTutorialList.add(mfEntity);
//	      }
//
//	      return developerTutorialList;
//	    } catch (IOException e) {
//	      throw new RuntimeException("fail to parse CSV file: " + e.getMessage());
//	    }
//	  }
//
//	  public static ByteArrayInputStream tutorialsToCSV(List<MFEntity> mfEntities) {
//	    final CSVFormat format = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.MINIMAL);
//
//	    try (ByteArrayOutputStream out = new ByteArrayOutputStream();
//	        CSVPrinter csvPrinter = new CSVPrinter(new PrintWriter(out), format);) {
//	      for (MFEntity mfEntity : mfEntities) {
//	        List<String> data = Arrays.asList(
//	              String.valueOf(mfEntity.getId()),
//	              mfEntity.getTitle(),
//	              mfEntity.getDescription(),
//	              String.valueOf(mfEntity.isPublished())
//	            );
//
//	        csvPrinter.printRecord(data);
//	      }
//
//	      csvPrinter.flush();
//	      return new ByteArrayInputStream(out.toByteArray());
//	    } catch (IOException e) {
//	      throw new RuntimeException("fail to import data to CSV file: " + e.getMessage());
//	    }
//	  }
}
