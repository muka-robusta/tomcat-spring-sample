package com.onetwostory.simpletomcatanalyticssample.controller;

import com.onetwostory.simpletomcatanalyticssample.manager.DataChunkGenerationManager;
import java.io.IOException;
import lombok.RequiredArgsConstructor;
import org.springframework.metrics.annotation.Timed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/file-api")
@Timed
public class SampleController {

  private final DataChunkGenerationManager dataChunkGenerationManager;

  @GetMapping(value = "/{returnFileSize}",
      produces = "text/plain")
  public @ResponseBody byte[] processRequestWithFixedFileSizeAndLatency(
      @PathVariable("returnFileSize") Integer dataSize) {

    try { Thread.sleep(100); }
    catch (InterruptedException ex) { ex.printStackTrace(); }

    return dataChunkGenerationManager.generateFixedSizeDataChunk(dataSize);

  }

}
