package com.klidziuk.encoding.enums;

import java.nio.charset.Charset;

/**
 * @author Pavel_Klindziuk
 * Enum of supported charsets
 */
public enum CharsetEnum {

	 CP866(Charset.forName("CP866")),
	 UTF_8(Charset.forName("UTF-8")),
	 UTF_16BE(Charset.forName("UTF-16BE")),
	 UTF_16LE(Charset.forName("UTF-16LE")),
	 UTF_32BE(Charset.forName("UTF-32BE")),
	 UTF_32LE(Charset.forName("UTF-32LE")),
	 WINDOWS_1251(Charset.forName("windows-1251"));
	 
	 Charset charset;
	
	 CharsetEnum(Charset charset) {
	        this.charset = charset;
	    }
}







