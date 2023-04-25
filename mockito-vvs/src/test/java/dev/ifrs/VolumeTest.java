package dev.ifrs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
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
    // Realizando uma chamada para o método maximizeVolume do objeto VolumeUtil
    volume.maximizeVolume(100);
    // Verificando se o método setVolume foi chamado uma única vez
    Mockito.verify(audio, Mockito.times(1)).setVolume(Mockito.anyInt());
}
}
