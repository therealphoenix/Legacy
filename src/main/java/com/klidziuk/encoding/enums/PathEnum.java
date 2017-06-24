package com.klidziuk.encoding.enums;

import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;


/**
 * @author Pavel_Klindziuk
 * Enum of paths with static initialization 
 * hashmap of paths and charsets
 */
public enum PathEnum {
	 
	CHARSET_886_FOLDERPATH(Paths.get("encoding/866")),
	CHARSET_CP1251_FOLDERPATH(Paths.get("encoding/cp1251")),
	CHARSET_UTF8_FOLDERPATH(Paths.get("encoding/utf-8")),
	CHARSET_UTF16BE_FOLDERPATH(Paths.get("encoding/utf16be")),
	CHARSET_UTF16LE_FOLDERPATH(Paths.get("encoding/utf16le")),
	CHARSET_UTF32BE_FOLDERPATH(Paths.get("encoding/utf32be")),
	CHARSET_UTF32LE_FOLDERPATH(Paths.get("encoding/utf32le"));
	
 public static HashMap<Path, Charset> charsetMap;
	 
	 static {
	        charsetMap = new HashMap<>();
	        charsetMap.put(CHARSET_886_FOLDERPATH.path, CharsetEnum.CP866.charset);
	        charsetMap.put(CHARSET_UTF8_FOLDERPATH.path, CharsetEnum.UTF_8.charset);
	        charsetMap.put(CHARSET_UTF16BE_FOLDERPATH.path, CharsetEnum.UTF_16BE.charset);
	        charsetMap.put(CHARSET_UTF16LE_FOLDERPATH.path, CharsetEnum.UTF_16LE.charset);
	        charsetMap.put(CHARSET_UTF32BE_FOLDERPATH.path, CharsetEnum.UTF_32BE.charset);
	        charsetMap.put(CHARSET_UTF32LE_FOLDERPATH.path, CharsetEnum.UTF_32LE.charset);
	        charsetMap.put(CHARSET_CP1251_FOLDERPATH.path, CharsetEnum.WINDOWS_1251.charset);
	    }
	 
	Path path;
	PathEnum(Path path) {
	        this.path = path;
	    }
}







