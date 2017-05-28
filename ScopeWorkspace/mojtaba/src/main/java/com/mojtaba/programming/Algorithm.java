package com.mojtaba.programming;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Moji
 *
 */
public class Algorithm {

	/**
	 *
	 * @param input
	 *            list of sessions with the length, read more
	 *            {@linkplain TalkEntity}
	 * @param session
	 *            the length of session
	 * @return sorted and arranged list of Talks
	 */
	public static List<TalkEntity> timeSlice(List<TalkEntity> input, int session) {
		input.sort((TalkEntity o1, TalkEntity o2) -> o2.getLength() - o1.getLength());

		final List<TalkEntity> temp = new ArrayList<>();

		for (int i = 0; i < input.size(); i++) {
			if (session >= 5 && session >= (input.get(i).getLength())) {
				temp.add(input.get(i));
				session -= (input.get(i).getLength());
				input.remove(i);
				i = 0;
			}
		}
		if (session >= (input.get(0).getLength())) {
			temp.add(input.get(0));
		}

		return temp;
	}

}
