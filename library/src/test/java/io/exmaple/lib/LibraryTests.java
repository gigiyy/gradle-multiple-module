package io.exmaple.lib;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;


public class LibraryTests implements WithAssertions{
    @Test
    void testLibrary() {
        assertThat(1 + 2).isEqualTo(3);
    }
}
