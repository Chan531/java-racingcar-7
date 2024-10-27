package racingcar.model.output;

import java.util.List;

public class WinnerResultGenerator {

	private static final int SINGLE_WINNER_COUNT = 1;
	private static final String SEPARATOR = ", ";

	public static String generateWinnerResult(List<String> winners) {
		if (winners.size() > SINGLE_WINNER_COUNT) {
			return generateJointWinnersResult(winners);
		}
		return winners.getFirst();
	}

	private static String generateJointWinnersResult(List<String> winners) {
		return String.join(SEPARATOR, winners);
	}
}
