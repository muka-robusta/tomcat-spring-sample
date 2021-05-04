package com.onetwostory.simpletomcatanalyticssample.manager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class DataChunkFileManager {

  private static volatile byte[] dataChunk;
  private static final String chunkFileName = "1024bytes";
  private static final int size = 1024;

  private DataChunkFileManager() {}

  public static byte[] getDataChunk() {
    if (dataChunk == null) {
      synchronized (DataChunkFileManager.class) {
        if (dataChunk == null) {

          dataChunk = new byte[size];

          try {
            dataChunk = Files.readAllBytes(Path.of(chunkFileName));
          } catch (IOException e) {
            e.printStackTrace();
          }

          log.info(String.format("Fetched %s bytes", size));

        }
      }
    }

    return dataChunk;
  }

}
