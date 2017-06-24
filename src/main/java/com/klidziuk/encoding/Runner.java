package com.klidziuk.encoding;

import com.klidziuk.encoding.fileoperations.CharsetFileReader;

public class Runner {
	public static void main(String[] args) {
		new CharsetFileReader().readFilesWithDifferentCharsets();
	}
}
