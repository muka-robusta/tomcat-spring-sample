package com.onetwostory.simpletomcatanalyticssample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.metrics.export.prometheus.EnablePrometheusMetrics;

@SpringBootApplication
// @EnablePrometheusMetrics
public class SimpleTomcatAnalyticsSampleApplication {

  public static void main(String[] args) {
    SpringApplication.run(SimpleTomcatAnalyticsSampleApplication.class, args);
  }

}
