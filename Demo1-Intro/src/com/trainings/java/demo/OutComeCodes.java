package com.trainings.java.demo;

public enum OutComeCodes {

	OUTBOUND(Constants.OUTBOUNDCODE),
	INBOUND("I"),
	REPRICE("R");
	
	private String code;
	
	OutComeCodes(String code){
		this.code = code;
		System.out.println(code);
	}
	
	public static OutComeCodes forCode(String code) {
		for(OutComeCodes acode: values()) {
			if(acode.getCode().equals(code)) {
				return acode;
			}
		}
		return null;
	}
	private String getCode() {
		return code;
	}

	public static void main(String[] args) {
//		String code = OutComeCodes.Constants.OUTBOUNDCODE;
//		OutComeCodes out = OutComeCodes.REPRICE;
//		System.out.println("code: "+code);
//		System.out.println("ValueOf: "+OutComeCodes.valueOf("REPRICE"));
		
		System.out.println("check: "+ OutComeCodes.forCode("I"));
	}
	
	public static class Constants{
		public static String OUTBOUNDCODE="O";
	}
}


