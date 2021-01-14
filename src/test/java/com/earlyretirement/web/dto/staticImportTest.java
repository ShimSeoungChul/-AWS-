package com.earlyretirement.web.dto;

import  org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class staticImportTest {
    @Test
    void nonStaticImport(){
        int one = 1;
        Assertions.assertThat(one).isEqualTo(1);
    }

    @Test
    void staticImport(){
        int one = 1;
        assertThat(one).isEqualTo(1);
    }
}
