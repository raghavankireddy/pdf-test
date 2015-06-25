package com.codeborne.pdftest;

import com.codeborne.pdftest.matchers.ContainsText;
import org.hamcrest.Matcher;

public class PDFMatchers {
  public static Matcher<PDF> containsText(String text) {
    return new ContainsText(text);
  }
}
