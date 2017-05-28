package com.mojtaba.programming;

import org.junit.Ignore;
import org.junit.Test;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

/**
 * 
 * @author Moji
 *
 */
public class AlgorithmTest {

	/**
	 * coded data
	 * 
	 * @return list of {@link TalkEntity}
	 */
	private List<TalkEntity> getTestData() {
		List<TalkEntity> input = new ArrayList<>();
		input.add(new TalkEntity("a", 60));
		input.add(new TalkEntity("b", 45));
		input.add(new TalkEntity("c", 30));
		input.add(new TalkEntity("d", 45));
		input.add(new TalkEntity("e", 45));
		input.add(new TalkEntity("lightning", 5));
		input.add(new TalkEntity("g", 60));
		input.add(new TalkEntity("h", 45));
		input.add(new TalkEntity("i", 30));
		input.add(new TalkEntity("j", 30));
		input.add(new TalkEntity("k", 45));
		input.add(new TalkEntity("l", 60));
		input.add(new TalkEntity("m", 60));
		input.add(new TalkEntity("n", 45));
		input.add(new TalkEntity("o", 30));
		input.add(new TalkEntity("p", 30));
		input.add(new TalkEntity("q", 60));
		input.add(new TalkEntity("r", 30));
		input.add(new TalkEntity("s", 30));

		return input;
	}

	/**
	 * read from file
	 * 
	 * @return list of {@link TalkEntity}
	 */
	private List<TalkEntity> getTestDataFromFile() {
		final String fileName = "src/test/resources/input-one.txt";
		final List<TalkEntity> talkEntities = new ArrayList<>();

		List<String> lines = new ArrayList<>();
		// read file into stream, try-with-resources
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
			lines = stream.collect(Collectors.toList());
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (final String line : lines) {
			final String[] splitValue = line.split("(\\w.min|lightning)");
			if (line.endsWith("lightning")) {
				talkEntities.add(new TalkEntity(splitValue[0], 5));
			} else {
				talkEntities.add(new TalkEntity(splitValue[0],
						Integer.valueOf(line.substring(line.lastIndexOf(" ") + 1).replace("min", ""))));
			}
		}

		// System.out.println("talkEntities from file = " + talkEntities);
		return talkEntities;
	}

	/**
	 * test for coded data
	 */
	@Ignore
	@Test
	public void getMorningSessions() {
		List<TalkEntity> talkEntities = Algorithm.timeSlice(getTestData(), 180);

		int totalLength = 0;
		for (TalkEntity talk : talkEntities) {
			totalLength += talk.getLength();
		}

		assertEquals(180, totalLength);
		System.out.println("talkEntities = " + talkEntities);
	}

	/**
	 * gets data from file and generates talk times as output 
	 */
	@Test
	public void getSessionsFromFile() {
		// gets entities from file
		List<TalkEntity> input = getTestDataFromFile();
		List<TalkEntity> output = new ArrayList<>();

		// run first morning session
		List<TalkEntity> talkEntitiesMorning1 = getSession(input, 180);
		output.add(new TalkEntity("Track1:", 0));
		output.addAll(talkEntitiesMorning1);

		// first day lunch break
		output.add(new TalkEntity("Lunch", 60));

		// run first afternoon session
		List<TalkEntity> talkEntitiesAfter1 = getSession(input, 240);
		output.addAll(talkEntitiesAfter1);

		// first day Meeting
		output.add(new TalkEntity("Meet Your Colleagues Event", 60));

		// run second morning session
		output.add(new TalkEntity("Track2:", 0));
		List<TalkEntity> talkEntitiesMorning2 = getSession(input, 180);
		output.addAll(talkEntitiesMorning2);

		// second day lunch break
		output.add(new TalkEntity("Lunch", 60));

		// run second afternoon session
		List<TalkEntity> talkEntitiesAfter2 = getSession(input, 240);
		output.addAll(talkEntitiesAfter2);

		// second day Meeting
		output.add(new TalkEntity("Meet Your Colleagues Event", 60));

		//print out
		for (int i = 0; i < output.size(); i++) {
			System.out.println(output.get(i).getTitle() + " "
					+ (output.get(i).getLength() > 0 ? output.get(i).getLength() + "min" : ""));
		}
	}

	/**
	 * gets input list and session time and returns talk entities
	 * asserts sum of talk time not more than session time given in input
	 * @param input
	 * @param session
	 * @return list of {@link TalkEntity}
	 */
	private List<TalkEntity> getSession(List<TalkEntity> input, int session) {
		List<TalkEntity> talkEntitiesInSession = Algorithm.timeSlice(input, session);
		int totalLengthMorning1 = 0;
		for (TalkEntity talk : talkEntitiesInSession) {
			totalLengthMorning1 += talk.getLength();
			input.remove(talk);
		}
		assertTrue(session >= totalLengthMorning1);
		return talkEntitiesInSession;
	}
}