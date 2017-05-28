package com.mojtaba.programming;

/**
 * Talk time entity
 * @author Moji
 *
 */
public class TalkEntity {
	private String title;
	private int length;

	public TalkEntity(String title, int length) {
		this.title = title;
		this.length = length;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "TalkEntity{" + "title='" + title + '\'' + ", length=" + length + '}';
	}
}
