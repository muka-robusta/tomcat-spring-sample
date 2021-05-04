package com.onetwostory.simpletomcatanalyticssample.manager;

import java.util.Random;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DataChunkGenerationManager {

  public byte[] generateFixedSizeDataChunk(int size) {
    byte[] fixedSizeBytesArray = new byte[size];
    new Random().nextBytes(fixedSizeBytesArray);
    return fixedSizeBytesArray;
  }

}
