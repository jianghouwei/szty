package com.szty.wxyd.msg.model;

/**
 * 音乐消息 响应消息之音乐消息
 * 
 * @ClassName: MusicMessage
 * @Description: TODO()
 * @author mao.ru
 * @date 2016年1月13日 上午9:44:20
 *
 */
public class MusicMessage extends BaseMessage {
	// 音乐
	private Music Music;

	public Music getMusic() {
		return Music;
	}

	public void setMusic(Music music) {
		Music = music;
	}
}
