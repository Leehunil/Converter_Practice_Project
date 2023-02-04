package hello.typeconverter.converter;

import hello.typeconverter.type.IpPort;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ConverterTest {

    @Test
    void stringToInteger(){
        StringToIntegerConverter converter = new StringToIntegerConverter();
        Integer result = converter.convert("10");
        assertThat(result).isEqualTo(10);
    }

    @Test
    void IntegerToString(){
        IntegerToStringConverter converter = new IntegerToStringConverter();
        String result = converter.convert(10);
        assertThat(result).isEqualTo("10");
    }

    @Test
    void IpPortToString(){
        IpPortToStringConverter convert = new IpPortToStringConverter();
        IpPort source = new IpPort("127.0.0.1", 8080);
        String result = convert.convert(source);
        assertThat(result).isEqualTo("127.0.0.1:8080");
    }

    @Test
    void StringToIpPort(){
        StringToIpPortConverter convert = new StringToIpPortConverter();
        String source = "127.0.0.1:8080";
        IpPort result = convert.convert(source);
        assertThat(result).isEqualTo(new IpPort("127.0.0.1",8080));
    }
}
