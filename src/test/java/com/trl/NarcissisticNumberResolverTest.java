package com.trl;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class NarcissisticNumberResolverTest {

	@ParameterizedTest
	@MethodSource("provideResults")
	void isNarcissisticNumber(final int number, final boolean isNarcissistic) {
		assertThat(NarcissisticNumberResolver.isNumberNarcissistic(number)).isEqualTo(isNarcissistic);
	}

	private static Stream<Arguments> provideResults() {
		return Stream.of(
			Arguments.of("153", true),
			Arguments.of(1634, true),
			Arguments.of(112, false),
			Arguments.of(123456789, false)
		);
	}
}
