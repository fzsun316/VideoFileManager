package com.fangzhou.main;

import java.io.File;

public class VideoFileManagerImpl implements VideoFileManager {

	@Override
	public File getPath(Video v) {
		return new File("videos/"+v.getName());
	}

}
