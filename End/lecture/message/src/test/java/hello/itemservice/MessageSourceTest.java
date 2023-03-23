package hello.itemservice;


import static org.assertj.core.api.Assertions.*;

import java.awt.print.Pageable;
import java.util.Locale;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;

@SpringBootTest
public class MessageSourceTest {

  @Autowired
  MessageSource messageSource;
  @Test
  void helloMessage(){
    String hello = messageSource.getMessage("hello", null, null);
    assertThat(hello).isEqualTo("??");
  }

  @Test
  void notFoundMessageCode(){
    assertThatThrownBy(() -> messageSource.getMessage("no_code", null, null))
        .isInstanceOf(NoSuchMessageException.class);
  }

  @Test
  void notFoundDefaultMessageCode(){
    String message = messageSource.getMessage("no_code", null, "기본 메시지", null);
    assertThat(message).isEqualTo("기본 메시지");
  }

  @Test
  void argMessage(){
    String message = messageSource.getMessage("hello.name", new Object[]{"Spring"}, null);
    assertThat(message).isEqualTo("?? Spring");
  }

  @Test
  void defaultLang(){
    assertThat(messageSource.getMessage("hello", null, null)).isEqualTo("??");
    assertThat(messageSource.getMessage("hello", null, Locale.KOREA)).isEqualTo("??");
  }

  @Test
  void changeLang(){
    assertThat(messageSource.getMessage("hello", null, Locale.ENGLISH)).isEqualTo("hello");
    assertThat(messageSource.getMessage("hello.name", new Object[]{"spring"}, Locale.ENGLISH)).isEqualTo("hello spring");
  }
}

