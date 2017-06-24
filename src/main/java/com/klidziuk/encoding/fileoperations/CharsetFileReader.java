package com.klidziuk.encoding.fileoperations;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.Map;

import org.apache.log4j.Logger;

import com.klidziuk.encoding.enums.PathEnum;

/**
 * @author Pavel_Klindziuk
 * Read files from specified directories
 * with specified charset readers
 * using java.nio.SimpleFileReader<T>
 */
public class CharsetFileReader {
	private static final Logger logger = Logger.getLogger(CharsetFileReader.class);
	private Path directory;

	public void readFilesWithDifferentCharsets() {
		for (Map.Entry<Path, Charset> entry : PathEnum.charsetMap.entrySet()) {
			try {
				directory = entry.getKey().toAbsolutePath().toRealPath(LinkOption.NOFOLLOW_LINKS);
				FileVisitor visitor = new FileVisitor();
				visitor.setCharset(entry.getValue());
				Files.walkFileTree(directory, visitor);
				logger.info(" ");
			} catch (NoSuchFileException nsfex) {
				logger.error("Unfortunately \"" + directory + "\" does not exists");
			} catch (IOException ioex) {
				ioex.printStackTrace();
			}
		}
	}
}
