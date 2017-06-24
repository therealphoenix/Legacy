package com.klidziuk.encoding.fileoperations;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.MalformedInputException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

import org.apache.log4j.Logger;

import com.klidziuk.encoding.enums.ExtensionEnum;

/*
 *  A simple visitor of files
 */
public class FileVisitor extends SimpleFileVisitor<Path> {
	private static final Logger logger = Logger.getLogger(FileVisitor.class);
	private static final String BAD_FILE_EXTENSION_MESSAGE = "Bad file extension for file \"";
	private static final String EXCEPTION_MESSAGE = "Cannot read extension from this file path.";
	private static final int VALID_EXTENSION_SIZE = 3;
	private Charset charset;

	/*
	 * read files in current directory and with specified charset reader
	 * 
	 * @ param Path file
	 * @ param BasicFileAttributes attr
	 */
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		if (attrs.isRegularFile() && checkFileXtension(file.getFileName().toString())) {
			logger.info("Reading file: " + file.getFileName());
			try (BufferedReader reader = Files.newBufferedReader(file, charset)) {
				String line = null;
				while ((line = reader.readLine()) != null) {
					logger.info(line);
				}
			} catch (MalformedInputException mfiex) {
				logger.error("Encording " + charset + " is not suitable for file " + file.getFileName());
			}
			catch (IllegalArgumentException ieax) {
				logger.error(ieax.getMessage());
			}
		}
		return FileVisitResult.CONTINUE;
	}

	/*
	 * @see java.nio.file.SimpleFileVisitor#preVisitDirectory(java.lang.Object,
	 * java.nio.file.attribute.BasicFileAttributes)
	 */
	@Override
	public FileVisitResult preVisitDirectory(Path arg0, BasicFileAttributes arg1) throws IOException {
		logger.info("Reading files from \"" + arg0.toAbsolutePath().toRealPath(LinkOption.NOFOLLOW_LINKS)
				+ "\" directory with \"" + charset + "\" encording.");
		return FileVisitResult.CONTINUE;
	}

	public void setCharset(Charset charset) {
		this.charset = charset;
	}

	
	/**
	 * checking file extension
	 * @param fileName
	 * @return result of matching with available extensions
	 * @throws IllegalArgumentException
	 */
	private boolean checkFileXtension(String fileName) throws IllegalArgumentException {
		if(null == fileName || fileName.isEmpty()){
			throw new IllegalArgumentException(EXCEPTION_MESSAGE); 
		}
		try {
			String extension = cutFileExtension(fileName);
			for(ExtensionEnum enumExtension : ExtensionEnum.values())
			if (extension.equals(enumExtension.getExtension())) {
				return true;
			}
		} catch (IllegalArgumentException ieax) {
			logger.error(ieax.getMessage());
		}
		return false;
	}
	
	/**
	 * cut extension from file
	 * @param fileName
	 * @return file extension
	 */
	private String cutFileExtension(String fileName) throws IllegalArgumentException{
		if(null == fileName || fileName.isEmpty()){
			throw new IllegalArgumentException(EXCEPTION_MESSAGE); 
		}
		int extensionSize = fileName.lastIndexOf('.');
			if (VALID_EXTENSION_SIZE != fileName.substring(extensionSize + 1).length() ) {
			throw new IllegalArgumentException(BAD_FILE_EXTENSION_MESSAGE + fileName + "\"");
		}
		return fileName.substring(extensionSize + 1);
	}
}