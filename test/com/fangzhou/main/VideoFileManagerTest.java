package com.fangzhou.main;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fangzhou.main.VideoFileManager;
import com.fangzhou.main.VideoFileManagerImpl;
import com.fangzhou.proxy.ProxyFactory;
import com.fangzhou.main.Video;

public class VideoFileManagerTest {

//	@Safe
	@Test
	public void testExampleSafe() {
		VideoFileManager manager = (VideoFileManager)ProxyFactory.newInstance(new VideoFileManagerImpl(), "Safe");
		Video video = new Video("Star Wars", "video/mpeg", "/applications/video_server_starwars.mpg");
		
		manager.getPath(video);
	}

//	@Unsafe
	@Test
	public void testExampleUnsafe() {
		VideoFileManager manager = (VideoFileManager)ProxyFactory.newInstance(new VideoFileManagerImpl(), "Unsafe");
		Video video = new Video("Star Wars", "video/mpeg", "../..etc/passwd");
		
		manager.getPath(video);
	}
}
