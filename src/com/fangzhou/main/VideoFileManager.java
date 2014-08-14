package com.fangzhou.main;

import java.io.File;

import com.fangzhou.annotation.Learn;

public interface VideoFileManager {
	
	@Learn (features={"getName","getContentType","getReturnVal"})
	public File getPath(Video v);
	
}
