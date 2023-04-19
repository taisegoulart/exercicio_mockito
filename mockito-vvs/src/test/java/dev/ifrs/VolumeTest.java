package dev.ifrs;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class VolumeTest {
    
    // Criando um mock da classe AudioManager
@Mock
AudioManager audio;
    // Injetando um mock da classe VolumeUtil
    @InjectMocks
    VolumeUtil volume;

@Test
public void testAudioManagerSetVolume() {
    // TODO Realizando uma chamada para o método maximizeVolume do objeto VolumeUtil

    // TODO Verificando se o método setVolume foi chamado uma única vez --> usar assert
}
}
