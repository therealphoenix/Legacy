package com.klidziuk.encoding.enums;

/**
 * @author Pavel_Klindziuk
 * Enum of supported file extensions
 */
public enum ExtensionEnum {
	 TXT("txt"),
	 LOG("log"),
	 RTF("rtf");
		 
	 String extension;
	
	 public String getExtension() {
		return extension;
	}

	ExtensionEnum(String extension) {
	        this.extension = extension;
	    }
}
